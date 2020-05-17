package hu.lottery.screen

import hu.lottery.model.FiveTicket

interface FiveScoreScreen {

    fun showWinnerNumbers(numbers :List<Int>)

    fun showLastWeekTickets(tickets: List<FiveTicket>)
}