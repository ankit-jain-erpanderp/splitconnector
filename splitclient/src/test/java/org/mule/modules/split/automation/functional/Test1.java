package org.mule.modules.split.automation.functional;

import org.mule.modules.split.SplitClientInterface;
import org.mule.tools.devkit.ctf.junit.AbstractTestCase;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
public class Test1 extends AbstractTestCases {
	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void sampletest() {
        try {
			SplitClientInterface conn = getConnector();
           String greeting =  conn.greet("Ankit");
           assertTrue(greeting.length()>0);
        } catch (Exception e) {
            fail(e.getMessage());
        }
    }


	@After
	public void tearDown() throws Exception {

	}
//	public Test1() {
//		super(SplitConnector.class);
//	}
}