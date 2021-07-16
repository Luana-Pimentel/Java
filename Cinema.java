import java.util.*;

public class Cinema{
	public static void main(String[] args){

		Scanner sc = new Scanner(System.in); 
		
		System.out.println("Ola, bem-vindo(a) ao Cinemas Jailson.\n Por favor, digite seu nome");
		String nome = sc.next();
		int erro, sessao;
		String fileira;
		try{
			do{
				System.out.println("\n Ola " + nome + ", as sessoes disponiveis sao: \n 1- As Branquelas (sala Alpha) \n 2- A Chegada (sala Beta) \n 0- Sair");
				sessao = sc.nextInt();
				erro=0;
				if(sessao==0){
					System.exit(0);
				}else if(sessao == 1){
					System.out.println("A sessao escolhida foi: AS BRANQUELAS.");
					int A_DEF=12, A_A=20, A_B=20, A_C=24, A_D=24, A_E=26, A_F=26;

					//A (Alpha) + _ + número da fileira
					do{
						System.out.println("Os acentos disponiveis sao: \n \n Deficiente (DEF)-" + A_DEF +" \n A-" + A_A + "    B-" + A_B + "    C-" + A_C + " \n D-" + A_D + "    E-" + A_E + "    F-" + A_F + " \n Qual a fileira escolhida ");
						fileira = sc.next().toUpperCase();
						if (fileira.equalsIgnoreCase("A") || fileira.equalsIgnoreCase("B") || fileira.equalsIgnoreCase("C") || fileira.equalsIgnoreCase("D") || fileira.equalsIgnoreCase("E") || fileira.equalsIgnoreCase("F") || fileira.equalsIgnoreCase("DEF")){
							erro =0;
						}else{
							erro =2;
							System.out.println(" \n Fileira nao encontrada. \n ");
						}
					}while(erro==2);
					
					System.out.println("Quantos acentos voce quer escolher ? \n Por favor, escolha a quantidade de lugares disponiveis.");
					do{
						int lugar = sc.nextInt();
						if(fileira.equalsIgnoreCase("DEF")){
							A_DEF -= lugar;
						}else if(fileira.equalsIgnoreCase("A")){
							A_A -= lugar;
						}else if(fileira.equalsIgnoreCase("B")){
							A_B -= lugar;
						}else if(fileira.equalsIgnoreCase("C")){
							A_C -= lugar;
						}else if(fileira.equalsIgnoreCase("D")){
							A_D -= lugar;
						}else if(fileira.equalsIgnoreCase("E")){
							A_E -= lugar;
						}else if(fileira.equalsIgnoreCase("F")){
							A_F -= lugar;
						}

						if(A_DEF<0 || A_A<0 || A_B<0 || A_C<0 || A_D<0 || A_E<0 || A_F<0){
							erro ++;
							System.out.println("Nao e possivel escolher fileiras negativas. \n Por favor, tente novamente. \n ");
						}
					}while(erro==2);
						
					System.out.println("Luagres vagos: \n DEF=" + A_DEF + " \n A=" + A_A + " \n B=" + A_B + " \n C=" + A_C + " \n D=" + A_D + " \n E=" + A_E + " \n F=" + A_F);
					
					System.out.println("Obrigado por escolher o Cinemas Jailson " + nome );
				}else if(sessao == 2){

					System.out.println("A sessao escolhida foi: A CHEGADA.");
					int B_DEF=12, B_A=20, B_B=24, B_C=24, B_D=26, B_E=26;

					//B (Beta) + _ + número da fileira
					do{
						System.out.println("Os acentos disponiveis sao: \n Deficiente-" + B_DEF + " \n A-" + B_A + "    B-" + B_B + "    C-" + B_C + " \n D-" + B_D + "    E-" + B_E + " \n Qual a fileira desejada?");
						fileira = sc.next().toUpperCase();

						if (fileira.equalsIgnoreCase("A") || fileira.equalsIgnoreCase("B") || fileira.equalsIgnoreCase("C") || fileira.equalsIgnoreCase("D") || fileira.equalsIgnoreCase("E") || fileira.equalsIgnoreCase("DEF")){
							erro=1;
						}else{
							erro =2;
							System.out.println(" \n Fileira nao encontrada ");
						}
					}while(erro == 1);
					
					System.out.println("Quantos acentos voce quer escolher ? \n Por favor, escolha a quantidade de lugares disponiveis.");
					do{
						int lugar = sc.nextInt();
						if(fileira.equalsIgnoreCase("DEF")){
							B_DEF -= lugar;
						}else if(fileira.equalsIgnoreCase("A")){
							B_A -= lugar;
						}else if(fileira.equalsIgnoreCase("B")){
							B_B -= lugar;
						}else if(fileira.equalsIgnoreCase("C")){
							B_C -= lugar;
						}else if(fileira.equalsIgnoreCase("D")){
							B_D -= lugar;
						}else if(fileira.equalsIgnoreCase("E")){
							B_E -= lugar;
						}
						
						if(B_DEF<0 || B_A<0 || B_B<0 || B_C<0 || B_D<0 || B_E<0){
							erro=1;
							System.out.println("Nao e possivel escolher fileiras negativas. \n Por favor, tente novamente. \n");
						}
					}while(erro==2);
						
					System.out.println("Lugares vagos:  \n DEF=" + B_DEF + " \n A=" + B_A + "B=" + B_B + " \n C=" + B_C + " \n D=" + B_D + " \n E=" + B_E);
					
					System.out.println("Obrigado por escolher o Cinemas Jailson " + nome);
				}else{
					System.out.println("NUMERO INVALIDO.");
					erro=1;
				}

			}while(erro==1);

		} catch(Exception e) {
			System.out.print("Nao e possivel ler o valor digitado");
		}
	}
}