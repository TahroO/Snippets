/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package assessment;

import org.junit.Test;

import static org.junit.Assert.assertNotNull;

class AppTest {
    @Test void appHasAGreeting() {
        App classUnderTest = new App();
        assertNotNull(classUnderTest.getGreeting(), "app should have a greeting");
    }
}
