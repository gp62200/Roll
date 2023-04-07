package tester;

import java.util.Scanner;

import dao.UserDaoImpl;

public class TestUser {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try(Scanner sc=new Scanner(System.in))
		{
			UserDaoImpl dao=new UserDaoImpl();
			System.out.println("Enter email and password");
			dao.getUserDetailsByPassAndEmailId(sc.next(),sc.next()).forEach(System.out::println);
		}catch(Exception e) {
			e.printStackTrace();
		}
	}

}
