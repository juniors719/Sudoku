package sudoku;

// Classe que representa uma célula fixa do tabuleiro.
// Herda de Cell, pois uma célula fixa é uma célula.

public class FixedCell extends Cell {

    // Construtor
    public FixedCell(int value) {
        // Inicializa o valor da célula
        // value = 0 -> célula livre
        super(value);
    }

    // Sobrescreve o método setValue da classe Cell
    // Não faz nada, pois uma célula fixa não pode ter seu valor alterado
    @Override
    public void setValue(int value) {
    }

}