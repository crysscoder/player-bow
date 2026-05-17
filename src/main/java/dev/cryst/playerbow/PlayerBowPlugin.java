package dev.cryst.playerbow;

import org.bukkit.plugin.java.JavaPlugin;
import dev.cryst.playerbow.bow.effect.FallLandingEffect;
import dev.cryst.playerbow.bow.key.CustomBowFactory;
import dev.cryst.playerbow.bow.listener.BowProjectileListener;
import dev.cryst.playerbow.bow.listener.BowUseListener;
import dev.cryst.playerbow.bow.listener.FallDamageListener;
import dev.cryst.playerbow.bow.manager.NoFallManager;
import dev.cryst.playerbow.command.GiveBowCommand;

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
