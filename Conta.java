import java.util.*;
class Conta{
    Scanner sc = new Scanner(System.in); 

    
    String nome;
    int numeroConta;
    String agencia;
    double saldo;
    String dataAbertura;

    public Conta(String nome, int numeroConta, String agencia, double saldo, String dataAbertura){
        this.nome = nome;
        this.numeroConta = numeroConta;
        this.agencia = agencia;
        this.saldo = saldo;
        this.dataAbertura = dataAbertura;
    }

    
    public String returNome(){
        return this.nome;
    }

  
    public int returnNumeroConta(){
        return this.numeroConta;
    }

    public String returnAgencia(){
        return this.agencia;
    }

    public double returnSaldo(){
        return this.saldo;
    }

    public String returnDataAbertura(){
        return this.dataAbertura;
    }

    public void Sacar(double saque){
        saque=sc.nextDouble();
        saldo = saldo - saque;
        System.out.println(saldo);
    }

    public void Depositar(double deposito){
        deposito=sc.nextDouble();
        saldo = saldo + deposito;
        System.out.println(saldo);
    }

    public void Renda(){
        saldo = saldo + (saldo * 0.05);
        System.out.println(saldo);
    }
}