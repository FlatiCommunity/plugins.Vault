package net.milkbowl.vault;

import org.bukkit.plugin.java.*;

public class Vault extends JavaPlugin {

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
