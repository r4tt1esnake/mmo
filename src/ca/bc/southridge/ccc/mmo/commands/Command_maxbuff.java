package ca.bc.southridge.ccc.mmo.commands;

import org.bukkit.attribute.Attribute;
import org.bukkit.attribute.AttributeModifier;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

//Hopefully this works
public class Command_maxbuff implements CommandExecutor {

	@Override
	public boolean onCommand(CommandSender arg0, Command arg1, String arg2, String[] arg3) {
		if(!(arg0 instanceof Player)) {
			return false;
		}
		Player player = (Player) arg0;
		double currHealth = player.getAttribute(Attribute.GENERIC_MAX_HEALTH).getValue();
		double currSpeed = player.getAttribute(Attribute.GENERIC_MOVEMENT_SPEED).getValue();
		player.getAttribute(Attribute.GENERIC_MAX_HEALTH).setBaseValue(currHealth + currHealth / 2);
		player.getAttribute(Attribute.GENERIC_MOVEMENT_SPEED).setBaseValue(currSpeed + currSpeed / 2);
		player.sendMessage(Double.toString(player.getAttribute(Attribute.GENERIC_MAX_HEALTH).getValue()));
		player.sendMessage(Double.toString(player.getAttribute(Attribute.GENERIC_MOVEMENT_SPEED).getValue()));
		return true;
	}

}
