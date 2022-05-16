package com.test.myapp.dagger

import dagger.Subcomponent

/**
 * 描述：dagger组件：满足其提供的类型所需的依赖项
 *
 * @author n10029
 * 日期 22/5/16 10:37
 */
@FragmentScope
@Subcomponent
interface RepoGraph {

    @Subcomponent.Factory
    interface Factory {
        fun create(): RepoGraph
    }

    fun repository(): UserRepository

    fun inject(daggerFragment: DaggerFragment)
}