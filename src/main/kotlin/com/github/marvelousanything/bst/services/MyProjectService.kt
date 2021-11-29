package com.github.marvelousanything.bst.services

import com.intellij.openapi.project.Project
import com.github.marvelousanything.bst.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
