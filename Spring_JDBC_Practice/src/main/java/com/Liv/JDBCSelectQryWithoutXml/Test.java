package com.Liv.JDBCSelectQryWithoutXml;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.Liv.JDBCSelectQryWithoutXml.UserEntity;
import com.Liv.JDBCSelectQryWithoutXml.SelectDAO_Impl;

public class Test {
	
	public static void main(String[] args) {
	// create JDBCTemplate and DrivermanagerDataSour
		
	
	ApplicationContext cxt= new AnnotationConfigApplicationContext(ConfigClass.class);
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