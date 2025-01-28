package me.naulbimix.fVault;

import org.bukkit.plugin.java.*;

public class Bootstrap extends JavaPlugin {

    @Override
    public void onEnable() {
        getLogger().info("§fЗагрузка плагина §eVault §fверсии §e1.0 §fот §6NaulbiMIX §7(§9t.me/naulbimix§7)");
    }

    @Override
    public void onDisable() {
        // Remove all Service Registrations
        getServer().getServicesManager().unregisterAll(this);
    }
}
