package com.actuallyadog.letsmodreboot.configuration;

import net.minecraftforge.common.config.Configuration;

import java.io.File;

/**
 * Created by John on 10/2/2014.
 */
public class ConfigurationHandler {
    public static void init(File configFile) {
        Configuration configuration = new Configuration(configFile);
        boolean configValue = false;
        try {
            configuration.load();
            configValue = configuration.get(Configuration.CATEGORY_GENERAL, "configValue", true, "This is an example config value").getBoolean(true);

        }
        catch (Exception e) {

        }
        finally {
            configuration.save();
        }

        System.out.println("configValue:" + configValue);
    }
}
