package htt.guildcreator;

import com.mongodb.MongoClient;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import org.bson.Document;
import org.bukkit.Bukkit;

public class dataBase {

    private MongoClient mongoClient = new MongoClient("localhost", 27017);
    private MongoDatabase mongoDatabase;
    private MongoCollection<Document> serverCollection;

    public dataBase(){}

    public void connect(){

        MongoDatabase db = mongoClient.getDatabase("GuildCreatorDB");

        serverCollection = db.getCollection("GuildData");

        

    }
}
