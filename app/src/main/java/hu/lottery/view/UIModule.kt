package hu.lottery.view

import android.content.Context
import dagger.Module
import dagger.Provides
import hu.lottery.model.interactor.DatabaseInteractor
import hu.lottery.model.interactor.WinnerNumberInteractor
import hu.lottery.presenter.*
import java.util.concurrent.Executor
import java.util.concurrent.Executors
import javax.inject.Singleton

@Module
class UIModule(private val context: Context) {

    @Provides
    fun context() = context

    @Provides
    @Singleton
    fun menuPresenter() = MenuPresenter()

    @Provides
    @Singleton
    fun sixScorePresenter(databaseInteractor: DatabaseInteractor, winnerNumberInteractor: WinnerNumberInteractor) = SixScorePresenter(databaseInteractor,winnerNumberInteractor)

    @Provides
    @Singleton
    fun fiveScorePresenter(databaseInteractor: DatabaseInteractor, winnerNumberInteractor: WinnerNumberInteractor) = FiveScorePresenter(databaseInteractor,winnerNumberInteractor)

    @Provides
    @Singleton
    fun weeklyPresenter(databaseInteractor: DatabaseInteractor) = WeeklyPresenter(databaseInteractor)

    @Provides
    @Singleton
    fun fivePresenter(databaseInteractor: DatabaseInteractor) = FivePresenter(databaseInteractor)

    @Provides
    @Singleton
    fun sixPresenter(databaseInteractor: DatabaseInteractor) = SixPresenter(databaseInteractor)

    @Provides
    @Singleton
    fun loginPresenter(databaseInteractor: DatabaseInteractor) = LoginPresenter(databaseInteractor)

}