import java.util.*;
public class Parada {
    public static void main(String[] args) {    

        Scanner sc = new Scanner(System.in); 
        
        Onibus Onibus1 = new Onibus("Volvo", "Volvo", 2, 30, 0, 600, 16);
        Onibus1.returnPassageiro_maximo();
        Onibus1.returnReabastecer();

        System.out.println("O onibus vai partir, com " + Onibus1.returnAssentosVagos() + " assentos vagos. Quantos passageiros vao subir?");
        Onibus1.definirEntrada(0);
        System.out.println("Com " + Onibus1.returnAssentosOcupados() + " assentos ocupados e " + Onibus1.returnAssentosVagos() + " acentos vagos, qual vai ser o percurso (em km) ate a proxima parada?");
        Onibus1.definirPercurso(0);

        Onibus1.liga();

        //primeira parada
        Onibus1.desliga();

        System.out.println("Chegamos a primeira parada com " + Onibus1.returnAssentosOcupados() + " passageiros no onibus. Quantas pessoas vao descer?");
        Onibus1.definirSaida(0);
        System.out.println("Com " + Onibus1.returnAssentosOcupados() + " passageiros no onibus. Quantas pessoas entram nessa parada?");
        Onibus1.definirEntrada(0);
        System.out.println("Com " + Onibus1.returnCombustivel() + "litros de gasolina. Gostaria de reabastecer? \n true - Reabastecer \n false - Nao reabastecer \n ");
        Onibus1.definirReabastecer(0);
        System.out.println("Com " + Onibus1.returnAssentosOcupados() + " assentos ocupados e " + Onibus1.returnAssentosVagos() + " acentos vagos, qual vai ser o percurso (em km) ate a proxima parada?");
        Onibus1.definirPercurso(0);
        
        Onibus1.liga();

        //segunda parada
        Onibus1.desliga();

        System.out.println("Chegamos a segunda parada com " + Onibus1.returnAssentosOcupados() + " passageiros no onibus. Quantas pessoas vao descer?");
        Onibus1.definirSaida(0);
        System.out.println("Com " + Onibus1.returnAssentosOcupados() + " passageiros no onibus. Quantas pessoas vao entrar nessa parada?");
        Onibus1.definirEntrada(0);
        System.out.println("Com " + Onibus1.returnCombustivel() + "litros de gasolina. Gostaria de reabastecer? \n true - Reabastecer \n false - Nao reabastecer \n");
        Onibus1.definirReabastecer(0);
        System.out.println("Com " + Onibus1.returnAssentosOcupados() + " assentos ocupados e " + Onibus1.returnAssentosVagos() + " acentos vagos, qual vai ser o percurso (em km) ate a proxima parada?");
        Onibus1.definirPercurso(0);
        
        Onibus1.liga();

        //última parada
        Onibus1.desliga();

        System.out.println("Chegamos a parada final com " + Onibus1.returnAssentosOcupados() + " passageiros no onibus e todos vao ter que descer.");
        Onibus1.returnParadaFinal();
        System.out.println("Com " + Onibus1.returnAssentosOcupados() + " assentos ocupados e " + Onibus1.quantidade_combustivel + " litros de gasolina no tanque.\n Obrigado pela preferencia.");
   }
}