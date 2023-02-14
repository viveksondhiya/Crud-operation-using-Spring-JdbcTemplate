package com.spring.jdbc;

import javax.sql.DataSource;

import org.springframework.context.annotation.Bean;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

import com.spring.jdbc.dao.StudentDao;
import com.spring.jdbc.dao.StudentDaoImpl;

public class JdbcConfig {
    @Bean(name= {"ds"})
	public DataSource getdataSource() {
		DriverManagerDataSource ds=new DriverManagerDataSource();
		ds.setDriverClassName("com.mysql.cj.jdbc.Driver");
		ds.setUrl("jdbc:mysql://localhost:3306/springjdbc");
		ds.setUsername("root");
		ds.setPassword("root");
		return ds;
	}
    
    @Bean(name = {"jdbcTemplate"})
    public JdbcTemplate getTemplte() {
    	JdbcTemplate jdbcTemplate=new JdbcTemplate();
    	jdbcTemplate.setDataSource(getdataSource());
    	return jdbcTemplate;
    }
    
    @Bean(name= {"studentDao"})
    public StudentDao getStudentDao() {
    	StudentDaoImpl studentDao=new StudentDaoImpl();
    	studentDao.setJdbcTemplate(getTemplte());
    	return studentDao;
    }
	
}
