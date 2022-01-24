package com.Liv.JDBCSelectQryWithoutXml;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import com.Liv.JDBCSelectQryWithoutXml.RowMapperImpl;
import com.Liv.JDBCSelectQryWithoutXml.UserEntity;
@Component("user_DAO")
public class SelectDAO_Impl {
	@Autowired
	private JdbcTemplate tmp;
	String qry;
	int count;
	public JdbcTemplate getTmp() {
		return tmp;
	}

	public void setTmp(JdbcTemplate tmp) {
		this.tmp = tmp;
	}

	public UserEntity selectQry(int userid) {
	
		qry="select * from db.user where id=?";
		
		RowMapperImpl rowmapper = new RowMapperImpl();
		
		UserEntity usr =tmp.queryForObject(qry, rowmapper, userid);
		return usr;
	}

	public List<UserEntity> selectAllQry() {
		// TODO Auto-generated method stub
		qry="select *from db.user ";
		
		RowMapperImpl rowmapper = new RowMapperImpl();
		
		List<UserEntity> user = tmp.query(qry, rowmapper);	
		return user;
		
		
	}

	

}
