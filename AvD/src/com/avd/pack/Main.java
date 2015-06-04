package com.avd.pack;

import org.bukkit.Bukkit;
import org.bukkit.event.Listener;
import org.bukkit.plugin.java.JavaPlugin;

public class Main extends JavaPlugin implements Listener{
	
	public static int gameLoop = 0;
	
	
	
	@SuppressWarnings("deprecation")
	public void onEnable(){
		Bukkit.getPluginManager().registerEvents(this, this);
		gameLoop = getServer().getScheduler().scheduleAsyncRepeatingTask(this, new gameLoop(), 20L, 20L);}
	
	public void onDisable(){
		getServer().getScheduler().cancelTask(gameLoop);}
	
	
	
	
	

}
