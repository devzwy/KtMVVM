package com.github.devzwy.ktmvvm.services

import com.intellij.openapi.project.Project
import com.github.devzwy.ktmvvm.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
