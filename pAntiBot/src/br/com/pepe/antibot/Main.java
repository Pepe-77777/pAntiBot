package br.com.pepe.antibot;

import org.bukkit.Bukkit;
import org.bukkit.plugin.PluginManager;
import org.bukkit.plugin.java.JavaPlugin;

import br.com.pepe.antibot.events.Events;
import net.md_5.bungee.api.ChatColor;

public class Main extends JavaPlugin {
	
	public String prefix = ChatColor.RED + "" + ChatColor.RED + "pAntiBot" + ChatColor.GRAY + ChatColor.BOLD + " -> " + ChatColor.RESET;
	
	@Override
	public void onEnable() {
		Bukkit.getConsoleSender().sendMessage(prefix + "O plugin foi iniciado!");
		
		registerEvents();
		registerCommands();
	}
	
	@Override
	public void onDisable() {
		Bukkit.getConsoleSender().sendMessage(prefix + "O plugin foi desligado!");
	}
	
	public void registerEvents() {
		PluginManager pm = Bukkit.getPluginManager();
		pm.registerEvents(new Events(), this);
	}
	
	public void registerCommands() {
		
	}
	
}
