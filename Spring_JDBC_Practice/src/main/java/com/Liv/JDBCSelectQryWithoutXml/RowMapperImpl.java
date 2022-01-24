package com.Liv.JDBCSelectQryWithoutXml;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.Liv.JDBCSelectQryWithoutXml.UserEntity;

public class RowMapperImpl implements RowMapper<UserEntity> {

	public UserEntity mapRow(ResultSet rs, int rowNum) throws SQLException {
		
		UserEntity user = new UserEntity();
		user.setId(rs.getInt(1));
		user.setName(rs.getString(2));
		return user;
	}

}
