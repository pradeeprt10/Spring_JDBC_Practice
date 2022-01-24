package com.Lib.JDBCSelectQry;

import java.util.List;

public interface SelectDAO {

	public UserEntity selectQry(int id);
	public List<UserEntity> selectAllQry();
}
