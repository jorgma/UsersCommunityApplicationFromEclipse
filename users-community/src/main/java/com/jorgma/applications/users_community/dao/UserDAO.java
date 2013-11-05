package com.jorgma.applications.users_community.dao;

import com.jorgma.applications.users_community.model.user.User;
import com.jorgma.applications.users_community.model.user.UserId;

public interface UserDAO {
	void addUser(User user);
	User getUser(UserId id);
	void deleteUser(User user);
}
