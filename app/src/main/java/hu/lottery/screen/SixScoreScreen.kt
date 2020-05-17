package hu.lottery.screen

import hu.lottery.model.SixTicket

interface SixScoreScreen {

    fun showWinnerNumbers(numbers :List<Int>)

    fun showLastWeekTickets(tickets: List<SixTicket>)

}