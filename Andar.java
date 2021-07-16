import java.util.*;
public class Andar {
    public static void main(String[] args) {    

        Scanner sc = new Scanner(System.in);
        int escolha;
        
        Elevador Elevador1 = new Elevador(10, 5, 0, 5, 0);
        Elevador1.returnEspacoOcupado();
        Elevador1.returnEspacoLivre();

        System.out.println("O elevavor está no andar  " + Elevador1.andar_atual + ". ");

        do{
            System.out.println("Qual andar ? ");
            Elevador1.definirAndares(0);

            System.out.println("Para sair, digite 0. mPara continuar digite qualquer outro valor : ");
            escolha = sc.nextInt();
        }while(escolha!=0);

    }
}