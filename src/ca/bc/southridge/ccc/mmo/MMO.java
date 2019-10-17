package ca.bc.southridge.ccc.mmo;

import org.bukkit.plugin.java.JavaPlugin;

import ca.bc.southridge.ccc.mmo.commands.Command_maxbuff;
import ca.bc.southridge.ccc.mmo.commands.Command_maxdebuff;
import ca.bc.southridge.ccc.mmo.eugenics.Listener_strength;

public class MMO extends JavaPlugin {
	
	Listener_strength lstrength;
	
	@Override
	public void onEnable() {
		lstrength = new Listener_strength();
		getServer().getPluginManager().registerEvents(lstrength, this);
		this.getCommand("maxbuff").setExecutor(new Command_maxbuff());
		this.getCommand("maxdebuff").setExecutor(new Command_maxdebuff());
	}
	
	@Override
	public void onDisable() {
		
	}

}
