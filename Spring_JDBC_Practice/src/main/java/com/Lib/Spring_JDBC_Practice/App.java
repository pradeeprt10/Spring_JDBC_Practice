package com.Lib.Spring_JDBC_Practice;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	ApplicationContext cxt= new ClassPathXmlApplicationContext("com/Lib/Spring_JDBC_Practice/config.xml");
    	JdbcTemplate jdbcobj  = cxt.getBean("JdbcBean",JdbcTemplate.class);
    	String qry ="insert into db.user values(?,?)";
    	int x=jdbcobj.update(qry,106,"PKR6");
    	System.out.println(x);
    }
}
