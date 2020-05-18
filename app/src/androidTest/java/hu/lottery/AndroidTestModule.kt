package hu.lottery

import android.content.Context
import dagger.Module
import dagger.Provides
import hu.lottery.model.interactor.DatabaseInteractor
import hu.lottery.model.interactor.WinnerNumberInteractor
import hu.lottery.presenter.*
import hu.lottery.view.UIModule
import javax.inject.Singleton

@Module
class AndroidTestModule(context: Context) {

        private val uiModule: UIModule = UIModule(context)

        @Provides
        fun provideContext(): Context {
            return uiModule.context()
        }


    @Provides
    @Singleton
    fun menuPresenter() : MenuPresenter{return uiModule.menuPresenter()}

    @Provides
    @Singleton
    fun sixScorePresenter(databaseInteractor: DatabaseInteractor, winnerNumberInteractor: WinnerNumberInteractor) : SixScorePresenter{return uiModule.sixScorePresenter(databaseInteractor,winnerNumberInteractor)}

    @Provides
    @Singleton
    fun fiveScorePresenter(databaseInteractor: DatabaseInteractor, winnerNumberInteractor: WinnerNumberInteractor):FiveScorePresenter{return uiModule.fiveScorePresenter(databaseInteractor,winnerNumberInteractor)}

    @Provides
    @Singleton
    fun weeklyPresenter(databaseInteractor: DatabaseInteractor) : WeeklyPresenter{return uiModule.weeklyPresenter(databaseInteractor)}

    @Provides
    @Singleton
    fun fivePresenter(databaseInteractor: DatabaseInteractor): FivePresenter{return uiModule.fivePresenter(databaseInteractor)}

    @Provides
    @Singleton
    fun sixPresenter(databaseInteractor: DatabaseInteractor) : SixPresenter{return uiModule.sixPresenter(databaseInteractor)}

    @Provides
    @Singleton
    fun loginPresenter(databaseInteractor: DatabaseInteractor): LoginPresenter{return uiModule.loginPresenter(databaseInteractor)}


}