package com.banana;

import java.sql.ResultSet;

import java.sql.SQLException;


import com.banana.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Service;

import java.util.ArrayList;  
import java.util.HashMap;  
import java.util.List;  
import java.util.ListIterator;  
import java.util.Map;  
  
import net.sf.json.JSONArray;
import net.sf.json.JSONObject;

public class DoConnect {
	@Autowired
    private JdbcTemplate jdbcTemplate;
	
	public static List<Map> getTestList(){
		UserDao a = new UserDao();
		a.setDefaultValue(" i am a", "test1", "textc", 11);
  
        System.out.println(a.getUserData());
		UserDao b = new UserDao();
		b.setDefaultValue(" i am b", "test2", "text3", 121);
		System.out.println(b.getUserData());

		List<Map> dd = new ArrayList<Map>();
		dd.add(a.getUserData());
		dd.add(b.getUserData());
		return dd;
	}
	
	public List<UserDao> getList(){
        String sql = "SELECT *   FROM users";
        return (List<UserDao>) jdbcTemplate.query(sql, new RowMapper<UserDao>(){

            @Override
            public UserDao mapRow(ResultSet rs, int rowNum) throws SQLException {
            	UserDao stu = new UserDao();
                
                return stu;
            }

        });
    }
}
