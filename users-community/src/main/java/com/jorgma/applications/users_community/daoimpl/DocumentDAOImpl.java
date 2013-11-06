package com.jorgma.applications.users_community.daoimpl;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.transaction.annotation.Transactional;

import com.jorgma.applications.users_community.dao.DocumentDAO;
import com.jorgma.applications.users_community.model.document.Document;
import com.jorgma.applications.users_community.model.document.DocumentId;

public class DocumentDAOImpl implements DocumentDAO{
	@PersistenceContext(unitName = "community-unit")
	private EntityManager entityManager;

	@Transactional(readOnly = false)
	public void save(Document document) {
		entityManager.persist(document);
	}

	@Transactional
	public Document get(DocumentId id) {
		return entityManager.find(Document.class, id);
	}

	@Transactional(readOnly = false)
	public void delete(Document document) {
		entityManager.remove(document);
	}
}
