package com.minecolonies.discordianbot.modules.api.config;

import com.minecolonies.discordianbot.qsml.BaseConfig;
import ninja.leaping.configurate.objectmapping.Setting;
import ninja.leaping.configurate.objectmapping.serialize.ConfigSerializable;

/**
 * The API section of the main config file.
 */
@ConfigSerializable
public class APIConfig extends BaseConfig
{
    @Setting(value = "api-token", comment = "API Token for communicating with DiscordianServer API.")
    public String apiToken = "insert-token-here";

    @Setting(value = "api-url", comment = "URL for connecting to DiscordianNetwork")
    public String apiUrl = "http://localhost:5000";

    @Setting(value = "api-hub", comment = "DO NOT TOUCH UNLESS YOU KNOW WHAT YOU'RE DOING \n "
                                            + "API hub url. please leave proceeding \"/\"")
    public String apiHub = "/hubs/discordian";
}
