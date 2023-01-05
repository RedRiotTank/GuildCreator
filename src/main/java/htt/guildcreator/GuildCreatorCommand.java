package htt.guildcreator;

import com.mongodb.MongoClient;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import lombok.Getter;
import org.bson.Document;
import org.bukkit.Bukkit;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.command.TabCompleter;
import org.bukkit.entity.Player;

import java.util.ArrayList;
import java.util.List;

public class GuildCreatorCommand implements CommandExecutor, TabCompleter {

    private  final GuildCreator plugin;
    public GuildCreatorCommand(GuildCreator plugin){this.plugin = plugin;}

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args){

        if(args[0].equals("CreateGuild")){
            System.out.println("Create a guild");
        }

        if(args[0].equals("RemoveGuild")){
            System.out.println("Remove a guild");
        }
        return true;

    }



    @Override
    public List<String> onTabComplete(CommandSender sender, Command command, String alias, String[] args) {
        List<String> list = new ArrayList<>();
        if(args.length == 1){
            list.add("CreateGuild");
            list.add("RemoveGuild");
        }

        return list;
    }
}