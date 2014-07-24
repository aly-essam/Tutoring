package engine;

import engine.db.UserManager;
import engine.model.User;

public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		UserManager userMg = new UserManager();
	User x=new User();
	x= userMg.getUser();
	System.out.println(x.getEmail());


	}

}
