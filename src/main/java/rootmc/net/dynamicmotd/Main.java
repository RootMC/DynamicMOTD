package rootmc.net.dynamicmotd;

import cn.nukkit.event.Listener;
import cn.nukkit.plugin.PluginBase;

public class Main extends PluginBase implements Listener {
    @Override
    public void onEnable() {
        Main main = this;
        saveDefaultConfig();
        getServer().getScheduler().scheduleRepeatingTask(new Task(main), 100);
    }
}
