package ca.bc.southridge.ccc.mmo;

import org.bukkit.plugin.java.JavaPlugin;

import ca.bc.southridge.ccc.mmo.commands.Command_maxbuff;

public class MMO extends JavaPlugin {
	
	@Override
	public void onEnable() {
		this.getCommand("maxbuff").setExecutor(new Command_maxbuff());
	}
	
	@Override
	public void onDisable() {
		
	}

}
