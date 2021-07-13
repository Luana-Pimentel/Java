import java.util.*; 

public class Ex1 {
	public static void main(String[] args) {  
	  
		Scanner sc = new Scanner(System.in); 
		
		System.out.println("Digite um valor: ");  
		int numero = sc.nextInt();  
		
		if (numero>0){
			System.out.println("O numero digitado " + numero + " e positivo");

		} else if (numero<0){
			System.out.println("O numero digitado " + numero + " e negativo.");
			
		} else if (numero==0){
			System.out.println("O numero digitado " + numero + " e igual a 0.");
		}
  }
}