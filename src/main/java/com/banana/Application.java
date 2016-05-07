package com.banana;

import java.io.Console;
import java.util.List;

import org.springframework.boot.*;
import org.springframework.boot.autoconfigure.*;
import org.springframework.stereotype.*;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;  
import java.util.HashMap;  
import java.util.List;  
import java.util.ListIterator;  
import java.util.Map;  
  
import net.sf.json.JSONArray;
import net.sf.json.JSONObject;

import com.banana.*;

@RestController
@EnableAutoConfiguration
public class Application {

    @RequestMapping("/")
    String home() {
        return "Hello World!";
    }
    
    @RequestMapping("/getId")
    @ResponseBody
    public String getId(String value){
    	List<Map> a = DoConnect.getTestList();
    	JSONArray ja1 = JSONArray.fromObject(a);

        System.out.println("JSONArray对象数据格式：");
        System.out.println(ja1.toString());
    	
    	return ja1.toString();
    }
//    public String getByEmail(String email) {
//      String userId;
//      UserDao user = UserDao.findByEmail(email);
//      if (user != null) {
//        userId = String.valueOf(user.getId());
//        return "The user id is: " + userId;
//      }
//      return "user " + email + " is not exist.";
//    }

    public static void main(String[] args) throws Exception {
        SpringApplication.run(Application.class, args);
    }

}

