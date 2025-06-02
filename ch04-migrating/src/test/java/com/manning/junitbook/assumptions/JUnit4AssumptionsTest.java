package com.manning.junitbook.assumptions;

import com.manning.junitbook.assumptions.environment.JavaSpecification;
import com.manning.junitbook.assumptions.environment.OperationSystem;
import com.manning.junitbook.assumptions.environment.TestsEnvironment;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import static org.junit.Assume.assumeTrue;

public class JUnit4AssumptionsTest {

    private static String EXPECTED_JAVA_VERSION = "1.8";
    private TestsEnvironment environment = new TestsEnvironment(
            new JavaSpecification(System.getProperty("java.vm.specification.version")),
            new OperationSystem(System.getProperty("os.name"), System.getProperty("os.arch"))
    );

    private SUT systemUnderTest = new SUT();

    @Before
    public void setUp() {
        assumeTrue(environment.isWindows());
    }

    @Test
    public void testNoJobToRun() {
        assumeTrue(environment.getJavaVersion().equals(EXPECTED_JAVA_VERSION));
        assertFalse(systemUnderTest.hasJobToRun());
    }

    @Test
    public void testJobToRun() {
        assumeTrue(environment.isAmd64Architecture());

        systemUnderTest.run(new Job());

        assertTrue(systemUnderTest.hasJobToRun());
    }
}