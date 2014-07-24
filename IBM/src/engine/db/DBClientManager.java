package engine.db;

import com.mongodb.BasicDBObject;
import com.mongodb.BulkWriteOperation;
import com.mongodb.BulkWriteResult;
import com.mongodb.Cursor;
import com.mongodb.DB;
import com.mongodb.DBCollection;
import com.mongodb.DBCursor;
import com.mongodb.DBObject;
import com.mongodb.MongoClient;
import com.mongodb.ParallelScanOptions;

import java.net.UnknownHostException;
import java.util.List;
import java.util.Set;

import static java.util.concurrent.TimeUnit.SECONDS;

public class DBClientManager {
	private static DBClientManager clientManager = null;
	private MongoClient mongoClientInstance = null;
	private DBClientManager() {
		createMongoClient();
		
	}
	
	public static  DBClientManager getInstance(){
		if(clientManager == null){
			clientManager = new DBClientManager();
		}
		return clientManager;
	
	}
	private void createMongoClient(){
		try {
			mongoClientInstance = new MongoClient();
		} catch (UnknownHostException e) {
			e.printStackTrace();
		}
	}
	
	
	public DB getDb(String dbName){
		DB db = mongoClientInstance.getDB(dbName);
		return db;
	}
	
}
