package com.jorgma.applications.users_community.utils.json;

import org.codehaus.jettison.json.JSONException;
import org.codehaus.jettison.json.JSONObject;

import com.jorgma.applications.users_community.model.user.User;

public abstract class UserToJSON {

	private UserToJSON() {
		
	}
	
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
}
