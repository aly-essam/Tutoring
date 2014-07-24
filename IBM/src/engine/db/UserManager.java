package engine.db;


import com.mongodb.BasicDBObject;
import com.mongodb.DBObject;
import com.mongodb.WriteResult;

import engine.model.User;

public class UserManager extends BaseManager {

	
	public User getUser(){	
		
		BasicDBObject query = new BasicDBObject("username", "PD");
		DBObject a = getTable("User").findOne(query);
	
	//	getTable("User").update(a, );
		//BasicDBObject update = new BasicDBObject("bio", "eldoss");
		//WriteResult obj = getTable("User").update(query, update);
		
		System.out.println(a);
		User user = new User();
	user.setName((String)a.get("email"));
		
		return user;
		
	}
	public void sign_up(String name,String username ,String email, String password ){
		
		//User user = new User(name,username,email,password);
		BasicDBObject doc = new BasicDBObject("name", name)
        .append("username", username)
        .append("email", email)
        .append("password",password);
		getTable("User").insert(doc); 
		System.out.println("Done succesfully");
		
	}
}
