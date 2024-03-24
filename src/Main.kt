//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
class ChessGame {
    private val board = Array(8) { Array(8) { "-" } }

    init {
        initializeBoard()
    }

    private fun initializeBoard() {
        // Placing white pieces
        board[0][0] = "R"; board[0][1] = "N"; board[0][2] = "B"; board[0][3] = "Q"
        board[0][4] = "K"; board[0][5] = "B"; board[0][6] = "N"; board[0][7] = "R"
        for (i in 0 until 8) board[1][i] = "P"

        // Placing black pieces
        board[7][0] = "r"; board[7][1] = "n"; board[7][2] = "b"; board[7][3] = "q"
        board[7][4] = "k"; board[7][5] = "b"; board[7][6] = "n"; board[7][7] = "r"
        for (i in 0 until 8) board[6][i] = "p"
    }

    fun printBoard() {
        for (i in 0 until 8) {
            for (j in 0 until 8) {
                print("${board[i][j]} ")
            }
            println()
        }
    }

    fun movePiece(fromRow: Int, fromCol: Int, toRow: Int, toCol: Int) {
        val piece = board[fromRow][fromCol]
        if (piece == "-") {
            println("No piece to move at ($fromRow, $fromCol)")
            return
        }


        board[fromRow][fromCol] = "-"
        board[toRow][toCol] = piece
    }
}

fun main() {
    val game = ChessGame()
    game.printBoard()

    // Example moves
    game.movePiece(6, 4, 4, 4) // Black pawn moves
    game.movePiece(1, 1, 2, 1) // White pawn moves
    game.movePiece(7, 2, 5, 4) // Black bishop moves
    game.movePiece(0, 3, 4, 7) // White queen captures black bishop
    game.printBoard()
}
