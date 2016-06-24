package br.com.herbertrausch.mongodb;

import com.mongodb.MongoClient;

public class MongoConnection {

	private static MongoConnection mgConn;
	private MongoClient mongoClient;
//	private MongoDatabase db;
	
	private MongoConnection(){
		
//		mongoClient = new MongoClient( new MongoClientURI(("mongodb://lp2:lp22016@ds015403.mlab.com:15403/lp2"));
//		db = mongoClient.getDatabase("lp22016");
		
	}
	
	public static MongoConnection getConnection(){
		
		if(mgConn == null)
			mgConn = new MongoConnection();
		
		return mgConn;
	}
	
	public MongoClient getClient(){
		
		return mongoClient;
	}
	
//	public MongoDatabase getDatabase(){
//		
//		return db;
//	}
	
		

}
