package org.example;

import org.bukkit.plugin.java.JavaPlugin;

public class Example extends JavaPlugin {

    @Override 
    public void onEnable() {
        getLogger().info("Hello World");
    }

    @Override 
    public void onDisable() {
        getLogger().info("ByeBye");
    }

}