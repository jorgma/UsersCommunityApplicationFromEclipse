package com.jorgma.applications.users_community.service.users.get.users;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.codehaus.jettison.json.JSONArray;
import org.codehaus.jettison.json.JSONException;
import org.codehaus.jettison.json.JSONObject;
import org.springframework.stereotype.Component;

import com.jorgma.applications.users_community.dao.UserDAO;
import com.jorgma.applications.users_community.utils.json.UserToJSON;
import com.sun.jersey.api.core.InjectParam;

@Component
@Path("users/get/users")
public class GetUsersService {
	
	@InjectParam
	UserDAO dao;
	
	@GET
	@Path("/all")
	@Produces(MediaType.APPLICATION_JSON)
	public JSONArray getAllUsers() {
		return UserToJSON.toJSONArray(dao.getMany(Integer.MAX_VALUE));
	}

	@GET
	@Path("/{amount}")
	@Produces(MediaType.APPLICATION_JSON)
	public JSONArray getUsers(@PathParam("amount") int number) {
		return UserToJSON.toJSONArray(dao.getMany(number));
	}
	
	@GET
	@Path("/howMany")
	@Produces(MediaType.APPLICATION_JSON)
	public JSONObject getNumberOfUsers(){
		JSONObject numberOfUsers = new JSONObject();
		int number = dao.getNumberOfUsers();
		try {
			numberOfUsers.put("numberOfUsers", number);
		} catch (JSONException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return numberOfUsers;
	}
}
