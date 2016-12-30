package org.mule.modules.split.automation.functional;

import org.mule.modules.split.SplitClient;
import org.mule.modules.split.SplitClientInterface;
import org.mule.modules.split.SplitFactory;
import org.mule.modules.split.config.ConnectorConfigClient;
//import org.mule.modules.split.config.ConnectorConfigClientInterface;

import org.junit.After;
import org.junit.Before;
import java.io.IOException;
import java.io.InputStream;
import java.util.*;

public abstract class AbstractTestCases{

    SplitClientInterface myConnector;
    SplitFactory splitFactory;

    public ConnectorConfigClient getConfig() throws Exception {
//      Properties validCredentials = ConfigurationUtils.getAutomationCredentialsProperties();
        ConnectorConfigClient config = new ConnectorConfigClient();
        return config;
    }

    @Before
    public void init() throws Exception
    {
        Properties prop = new Properties();
        loadProperties(prop);
        splitFactory = (SplitFactory)Class.forName(prop.getProperty("connectorFactory")).getConstructor().newInstance();

        splitFactory.init();
    }

    @After
    public void shutdown() throws Exception
    {
        splitFactory.shutdown();
    }

    protected SplitClientInterface getConnector() throws Exception
    {
        myConnector = splitFactory.getMyConnector();

        if(myConnector instanceof SplitClient)
            ((SplitClient)myConnector).setConfig(getConfig());

        return myConnector;
    }

    void loadProperties(Properties prop)
    {
        InputStream input = null;
        try {
            //input = new FileInputStream("config.properties");
            input = this.getClass().getResourceAsStream("/config.properties");
            prop.load(input);
        } catch (IOException ex) {
            ex.printStackTrace();
        } finally {
            if (input != null) {
                try {
                    input.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}