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
        int line, column;
        System.out.println("informe a posicao do Robo (Linha e Coluna):");
        line = input.nextInt();
        column = input.nextInt();
        
        mig = new Robo(line, column, sala);
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
            
            if(option == 1){
                mig.andarFrente();
            }else if(option == 2){
                mig.andarTras();
            }else if(option == 3){
                mig.parar();
            }else if(option == 4){
                mig.virarDireita();
            }else if(option == 5){
                mig.virarEsquerda();
            }else{
                System.out.println("Saindo ...");
            }
            
        }while(option!=6);
    }
}
