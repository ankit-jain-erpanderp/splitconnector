package org.mule.modules.split;

import java.lang.reflect.InvocationTargetException;

/**
 * Created by java on 6/12/16.
 */
public class SplitClientFactory implements SplitFactory {
    public SplitClient getMyConnector() throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException {
        return new SplitClient();
    }

    public void init() throws Exception {

    }

    public void shutdown() throws Exception {

    }
}
