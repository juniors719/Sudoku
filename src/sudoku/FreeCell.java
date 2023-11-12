package sudoku;

// Classe que representa uma célula livre do tabuleiro.
// Herda de Cell, pois uma célula livre é uma célula.

public class FreeCell extends Cell {

    // Construtor
    public FreeCell(int value) {
        // Inicializa o valor da célula
        // value = 0 -> célula livre
        super(value);
    }

}