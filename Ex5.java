import java.util.*; 

public class Ex5 {
	public static void main(String[] args) {  
	  
		Scanner sc = new Scanner(System.in); 
		
		System.out.println("Primeiro numero: ");
		int num1 = sc.nextInt();
		System.out.println("Segundo numero: ");
		int num2 = sc.nextInt(); 
		
		if ((num1>=0) && (num2>=0)){
		System.out.println("Verdadeiro");
		
		}
		else{
		System.out.println("Falso");
		}
		
	}
}