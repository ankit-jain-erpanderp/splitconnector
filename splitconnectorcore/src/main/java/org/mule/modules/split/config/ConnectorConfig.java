package org.mule.modules.split.config;

import org.mule.api.annotations.components.Configuration;
import org.mule.api.annotations.Configurable;
import org.mule.api.annotations.param.Default;
//import org.mule.modules.split.config.ConnectorConfigClientInterface;
import org.mule.modules.split.config.ConnectorConfigClient;


@Configuration(friendlyName = "Configuration")
//public class ConnectorConfig implements ConnectorConfigClientInterface{
public class ConnectorConfig {
    ConnectorConfigClient configClient;
    public ConnectorConfigClient getConfigClient() {
        if(configClient == null) {
            configClient = new ConnectorConfigClient();
            configClient.setGreeting(greeting);
            configClient.setReply(reply);
        }
        return configClient;
    }
    /**
     * Greeting message
     */
    @Configurable
    @Default("Hello")
    private String greeting;

    /**
     * Reply message
     */
    @Configurable
    @Default("How are you?")
    private String reply;

    /**
     * Set greeting message
     *
     * @param greeting
     *            the greeting message
     */
    public void setGreeting(String greeting) {
        this.greeting = greeting;
    }

    /**
     * Get greeting message
     */
    public String getGreeting() {
        return this.greeting;
    }

    /**
     * Set reply
     *
     * @param reply
     *            the reply
     */
    public void setReply(String reply) {
        this.reply = reply;
    }

    /**
     * Get reply
     */
    public String getReply() {
        return this.reply;
    }

}