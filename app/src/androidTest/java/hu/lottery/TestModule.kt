package hu.lottery

import android.content.Context
import dagger.Module
import dagger.Provides
import hu.lottery.presenter.SixPresenter
import javax.inject.Singleton

@Module
class TestModule(private val context: Context) {

    @Provides
    fun provideContext() = context

    @Provides
    @Singleton
    fun provideSixPresenter() = SixPresenter()



}