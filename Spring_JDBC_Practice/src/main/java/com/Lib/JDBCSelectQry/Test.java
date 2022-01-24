package com.Lib.JDBCSelectQry;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.Lib.JDBC_Insert_Update_Delete.Enitity_User;
import com.Lib.JDBC_Insert_Update_Delete.UserDAO_Implementation;

public class Test {
	
	public static void main(String[] args) {
	// create JDBCTemplate and DrivermanagerDataSour
		
	
	ApplicationContext cxt= new ClassPathXmlApplicationContext("com/Lib/JDBCSelectQry/Configuration.xml");
	SelectDAO_Impl ref= cxt.getBean("user_DAO",SelectDAO_Impl.class);

	//Select  name from UserEntity for given UserID
	
	 UserEntity s1 = ref.selectQry(102); 
	  System.out.println(s1);
	 
	//Select all Fields from UserEntity
	  System.out.println("=====================");
	
	  List<UserEntity> user = ref.selectAllQry();
	 
	for(UserEntity s: user)	{ 
		System.out.println(s);
		}
	 
	
	
}

}