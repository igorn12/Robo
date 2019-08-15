package robo;

public class Robo {
    private int linha;
    private int coluna;
    private Ambiente sala;
    //private final int fatorMovimento;
    
    /*questão 3 --
    private static final int fatorMovimento = 2;*/

    public Robo(int linha, int coluna, Ambiente sala/*, int fatorMovimento*/) {
        this.linha = linha;
        this.coluna = coluna;
        this.sala = sala;
        //this.fatorMovimento = fatorMovimento;
    }
    
    public void mostrarPosicao(){
        System.out.println("[Robo] está na posicao: "+linha+","+coluna+" da sala!");
    }
    
    public void andarFrente(){
        if(linha >= 0 && linha < sala.getQtdLinhas()){
            System.out.println("[Robo]: Andando para frente!");
            linha++;
            //linha += fatorMovimento;
        }else{
            System.out.println("Bateu na parede, faça outro movimento!");
        }
    }
    
    public void andarTras(){
        if(linha > 0 && linha <= sala.getQtdLinhas()){
            System.out.println("[Robo]: Andando para trás!");
            linha--;
            //linha -= fatorMovimento;
        }else{
            System.out.println("Bateu na parede, faça outro movimento!");
        }
        
    }
    
    public void parar(){
        System.out.println("[Robo]: está parado!");
    }
    
    public void virarDireita(){
        if(coluna >= 0 && coluna < sala.getQtdColunas()){
            System.out.println("[Robo]: Virando a direita!");
            coluna++;
            //coluna += fatorMovimento;
        }else{
            System.out.println("Bateu na parede, faça outro movimento!");
        }
    }
    
    public void virarEsquerda(){
        if(coluna > 0 && coluna <= sala.getQtdColunas()){
            System.out.println("[Robo]: Virando a esquerda!");
            coluna--;
            //coluna -= fatorMovimento;
        }else{
            System.out.println("Bateu na parede, faça outro movimento!");
        }
    }
}
