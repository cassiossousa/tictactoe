package tictactoe;

import java.util.Scanner;

/**
 * @author Cassio dos Santos Sousa
 * @version 1.0
 */
public class Person extends Player {

    public Person(boolean isCross, boolean isFirst) {
        super(isCross, isFirst);
    }

    protected int nextPlay(Board gameBoard) {
        System.out.print("Make your move: ");
        Scanner sc = new Scanner(System.in);
        return sc.nextInt();
    }
}
