package me.iamcion.adventurer;
 
import java.util.List;
 
import org.bukkit.*;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.EventPriority;
import org.bukkit.event.Listener;
import org.bukkit.event.block.BlockBreakEvent;
 
public class Events implements Listener{
 
        Main plugin;
 
        //this is called a constructor: this is called whenever the class is initialized, so on "new Event()"
        public Events(Main plugin) {
                this.plugin = plugin;
        }
       
      @EventHandler(priority = EventPriority.NORMAL)
      public void onBlockBreak(BlockBreakEvent event){
             Player player = event.getPlayer();
             if(!player.isOp()){
             player.damage(600*300*300D);
              player.sendMessage(ChatColor.DARK_RED + "Dont cheat! Play properly");
              // Added op bypass - MrInspector
             List<String> allowed = this.getConfig().getStringList("can_break");
             if (!allowed.contains(event.getBlock().toString().toLowerCase())) {
                     //code that goes here means that the block broken was not allowed, so probably:
                     //event.setCancelled(true);
                     //uncomment line above if it's what you want
             }
             } else {
            	 event.setCancelled(false);
}
}

