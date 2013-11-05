package com.jorgma.applications.users_community.dao.user;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@ContextConfiguration(locations={"/test-applicationContext.xml"})
@RunWith(SpringJUnit4ClassRunner.class)
public class UserDAOImplTest {

	@Before
	public void init() {
		System.out.println("\n********************* TESTING USER DAO IMPLEMENTATION *********************\n");
	}
	
	@Test
	public void test() {	
		System.out.println("TESTS RUNNING");
	}
}
