package com.Liv.JDBCSelectQryWithoutXml;

import java.util.List;

import com.Liv.JDBCSelectQryWithoutXml.UserEntity;

public interface SelectDAO {

	public UserEntity selectQry(int id);
	public List<UserEntity> selectAllQry();
}