package dao;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;


import pojos.User;
import static utils.DBUtils.openConnection;

public class UserDaoImpl implements IUserDao{
	private Connection connection;
	private PreparedStatement pst1;
	
	public UserDaoImpl() throws SQLException{
		connection =openConnection();
		String sql="select id,name,email,password,reg_amt,reg_date,role from users where email=? and password=? order by reg_amt";
		pst1=connection.prepareStatement(sql);
		System.out.println("user dao created..");
		
	}
	public List<User> getUserDetailsByPassAndEmailId(String emailId, String password) throws SQLException {
		List<User> users=new ArrayList<>();
		
		pst1.setString(1, emailId);
		pst1.setString(2, password);
		try(ResultSet rst=pst1.executeQuery())
		{
			
			while(rst.next())
				users.add(new User(rst.getInt(1), rst.getString(2),rst.getString(3),rst.getString(4), rst.getDouble(5),rst.getDate(6),rst.getString(7)));
			
		}
		return users;
	}
	//add clean up method for closing DB related resources
	public void cleanUp() throws SQLException	
	{
		if(pst1 != null)
			pst1.close();
		if(connection != null)
			connection.close();
		System.out.println("user dao cleaned up.....");
		
	}
	
	
}
