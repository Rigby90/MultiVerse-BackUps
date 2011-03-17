package com.onarandombox.MultiVerseBackUps;

import java.util.logging.Logger;

import org.bukkit.plugin.java.JavaPlugin;

public class MultiVerseBackUps extends JavaPlugin {

    public static final Logger log = Logger.getLogger("Minecraft");
    public static final String logPrefix = "[MultiVerse-BackUps] ";
    
    @Override
    public void onEnable() {
        // Output a little snippet to show it's enabled.
        log.info(logPrefix + "- Version " + this.getDescription().getVersion() + " Enabled - By " + getAuthors());
    }

    @Override
    public void onDisable() {
        log.info(logPrefix + "- Version " + this.getDescription().getVersion() + " Disabled");
    }
    
    /**
     * Parse the Authors Array into a readable String with ',' and 'and'.
     * @return
     */
    private String getAuthors(){
        String authors = "";
        for(int i=0;i<this.getDescription().getAuthors().size();i++){
            if(i==this.getDescription().getAuthors().size()-1){
                authors += " and " + this.getDescription().getAuthors().get(i);
            } else {
                authors += ", " + this.getDescription().getAuthors().get(i);
            }
        }
        return authors.substring(2);
    }
}
