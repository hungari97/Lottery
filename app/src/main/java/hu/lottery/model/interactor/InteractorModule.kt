package hu.lottery.model.interactor

import dagger.Module
import dagger.Provides
import javax.inject.Singleton

@Module
class InteractorModule{

        @Provides
        @Singleton
        fun databaseInteractor() = DatabaseInteractor()


        @Provides
        @Singleton
        fun winnerNumberInteractor() = WinnerNumberInteractor()

}