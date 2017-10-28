package com.provide.provideImpl;

import java.util.ArrayList;
import java.util.List;

import com.provide.ProvideInteface;
import com.provide.entity.User;
//提供方实现类
public class ProvideImpl implements ProvideInteface{


	public List<String> getProvideUser() {
		// TODO Auto-generated method stub
		List list = new ArrayList();  
        User u1 = new User();  
        u1.setName("fuweihua");  
        u1.setAge(25);  
        u1.setSex("男");  
  
        User u2 = new User();  
        u2.setName("翟莉");  
        u2.setAge(21);  
        u2.setSex("女");  
        list.add(u1);  
        list.add(u2);  
        return list;  
	}

	public String provideSayHolle(String name) {
		// TODO Auto-generated method stub
		return "provide:"+name+"--say hello!";
	}

}
