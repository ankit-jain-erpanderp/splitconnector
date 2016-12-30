package org.mule.modules.split;

import java.lang.reflect.InvocationTargetException;

/**
 * Created by java on 6/12/16.
 */
public interface SplitFactory {

    SplitClientInterface getMyConnector() throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException;

    void init() throws Exception;

    void shutdown() throws Exception;
}
