package engine.db;

import com.mongodb.DB;
import com.mongodb.DBCollection;

public class BaseManager {

	public BaseManager() {
		super();
	}

	protected DB getDB() {
		DBClientManager dbManager = DBClientManager.getInstance();
		DB db = dbManager.getDb("IBM");
		return db;
	}
	protected DBCollection getTable(String name) {
		return getDB().getCollection(name);
	}

}