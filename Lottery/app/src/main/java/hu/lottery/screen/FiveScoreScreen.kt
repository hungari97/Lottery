package hu.lottery.screen

interface FiveScoreScreen {

    fun showWinnerNumbers(numbers :ArrayList<Int>)

    fun showLastWeekTickets(tickets: List<ArrayList<Int>>)
}