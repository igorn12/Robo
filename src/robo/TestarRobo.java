package robo;

import java.util.Scanner;

public class TestarRobo {
    Scanner input = new Scanner(System.in);
    private Ambiente sala;
    private Robo mig;
    
    public void definirAmbiente(){
        int linha, coluna;
        System.out.println("Defina o tamanho da sala (quantidade de linhas e colunas):");
        linha = input.nextInt();
        coluna = input.nextInt();
        
        sala = new Ambiente(linha, coluna);
        System.out.println("A sala tem tamanho: "+linha+" X "+coluna);
    }
    
    public void iniciarRobo(){
        int line, column;//, movimento;
        System.out.println("informe a posicao do Robo (Linha e Coluna):");
        line = input.nextInt();
        column = input.nextInt();
        //movimento = input.nextInt();
        
        mig = new Robo(line, column, sala/*, movimento*/);
        mig.mostrarPosicao();
    }
    
    public void menu(){
        int option;
        do{
            option=0;
            mig.mostrarPosicao();
            System.out.println("1 - Andar para frente");
            System.out.println("2 - Andar para trás");
            System.out.println("3 - Parar");
            System.out.println("4 - Virar para direita");
            System.out.println("5 - Virar para esquerda");
            System.out.println("6 - Sair");
            option = input.nextInt();
            
            switch(option){
                case 1:
                    mig.andarFrente();
                    break;
                case 2:
                    mig.andarTras();
                    break;
                case 3:
                    mig.parar();
                    break;
                case 4:
                    mig.virarDireita();
                    break;
                case 5:
                    mig.virarEsquerda();
                    break;
                case 6:
                    System.out.println("Saindo ...");
                    break;
            }
            
            
        }while(option!=6);
    }
}
