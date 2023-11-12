import sudoku.Board;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("-------- SUDOKU --------");
        Board board = new Board();
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println(board);
            // lê os comandos na tela
            String command = scanner.nextLine();
            // dá split no comando
            String[] tokens = command.split(" ");

            if (tokens[0].equals("exit")) {
                break;
            } else if (tokens[0].equals("in")) {
                // comando que insere um valor na célula (i, j)
                int i = Integer.parseInt(tokens[1]);
                int j = Integer.parseInt(tokens[2]);
                int value = Integer.parseInt(tokens[3]);
                board.setValue(i, j, value);
            }
        }
    }
}