package com.jorgma.applications.users_community.utils.json;

import java.util.List;

import org.codehaus.jettison.json.JSONArray;
import org.codehaus.jettison.json.JSONException;
import org.codehaus.jettison.json.JSONObject;

import com.jorgma.applications.users_community.model.user.User;

public abstract class UserToJSON {

	private UserToJSON() {
		
	}
	
	/**
	 * 
	 * @param user
	 * @return user as a JSON object
	 */
	public static JSONObject toJSON(User user) {
		JSONObject userAsJSON = new JSONObject();
		
		if(user != null) {
			try {
				userAsJSON.put("id", user.getId().getId());
				userAsJSON.put("name", user.getName());
			} catch (JSONException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
		return userAsJSON;
	}
	
	/**
	 * 
	 * @param users List of users to convert to JSON-format
	 * @return array of users formatted to JSON
	 */
	public static JSONArray toJSONArray(List<User> users) {
		JSONArray usersAsJSON = new JSONArray();
		for(User user: users) {
			JSONObject userAsJSON = toJSON(user);
			usersAsJSON.put(userAsJSON);
		}
		return usersAsJSON;
	}
}
