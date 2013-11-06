package com.jorgma.applications.users_community.dao;

import com.jorgma.applications.users_community.model.user.User;
import com.jorgma.applications.users_community.model.user.UserId;

public interface UserDAO {
	void save(User user);
	User get(UserId id);
	void delete(User user);
}
