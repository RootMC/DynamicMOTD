package rootmc.net.dynamicmotd;

import cn.nukkit.scheduler.PluginTask;
import cn.nukkit.utils.TextFormat;

import java.util.ArrayList;
import java.util.Random;

public class Task extends PluginTask<Main> {

    public Task(Main owner) {
        super(owner);
    }

    @Override
    public void onRun(int i) {
        ArrayList name = (ArrayList) getOwner().getConfig().get("motd-type");
        int max = name.size();
        Random rand = new Random();
        int motd = rand.nextInt(max);
        getOwner().getServer().getNetwork().setName(TextFormat.colorize(name.get(motd).toString()));
    }
}
