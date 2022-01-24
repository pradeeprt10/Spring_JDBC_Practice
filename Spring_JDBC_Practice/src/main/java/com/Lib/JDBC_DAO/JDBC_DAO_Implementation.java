package com.Lib.JDBC_DAO;

import org.springframework.jdbc.core.JdbcTemplate;

import com.Lib.Enity_Class_User.User;

public class JDBC_DAO_Implementation implements JDBC_Interface_DAO {

 private  JdbcTemplate  jdbctempref;
 


	public JdbcTemplate getJdbctempref() {
	return jdbctempref;
}



public void setJdbctempref(JdbcTemplate jdbctempref) {
	this.jdbctempref = jdbctempref;
}



	public int insert(User user) {
		int x;
		String qry ="insert into db.user values(?,?)";
    	x=jdbctempref.update(qry,user.getId(),user.getName());	
		return x;
	}

}
