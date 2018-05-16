package com.mybatis.test;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.mybatis.dao.UserMapper;
import com.mybatis.model.User;

@ContextConfiguration(locations={"classpath:applicationContext.xml"})
@RunWith(SpringJUnit4ClassRunner.class)
public class TestService {

	@Autowired
	public UserMapper um;
	@Test
	public void testxx(){
		User u = um.selectUserByID(1);
		System.out.print("fsdfsfs dfs "+u.getName());
	}
}