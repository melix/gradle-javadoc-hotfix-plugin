package me.champeau.gradle

import org.gradle.api.Project
import org.gradle.testfixtures.ProjectBuilder
import org.junit.Test

class JavadocHotfixPluginTest {
    @Test
    void javadocFixToolIsApplied() {
        Project project = ProjectBuilder.builder().build()
        project.apply plugin: 'javadocHotfix'

        assert project.javadocHotfix.recursive == true
        assert project.javadocHotfix.check == false
    }
}