package htt.guildcreator;

import lombok.Getter;
import org.bson.Document;
import org.bukkit.entity.Player;

import javax.swing.text.html.parser.DocumentParser;
import java.util.List;

@Getter
public class GuildData {
    private GuildCreator plugin = GuildCreator.getInstance();

    private String GuildName;
    private int playersNumber;

    public String getGuildName() {
        return GuildName;
    }

    public void setGuildName(String guildName) {
        GuildName = guildName;
    }

    public int getPlayersNumber() {
        return playersNumber;
    }

    public void setPlayersNumber(int playersNumber) {
        this.playersNumber = playersNumber;
    }

    public void load(){


    }
}
