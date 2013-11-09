package com.jorgma.applications.users_community.service.users.get.user;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.codehaus.jettison.json.JSONObject;
import org.springframework.stereotype.Component;

import com.jorgma.applications.users_community.dao.UserDAO;
import com.jorgma.applications.users_community.model.user.User;
import com.jorgma.applications.users_community.model.user.UserId;
import com.jorgma.applications.users_community.utils.json.UserToJSON;
import com.sun.jersey.api.core.InjectParam;

@Component
@Path("users/get/user")
public class GetUserService {	
	@InjectParam
	UserDAO dao;
	
	
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	@Path("/{id}")
	public JSONObject getUser(@PathParam("id") UserId id) {
		User user = dao.get(id);
		return UserToJSON.toJSON(user);
	}
	
	
}
