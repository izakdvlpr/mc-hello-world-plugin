package com.izakdvlpr.helloworld;

import org.bukkit.plugin.java.JavaPlugin;

import com.izakdvlpr.helloworld.commands.HelloWorldCommand;

public class Main extends JavaPlugin {
	private HelloWorldCommand helloWorld = new HelloWorldCommand();
	
	@Override
	public void onEnable() {
    this.getCommand("helloworld").setExecutor(helloWorld);
    	
    getLogger().info("onEnable is called!");
  }   
    
  @Override
  public void onDisable() {
    getLogger().info("onDisable is called!");
  }
}
