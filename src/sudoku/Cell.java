package sudoku;

// Classe que representa uma célula do tabuleiro.
// Possui métodos comuns a todas as células, sendo ela fixa ou livre.

public class Cell {

    // Atributos
    private int value; // Valor da célula

    // Construtor
    public Cell(int value) {
        // Inicializa o valor da célula
        // value = 0 -> célula livre
        this.value = value;
    }

    // Getters e Setters
    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

}
