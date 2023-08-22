
/**
 * Tic-tac-toe
 */
import java.util.*;

public class Tic {

    private player player1, player2;
    private board board;
    private int numPlayer;

    public static void main(String[] args) {
        Tic t = new Tic();
        t.startgame();
    }

    public void startgame() {
        Scanner s = new Scanner(System.in);
        // take player input
        player1 = takeinput(++numPlayer);
        player2 = takeinput(++numPlayer);

        while (player1.getSymbol() == player2.getSymbol()) {
            System.out.println("Sysmbol already taken please enter another symbol ");
            player2.setSymbol(s.next().charAt(0));
        }
        // create the board
        board = new board(player1.getSymbol(), player2.getSymbol());
        // play the game
        boolean player1turn = true;

        int status = board.incomplete;

        while (status == board.incomplete || status == board.invalid) {

            if (player1turn) {
                System.out.println("PLayer-1 - " + player1.getName() + " 's turn : ");
                System.out.println("Enter x :");
                int x = s.nextInt();
                System.out.println("Enter y :");
                int y = s.nextInt();

                status = board.move(player1.getSymbol(), x, y);

                if (status == board.invalid) {
                    System.out.println("Invalid move !! try again");
                    continue;
                }
            } else {

                System.out.println("PLayer-2 - " + player2.getName() + " 's turn : ");
                System.out.println("Enter x :");
                int x = s.nextInt();
                System.out.println("Enter y :");
                int y = s.nextInt();

                status = board.move(player2.getSymbol(), x, y);

                if (status == board.invalid) {
                    System.out.println("Invalid move !! try again");
                    continue;
                }
            }
            player1turn = !player1turn;
            board.print();
        }
        if (status == board.player1win) {
            System.out.println("player 1 -" + player1.getName() + " win !!");
        } else if (status == board.player2win) {
            System.out.println("player 2 -" + player2.getName() + " win !!");
        } else {
            System.out.println("Draw !!!");
        }
    }

    private player takeinput(int num) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter player " + num + " name=");
        String name = sc.nextLine();
        System.out.println("Enter player " + num + " symol=");
        char symbol = sc.next().charAt(0);
        player p = new player(name, symbol);
        return p;
    }
}