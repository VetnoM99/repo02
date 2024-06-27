package com.example.service;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;

@Service
public class UserService{
	
	@Autowired
	 private JdbcTemplate jdbcTemplate;
	
	   public List<Map<String, Object>> getAllUsers() {
	        String sql = "SELECT * FROM users";
	        return jdbcTemplate.queryForList(sql);
	    }

	    public Map<String, Object> getUserById(int id) {
	        String sql = "SELECT * FROM users WHERE id = ?";
	        return jdbcTemplate.queryForMap(sql, id);
	    }
}