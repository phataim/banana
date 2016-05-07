package com.banana;

import java.io.Serializable;
import java.util.ArrayList;  
import java.util.HashMap;  
import java.util.List;  
import java.util.ListIterator;  
import java.util.Map;  



public class UserDao implements Serializable{

    public static final long serialVersionUID = 2120869894112984147L;

    public int id;
    public String name;
    public String sumScore;
    public String avgScore;
    public int age;
    
    public void setDefaultValue(String name,String sumScore,String avgScore,int age) {
		this.id=11111;
		this.name=name;
		this.sumScore=sumScore;
		this.avgScore=avgScore;
		this.age=age;
	}
    
    public Map getUserData(){
    	Map map = new HashMap();
    	map.put("id",this.id);
    	map.put("name",this.name);
    	map.put("sumScore",this.sumScore);
    	map.put("avgScore",this.avgScore);
    	map.put("age",this.age);
    	return map;
    }

    // 节省文章长度，get set 方法省略
}