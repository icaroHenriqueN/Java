
import java.util.Scanner;

public class jogodavelha {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char[][] jogodavelha = new char[3][3];
        System.out.println("Jogador 1 = x");
        System.out.println("Jogador 2 = o");

        boolean ganhou = false;
        int jogada = 1;
        char sinal;
        int linha = 0, coluna = 0;

        while (!ganhou) {
            if (jogada % 2 == 1) {
                System.out.println("Vez do jogador 1. Escalha linha e coluna( 1-3 ): ");
                sinal = 'x';
            } else {
                System.out.println("Vez do jogador 2. Escolhe linha e coluna ( 1-3 ): ");
                sinal = 'o';
            }

            boolean linhavalida = false;
            while (!linhavalida) {
                System.out.println("Entre com a linha ( 1 , 2 ou  3): ");
                linha = sc.nextInt();
                if (linha >= 1 && linha <= 3) {
                    linhavalida = true;
                } else {
                    System.out.println("Entrada invalida, tente novamente: ");
                }
            }
            boolean colunavalida = false;
            while (!colunavalida) {
                System.out.println("Entre com a coluna ( 1, 2 ou 3 ): ");
                coluna = sc.nextInt();
                if (coluna >= 1 && coluna <= 3) {
                    colunavalida = true;
                } else {
                    System.out.println("Entrada invalida, tente novamente: ");
                }
            }
            linha--;
            coluna--;

            if (jogodavelha[linha][coluna] == 'x' || jogodavelha[linha][coluna] == 'o') {
                System.out.println("Posicao ja usada, tente novamente: ");
            } else {
                jogodavelha[linha][coluna] = sinal;
                jogada++;
            }
            //Imprimi tabuleiro 

            for (int i = 0; i < jogodavelha.length; i++) {
                for (int j = 0; j < jogodavelha[i].length; j++) {
                    System.out.print(jogodavelha[i][j] + " | ");
                }
                System.out.println();
            }

            

            if ((jogodavelha[0][0] == 'x' && jogodavelha[0][1] == 'x' && jogodavelha[0][2] == 'x')
                    || (jogodavelha[1][0] == 'x' && jogodavelha[1][1] == 'x' && jogodavelha[1][2] == 'x')
                    || (jogodavelha[2][0] == 'x' && jogodavelha[2][1] == 'x' && jogodavelha[2][2] == 'x')
                    || (jogodavelha[0][0] == 'x' && jogodavelha[1][0] == 'x' && jogodavelha[2][0] == 'x')
                    || (jogodavelha[0][1] == 'x' && jogodavelha[1][1] == 'x' && jogodavelha[2][1] == 'x')
                    || (jogodavelha[0][2] == 'x' && jogodavelha[1][2] == 'x' && jogodavelha[2][2] == 'x')
                    || (jogodavelha[0][0] == 'x' && jogodavelha[1][1] == 'x' && jogodavelha[2][2] == 'x')
                    || //diagonal principal
                    (jogodavelha[0][2] == 'x' && jogodavelha[1][1] == 'x' && jogodavelha[2][0] == 'x')) //diagonal invertida   
            {
            
                ganhou = true;            
            System.out.println("Jogador 1 ganhou: ");
                      
        }else if((jogodavelha[0][0] =='o' &&jogodavelha[0][1]=='o' && jogodavelha[0][2]=='o' ) |
          (jogodavelha[1][0] =='o' &&jogodavelha[1][1]=='o' && jogodavelha[1][2]=='o' ) ||
          (jogodavelha[2][0] =='o' &&jogodavelha[2][1]=='o' && jogodavelha[2][2]=='o' ) ||
          (jogodavelha[0][0] =='o' &&jogodavelha[1][0]=='o' && jogodavelha[2][0]=='o' ) ||
          (jogodavelha[0][1] =='o' &&jogodavelha[1][1]=='o' && jogodavelha[2][1]=='o' ) ||
          (jogodavelha[0][2] =='o' &&jogodavelha[1][2]=='o' && jogodavelha[2][2]=='o' ) ||
          (jogodavelha[0][0] =='o' &&jogodavelha[1][1]=='o' && jogodavelha[2][2]=='o' ) ||
                //diagonal principal
          (jogodavelha[0][2] =='o' &&jogodavelha[1][1]=='o' && jogodavelha[2][0]=='o' ))            
           //diagonal invertida    
            
        {    
           ganhou = true;
        System.out.println("Jogador 2 ganhou: ");
        
                    
       }else if(jogada>9){
                ganhou = true;
                System.out.println("Não houve ganhador, empate!");
       }    
      }
    }             
}

