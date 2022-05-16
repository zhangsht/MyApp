package com.test.myapp.base

import com.test.myapp.dagger.RepoGraph
import com.test.myapp.dagger.RepoSubcomponentModule
import dagger.Component
import javax.inject.Singleton

/**
 * 描述：dagger组件：满足其提供的类型所需的依赖项
 *
 * @author n10029
 * 日期 22/5/16 10:37
 */
@Singleton
@Component(modules = [RepoSubcomponentModule::class])
interface ApplicationGraph {
    fun repoSubcomponent(): RepoGraph.Factory
}