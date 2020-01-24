/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package bingo;

import org.gradle.testfixtures.ProjectBuilder;
import org.gradle.api.Project;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 * A simple unit test for the 'bingo.greeting' plugin.
 */
public class BingoPluginTest {
    @Test public void pluginRegistersATask() {
        // Create a test project and apply the plugin
        Project project = ProjectBuilder.builder().build();
        project.getPlugins().apply("bingo.greeting");

        // Verify the result
        assertNotNull(project.getTasks().findByName("greeting"));
    }
}
