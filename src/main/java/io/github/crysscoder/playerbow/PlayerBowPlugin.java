package io.github.crysscoder.playerbow;

import org.bukkit.plugin.java.JavaPlugin;
import io.github.crysscoder.playerbow.bow.effect.FallLandingEffect;
import io.github.crysscoder.playerbow.bow.key.CustomBowFactory;
import io.github.crysscoder.playerbow.bow.listener.BowProjectileListener;
import io.github.crysscoder.playerbow.bow.listener.BowUseListener;
import io.github.crysscoder.playerbow.bow.listener.FallDamageListener;
import io.github.crysscoder.playerbow.bow.manager.NoFallManager;
import io.github.crysscoder.playerbow.command.GiveBowCommand;

public final class PlayerBowPlugin extends JavaPlugin {

    @Override
    public void onEnable() {
        CustomBowFactory customBowFactory = new CustomBowFactory(this);
        NoFallManager noFallManager = new NoFallManager();
        FallLandingEffect fallLandingEffect = new FallLandingEffect(1,5);
        getServer().getPluginManager().registerEvents(new FallDamageListener(noFallManager, fallLandingEffect), this);
        getServer().getPluginManager().registerEvents(new BowUseListener(this, customBowFactory, noFallManager), this);
        getServer().getPluginManager().registerEvents(new BowProjectileListener(this), this);
        getCommand("custombow").setExecutor(new GiveBowCommand(customBowFactory));

    }

}
