package com.Liv.JDBCSelectQryWithoutXml;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

@Configuration
@ComponentScan(basePackages = {"com.Liv.JDBCSelectQryWithoutXml"})
public class ConfigClass {
	@Bean(name = {"driver_manager_datasource_bean"})
	public DriverManagerDataSource getDrivermang() {
		DriverManagerDataSource dmanager = new DriverManagerDataSource();
		dmanager.setUrl("jdbc:mysql://localhost:3306/db");
		dmanager.setUsername("root");
		dmanager.setPassword("password");
		dmanager.setDriverClassName("com.mysql.jdbc.Driver");
		return dmanager;
	}

	@Bean(name= {"tmp"})
	public JdbcTemplate getJdbcTemplate() {
		JdbcTemplate tmp = new JdbcTemplate();
		tmp.setDataSource(getDrivermang());
		return tmp;
	}

}

