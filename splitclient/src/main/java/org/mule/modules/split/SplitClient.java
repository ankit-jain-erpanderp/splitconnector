package org.mule.modules.split;

import org.mule.modules.split.config.ConnectorConfigClient;

public class SplitClient implements SplitClientInterface {

    ConnectorConfigClient config;

    /**
     * Custom processor
     *
     * @param friend
     *            Name to be used to generate a greeting message.
     * @return A greeting message
     */
    public String greet(String friend) {
        /*
         * MESSAGE PROCESSOR CODE GOES HERE
         */
        return config.getGreeting() + " " + friend + ". " + config.getReply();
    }

    public ConnectorConfigClient getConfig() {
        return config;
    }

    public void setConfig(ConnectorConfigClient config) {
        this.config = config;
    }

}