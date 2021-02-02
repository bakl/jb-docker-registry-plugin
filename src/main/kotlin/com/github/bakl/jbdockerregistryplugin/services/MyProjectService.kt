package com.github.bakl.jbdockerregistryplugin.services

import com.github.bakl.jbdockerregistryplugin.MyBundle
import com.intellij.openapi.project.Project

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
