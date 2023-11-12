package sudoku;

// Classe que representa o tabuleiro do jogo
// Contém uma matriz 9x9 de células

public class Board {

    // Atributos
    private Cell[][] cells; // Matriz de células

    // Construtor
    public Board() {
        // Inicializa a matriz de células
        cells = new Cell[9][9];
        // Preenche a matriz com células livres
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                cells[i][j] = new FreeCell(0);
            }
        }
    }

    // Getters e Setters
    public Cell[][] getCells() {
        return cells;
    }

    // Retorna a célula na posição (i, j)
    public Cell getCell(int i, int j) {
        return cells[i][j];
    }

    // Altera a célula na posição (i, j)
    public void setCell(int i, int j, Cell cell) {
        cells[i][j] = cell;
    }

    // Retorna o valor da célula na posição (i, j)
    public int getValue(int i, int j) {
        return cells[i][j].getValue();
    }

    // Altera o valor da célula na posição (i, j)
    public void setValue(int i, int j, int value) {
        cells[i][j].setValue(value);
    }

    // Verifica se o tabuleiro está completo
    public boolean isComplete() {
        // TODO
        return false;
    }

    // Verifica se o tabuleiro é válido
    public boolean isValid() {
        // TODO
        return false;
    }

    // Verifica se o tabuleiro é válido na linha i
    private boolean isValidRow(int i) {
        // TODO
        return false;
    }

    // Verifica se o tabuleiro é válido na coluna j
    private boolean isValidColumn(int j) {
        // TODO
        return false;
    }

    // Verifica se o tabuleiro é válido no bloco (i, j)
    private boolean isValidBlock(int i, int j) {
        // TODO
        return false;
    }

    // Verifica se o tabuleiro é válido na linha i, coluna j e bloco (i, j)
    private boolean isValid(int i, int j) {
        // TODO
        return false;
    }

    // toString
    // Método que vai imprimir o tabuleiro na tela
    @Override
    public String toString() {
        // imprime as coordenadas das colunas na cor azul
        String azul = "\033[35m";
        String reset = "\033[0m";
        String str = azul + "  a b c   d e f   g h i\n" + reset;
        // imprime as coordenadas das linhas
        for (int i = 0; i < 9; i++) {
            str += azul + i + reset + " ";
            // imprime as células da linha i
            for (int j = 0; j < 9; j++) {
                // se for 0, imprime um espaço em branco
                if (cells[i][j].getValue() == 0) {
                    str += "  ";
                }
                // se não, imprime o valor da célula
                else {
                    str += cells[i][j].getValue() + " ";
                }
                // imprime as divisões entre os blocos
                if (j == 2 || j == 5) {
                    str += "| ";
                }
            }
            str += "\n";
            // imprime as divisões entre os blocos
            if (i == 2 || i == 5) {
                str += "  ------+-------+------\n";
            }
        }
        return str;
    }
}
