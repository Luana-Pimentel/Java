import java.util.*;
class Elevador {
    Scanner sc = new Scanner(System.in); 

    int espaco_maximo;
    int espaco_ocupado;
    int espaco_livre;
    int botao_andar;
    int andar_atual;
    double forca_cabo; //em kg
    double peso; //em kg

    //Método construtor
    public Elevador(int botao_deslocar, int espaco_total, int espaco_ocupado, int espaco_livre, int andar_atual) {
        this.botao_deslocar = botao_deslocar;
        this.espaco_total = espaco_total;
        this.espaco_ocupado = espaco_ocupado;
        this.espaco_livre = espaco_livre;
        this.andar_atual=andar_atual;
    }

    public int returnEspacoOcupado()  {
        return this.espaco_ocupado = espaco_total - espaco_livre;
    }

    public int returnEspacoLivre()  {
        return this.espaco_total= espaco_total - espaco_ocupado;
    }

    public int returnAndares()  { 
        return this.botao_andar;
    }

    public int returnEspacoTotal()  { 
        return this.espaco_total;
    }

    public int returnAndarAtual()  { 
        return this.andar_atual;
    }

    public void definirAndares(int andar_destino) {
        andar_destino=sc.nextInt();
        if(andar_destino>botao_andar){
            System.out.println("Digite um numero menor que o total de andares. ");
        }else if(andar_destino>andar_atual){
            andar_atual=andar_destino;
            subir();
        }else if(andar_destino<andar_atual){
            andar_atual=andar_destino;
            descer();
        }else if(andar_destino==andar_atual){
            parado();
        }
        
    }

    void subir() {
        System.out.println("Fechar portas \n Subindo \n Abrir portas \n Andar requerido " + andar_atual);
    }

    void descer(){
        System.out.println("Fechar portas \n Descendo \n Abrir portas \n Andar requerido " + andar_atual);
    }

    void parado(){
        System.out.println("O elevador nao pode se movimentar, ja esta no andar requerido");
    }
}