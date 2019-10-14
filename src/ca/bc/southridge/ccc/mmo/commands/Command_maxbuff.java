package ca.bc.southridge.ccc.mmo.commands;

import org.bukkit.attribute.Attribute;
import org.bukkit.attribute.AttributeModifier;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class Command_maxbuff implements CommandExecutor {

	@Override
	public boolean onCommand(CommandSender arg0, Command arg1, String arg2, String[] arg3) {
		if(!(arg0 instanceof Player)) {
			return false;
		}
		Player player = (Player) arg0;
		player.getAttribute(Attribute.GENERIC_MAX_HEALTH).addModifier(new AttributeModifier("Increase vitality.", 1, AttributeModifier.Operation.MULTIPLY_SCALAR_1));
		player.getAttribute(Attribute.GENERIC_MOVEMENT_SPEED).addModifier(new AttributeModifier("Increase speed.", 1, AttributeModifier.Operation.MULTIPLY_SCALAR_1));
		return true;
	}

}
