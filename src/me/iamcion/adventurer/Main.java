package me.iamcion.adventurer;
 
import org.bukkit.plugin.java.JavaPlugin;
 
public class Main extends JavaPlugin{
       
        @Override
        public void onEnable(){
                // this passes this plugin into Events so it can use .getConfig() and other things like that
        	Events events = new Events(this);
        	getServer().getPluginManager().registerEvents(events, this);
            getLogger().info("Adventurer Plugin Enabled!");
            getLogger().info("~Plugin Created By " + getDescription().getAuthors() + "!~");
            getConfig().options().copyDefaults(true);
            saveConfig();
        }      
        	//**
        	//from this point on, is where the onEnabe and onDisable Code is set
        	//**
        	//**
  
 
        //@Override not essential, but nice to know you didn't make this in the first place, because
        //    it in fact comes from JavaPlugin
        @Override
        public void onDisable(){
                getLogger().info("Adventurer Plugin Disabled!");
        }
    }