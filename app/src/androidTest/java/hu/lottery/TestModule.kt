package hu.lottery

import android.content.Context
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

@Module
class TestModule(private val context: Context) {

    @Provides
    fun provideContext() = context

    @Provides
    @Singleton
    fun provideMainPresenter() = MainPresenter()

    @Provides
    @Singleton
    fun provideArtistsPresenter() = ArtistsPresenter(executor, artistsInteractor)

}