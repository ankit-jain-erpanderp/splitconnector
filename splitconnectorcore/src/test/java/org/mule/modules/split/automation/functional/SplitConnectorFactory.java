package org.mule.modules.split.automation.functional;

import org.mule.modules.split.SplitConnector;
import org.mule.tools.devkit.ctf.junit.AbstractTestCase;
import org.mule.modules.split.SplitFactory;

public class SplitConnectorFactory  extends AbstractTestCase<SplitConnector> implements SplitFactory{

    public SplitConnectorFactory()
    {
        super(SplitConnector.class);
    }
    public SplitConnector getMyConnector()
    {
        SplitConnector connector = super.getConnector();
        return connector;
    }

    public void init() throws Exception
    {
        super.init();
    }

    public void shutdown() throws Exception
    {
        super.shutdown();
    }
}