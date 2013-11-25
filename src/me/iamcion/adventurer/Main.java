package me.iamcion.adventurer;
 
import org.bukkit.plugin.java.JavaPlugin;
 
public class Main extends JavaPlugin{
       
        @Override
        public void onEnable(){
                // this passes this plugin into Events so it can use .getConfig() and other things like that
        	Events events = new Events(this);
        	getServer().getPluginManager().registerEvents(events, this);

        
        	
        	//**
        	//**
        	//from this point on, is where the onEnabe and onDisable Code is set
        	//**
        	//**
        	
        	
                //These are already done by default, but if you want color, this is the way to go
                getLogger().info("§2§lAdventurer Plugin Enabled!");
                //getLogger().info("§6~Plugin Created By iamcion!~");
                getLogger().info("§6~§6§lPlugin Created By " + getDescription().getAuthors() + "!§6~");
        }      
 
        //@Override not essential, but nice to know you didn't make this in the first place, because
        //    it in fact comes from JavaPlugin
        @Override
        public void onDisable(){
                getLogger().info("§4§lAdventurer Plugin Disabled!");
        }
    }