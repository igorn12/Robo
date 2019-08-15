package robo;

public class Ambiente {
    private int qtdLinhas;
    private int qtdColunas;

    public Ambiente(int qtdLinhas, int qtdColunas) {
        this.qtdLinhas = qtdLinhas;
        this.qtdColunas = qtdColunas;
    }

    public int getQtdLinhas() {
        return qtdLinhas;
    }

    public void setQtdLinhas(int qtdLinhas) {
        this.qtdLinhas = qtdLinhas;
    }

    public int getQtdColunas() {
        return qtdColunas;
    }

    public void setQtdColunas(int qtdColunas) {
        this.qtdColunas = qtdColunas;
    }
    
    
}
