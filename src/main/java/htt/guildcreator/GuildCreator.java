package htt.guildcreator;

import com.mongodb.DB;
import com.mongodb.DBCollection;
import com.mongodb.MongoClient;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import lombok.Getter;
import org.bson.Document;
import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.plugin.java.JavaPlugin;

import java.util.Objects;

public final class GuildCreator extends JavaPlugin {

    @Getter
    public static GuildCreator instance;


    @Override
    public void onEnable() {
        instance = this;

        registerCommands();

        getConfig().options().copyDefaults();
        saveDefaultConfig();

        dataBase db = new dataBase();
        db.connect();


        Bukkit.getConsoleSender().sendMessage(ChatColor.RED + "" + ChatColor.BOLD +  "GuildCreator started correctly.");

    }

    @Override
    public void onDisable() {
        Bukkit.getConsoleSender().sendMessage(ChatColor.RED + "" + ChatColor.BOLD +  "GuildCreator closed correctly.");
    }

    public void registerCommands() {
        Objects.requireNonNull(this.getCommand("GuildCreator")).setExecutor(new GuildCreatorCommand(this));
    }


}
