package com.jorgma.applications.users_community.dao;

import java.util.List;

import com.jorgma.applications.users_community.model.user.User;
import com.jorgma.applications.users_community.model.user.UserId;

public interface UserDAO {
	void save(User user);
	User get(UserId id);
	List<User> getMany(int amount);
	void delete(User user);
	int getNumberOfUsers();

}
