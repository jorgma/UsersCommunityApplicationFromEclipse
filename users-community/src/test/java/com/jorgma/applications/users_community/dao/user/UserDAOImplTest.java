package com.jorgma.applications.users_community.dao.user;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.jorgma.applications.users_community.dao.UserDAO;
import com.jorgma.applications.users_community.model.user.User;
import com.jorgma.applications.users_community.model.user.UserId;

@ContextConfiguration(locations={"/test-applicationContext.xml"})
@RunWith(SpringJUnit4ClassRunner.class)
public class UserDAOImplTest {

	@Autowired
	UserDAO dao;
	
	@Before
	public void init() {
		System.out.println("\n********************* TESTING USER DAO IMPLEMENTATION *********************\n");
	}
	
	@Test
	public void addUserAndRetrieveTheSame() {	
		String name = "Jorge";
		String id = "myid1";
		User user  = createUser(name, id);
		dao.save(user);
		
		User retrievedUser = dao.get(new UserId(id));
		Assert.assertEquals("User name not the same", name, retrievedUser.getName());
		Assert.assertEquals("User id not the same", id, retrievedUser.getId().getId());
	}
	
	
	private User createUser(String name, String id) {
		User user  = new User();
		user.setName(name);
		user.setId(new UserId(id));
		return user;
	}
}
