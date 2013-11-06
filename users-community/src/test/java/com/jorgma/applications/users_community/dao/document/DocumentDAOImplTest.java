package com.jorgma.applications.users_community.dao.document;


import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.jorgma.applications.users_community.dao.DocumentDAO;
import com.jorgma.applications.users_community.model.document.Document;
import com.jorgma.applications.users_community.model.document.DocumentId;


@ContextConfiguration(locations={"/test-applicationContext.xml"})
@RunWith(SpringJUnit4ClassRunner.class)
public class DocumentDAOImplTest {
	
	@Autowired
	DocumentDAO dao;
	
	@Before
	public void init() {
		System.out.println("\n********************* TESTING DOCUMENT DAO IMPLEMENTATION *********************\n");
	}
	
	@Test
	public void createDocument() {
		Document document   = new Document();
		DocumentId id = new DocumentId("doc1");
		document.setId(id);
		byte[] bytes = new byte[1000];
		document.setContent(bytes);
		dao.save(document);
	}
}
