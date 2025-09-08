package net.milkbowl.vault;

import org.bukkit.plugin.java.*;

public class Vault extends JavaPlugin {

    @Override
    public void onEnable() {
        getLogger().info(String.format("Загрузка версии %s", getDescription().getVersion()));
    }

    @Override
    public void onDisable() {
        // До определённой версии не всё было реализовано в ядрах, когда плагин отгружался (HandlerList, ServicesManager и др.), но
        //  потом добавили, в ластовых версиях это не требуется
        //  см.: https://github.com/PaperMC/Paper/blob/103187750e29fd982b84b2bab114fe5af98a82e5/paper-api/src/main/java/org/bukkit/plugin/SimplePluginManager.java#L566-L571
        getServer().getServicesManager().unregisterAll(this);
    }
}
