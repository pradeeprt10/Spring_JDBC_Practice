package com.Lib.JDBC_Insert_Update_Delete;

import org.springframework.jdbc.core.JdbcTemplate;

public class UserDAO_Implementation implements UserDAO {

 JdbcTemplate template;
 int count;
 
 String qry;
 
   public JdbcTemplate getTemplate() {
	return template;
}

public void setTemplate(JdbcTemplate template) {
	this.template = template;
}

	// Insert Logic	
	public int insert(Enitity_User user) {
		qry="insert into db.user values (?,?)";		
		count = template.update(qry,user.getId(),user.getName());
		return count;
	}
   
	// Update Logic	
		// TODO Auto-generated method stub
		public int update(Enitity_User user) {
		
			qry="update db.user set name=? where id=?";
			count = template.update(qry,user.getName(),user.getId());
		return count;
	}

	// delete Logic
	public int delete(Enitity_User user) {
		
		qry="delete from db.user where id=?";		
		count = template.update(qry,user.getId());
	
		return count;
	}

	
}
