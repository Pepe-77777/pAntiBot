package br.com.pepe.antibot.events;

import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.event.player.PlayerQuitEvent;

import net.md_5.bungee.api.ChatColor;

public class Events implements Listener {
	
	@EventHandler
	public void aoEntrar(PlayerJoinEvent e) {
		e.setJoinMessage(null);
		
		if (e.getPlayer().getName().length() < 3) {
			e.getPlayer().kickPlayer(ChatColor.RED + "Olá, Seu nick tem menos de 3 caracteres. Ou sejá, Você não pode entrar no servidor pois seu nick é muito pequeno!");
		}
		
		if (e.getPlayer().getName().length() > 16) {
			e.getPlayer().kickPlayer(ChatColor.RED + "Olá, Seu nick passa de 16 caracteres. Ou sejá, Você não pode entrar no servidor pois seu nick é muito grande!");
		}
	}
	
	@EventHandler
	public void aoSair(PlayerQuitEvent e) {
		e.setQuitMessage(null);
	}
	
}
