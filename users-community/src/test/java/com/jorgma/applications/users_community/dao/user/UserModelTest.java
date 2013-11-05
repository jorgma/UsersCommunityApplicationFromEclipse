package com.jorgma.applications.users_community.dao.user;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.jorgma.applications.users_community.model.user.User;
import com.jorgma.applications.users_community.model.user.UserId;


@ContextConfiguration(locations={"/test-applicationContext.xml"})
@RunWith(SpringJUnit4ClassRunner.class)
public class UserModelTest {

	@Before
	public void init() {
		System.out.println("\n********************* TESTING USER MODEL *********************\n");
	}
	
	@Test
	public void createUser() {
		User user  = new User();
		UserId id  = new UserId("234234234");
		String name = "user";
		user.setId(id);
		user.setName(name);
		assertEquals("User id not the same", id.getId(),  user.getId().getId());
		assertEquals("User name not the same", name,  user.getName());	
	}
	
}

