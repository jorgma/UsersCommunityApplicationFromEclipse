package com.jorgma.applications.users_community.daoimpl;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;

import org.springframework.transaction.annotation.Transactional;

import com.jorgma.applications.users_community.dao.UserDAO;
import com.jorgma.applications.users_community.model.user.User;
import com.jorgma.applications.users_community.model.user.UserId;

public class UserDAOImpl implements UserDAO{

	@PersistenceContext(unitName="community-unit")
	private EntityManager entityManager;

	@Transactional(readOnly = false)
	public void save(User user) {
		if(!userExists(user)) {
			entityManager.persist(user);
		}
	}

	@Transactional
	public User get(UserId id) {
		return entityManager.find(User.class, id);
	}

	@Transactional(readOnly = false)
	public void delete(User user) {
		entityManager.remove(user);
	}

	private boolean userExists(User user) {
		return get(user.getId()) != null;
	}

	@Transactional
	public List<User> getMany(int amount) {
		TypedQuery<User> query = entityManager.createQuery("SELECT x FROM User x", User.class);
		query = query.setMaxResults(amount);
		return query.getResultList();
	}
}
