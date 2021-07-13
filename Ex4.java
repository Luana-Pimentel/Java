import java.util.*; 

public class Ex4 {
	public static void main(String[] args) {  
	  
		Scanner sc = new Scanner(System.in); 
		
		System.out.println("Primeiro numero: ");
		int num1 = sc.nextInt();
		System.out.println("Segundo numero: ");
		int num2 = sc.nextInt(); 
		System.out.println("Selecione a operação que deseja realizar com esses numeros:1-Subtrair; \n2-Somar; \n3-Multiplicar;\n4-Dividir;");
		int opcao = sc.nextInt();
		
		if (opcao==1){
			System.out.println("A subtracao dos numeros e " + (num1-num2));

		}
		else if (opcao==2){
			System.out.println("A soma dos numeros e " + (num1+num2));

		}
		else if (opcao==3){
			System.out.println("A multiplicao dos numeros e " + (num1*num2));
			
		}
		else if (opcao==4){
			System.out.println("A divisao dos numeros e " + (num1/num2));
		}
  }
}
		
