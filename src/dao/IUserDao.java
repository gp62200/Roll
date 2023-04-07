package dao;

import java.sql.SQLException;
import java.util.List;

import pojos.User;

public interface IUserDao {
	List<User> getUserDetailsByPassAndEmailId(String emailId,String password)throws SQLException;
}
