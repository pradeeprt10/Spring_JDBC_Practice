package com.Lib.JDBC_DAO;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

import com.Lib.Enity_Class_User.User;

public class TestClass {

	 public static void main( String[] args )
	    {
	ApplicationContext cxt= new ClassPathXmlApplicationContext("com/Lib/JDBC_DAO/config.xml");
	JDBC_Interface_DAO jdbcobj  = cxt.getBean("DaoBean",JDBC_Interface_DAO.class);
	
  User s= new User();
   s.setId(112);
   s.setName("KKK");
   int y = jdbcobj.insert(s);
   System.out.println(y);
}
}
