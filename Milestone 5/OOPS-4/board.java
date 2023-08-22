public class board {

    private char board[][];
    private int boardsize = 3;
    private int count;
    private char p1symbol, p2symbol;
    private static final char EMPTY = ' ';

    public static final int player1win = 1;
    public static final int player2win = 2;
    public static final int draw = 3;
    public static final int incomplete = 4;
    public static final int invalid = 5;

    board(char p1symbol, char p2symbol) {
        board = new char[boardsize][boardsize];
        for (int i = 0; i < boardsize; i++) {
            for (int j = 0; j < boardsize; j++) {
                board[i][j] = EMPTY;
            }
        }
        this.p1symbol = p1symbol;
        this.p2symbol = p2symbol;
    }

    public void print() {
        System.out.println("---------------");
        for (int i = 0; i < boardsize; i++) {
            for (int j = 0; j < boardsize; j++) {
                System.out.print("| " + board[i][j] + " |");
            }
            System.out.println();
        }
        System.out.println();
        System.out.println("--------------");
    }

    public int move(char symbol, int x, int y) {
        if (x < 0 || x >= boardsize || y < 0 || y >= boardsize || board[x][y] != EMPTY) {
            return invalid;
        }
        board[x][y] = symbol;
        count++;
        // row
        if (board[x][0] == board[x][1] && board[x][0] == board[x][2]) {
            return symbol == p1symbol ? player1win : player2win;
        }
        // coloum
        if (board[0][y] == board[1][y] && board[0][y] == board[2][y]) {
            return symbol == p1symbol ? player1win : player2win;
        }
        // diagonals
        if (board[0][0] != EMPTY && board[0][0] == board[1][1] && board[0][0] == board[2][2]) {
            return symbol == p1symbol ? player1win : player2win;
        }
        if (board[0][2] != EMPTY && board[0][2] == board[1][1] && board[0][2] == board[2][0]) {
            return symbol == p1symbol ? player1win : player2win;
        }
        if (count == boardsize * boardsize) {
            return draw;
        }
        return incomplete;

    }
}
