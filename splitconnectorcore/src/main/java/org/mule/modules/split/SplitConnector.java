package org.mule.modules.split;

import org.mule.api.annotations.Config;
import org.mule.api.annotations.Connector;
import org.mule.api.annotations.Processor;

import org.mule.modules.split.config.ConnectorConfig;
import org.mule.modules.split.SplitClientInterface;
import org.mule.modules.split.SplitClient;
//import org.mule.modules.split.config.ConnectorConfigClientInterface;

@Connector(name = "Split", friendlyName = "SplitConnector")
public class SplitConnector implements SplitClientInterface {

    SplitClient splitClient = new SplitClient();
    @Config
    ConnectorConfig config;

    public ConnectorConfig getConfig() {
        return config;
    }
    /**
     * Custom processor
     *
     * @param friend
     *            Name to be used to generate a greeting message.
     * @return A greeting message
     */
    @Processor
    public String greet(String friend) {
        /*
         * MESSAGE PROCESSOR CODE GOES HERE
         */
        return splitClient.greet(friend);
        //return config.getGreeting() + " " + friend + ". " + config.getReply();
    }

    public void setConfig(ConnectorConfig config)
    {
          this.config = config;
          splitClient.setConfig(config.getConfigClient());
    }

}