package robo;

public class Robo {
    private int linha;
    private int coluna;
    private Ambiente sala;

    public Robo(int linha, int coluna, Ambiente sala) {
        this.linha = linha;
        this.coluna = coluna;
        this.sala = sala;
    }
    public void mostrarPosicao(){
        System.out.println("[Robo] está na posicao: "+linha+","+coluna+" da sala!");
    }
    public void andarFrente(){
        if(linha >= 0 && linha < sala.getQtdLinhas()){
            System.out.println("[Robo]: Andando para frente!");
            linha++;
        }else{
            System.out.println("Bateu na parede, faça outro movimento!");
        }
    }
    
    public void andarTras(){
        if(linha > 0 && linha <= sala.getQtdLinhas()){
            System.out.println("[Robo]: Andando para trás!");
            linha--;
        }else{
            System.out.println("Bateu na parede, faça outro movimento!");
        }
        
    }
    
    public void virarDireita(){
        if(coluna >= 0 && coluna < sala.getQtdColunas()){
            System.out.println("[Robo]: Virando a direita!");
            coluna++;
        }else{
            System.out.println("Bateu na parede, faça outro movimento!");
        }
    }
    
    public void virarEsquerda(){
        if(coluna > 0 && coluna <= sala.getQtdColunas()){
            System.out.println("[Robo]: Virando a esquerda!");
            coluna--;
        }else{
            System.out.println("Bateu na parede, faça outro movimento!");
        }
    }
    
    public void parar(){
        System.out.println("[Robo]: está parado!");
    }
}
