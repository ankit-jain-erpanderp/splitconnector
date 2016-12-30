package org.mule.modules.split.automation.runner;

import org.junit.runners.Suite;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.mule.modules.split.SplitConnector;
import org.mule.modules.split.automation.functional.Test1;
import org.mule.tools.devkit.ctf.mockup.ConnectorTestContext;

@RunWith(Suite.class)
@Suite.SuiteClasses({
	Test1.class
})
public class FunctionalTestSuite {

	@BeforeClass
	public static void initialiseSuite(){

		ConnectorTestContext.initialize(SplitConnector.class);
	}

	@AfterClass
	public static void shutdownSuite() throws Exception{

		ConnectorTestContext.shutDown();
	}
}