import java.util.*;

public class Ex6{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in); 
		
		System.out.println("Digite 10 numeros.\nPrimeiro numero:");  
		int num1 = sc.nextInt();  
		System.out.println("Segundo numero:");  
		int num2 = sc.nextInt();  
		System.out.println("Terceiro numero:");  
		int num3 = sc.nextInt(); 
		System.out.println("Quarto numero:");  
		int num4 = sc.nextInt(); 
		System.out.println("Quinto numero:");  
		int num5 = sc.nextInt(); 
		System.out.println("Sexto numero:");  
		int num6 = sc.nextInt(); 
		System.out.println("Setimo numero:");  
		int num7 = sc.nextInt(); 
		System.out.println("Oitavo numero:");  
		int num8 = sc.nextInt(); 
		System.out.println("Nono numero:");  
		int num9 = sc.nextInt();
		System.out.println("Decimo numero:");  
		int num10 = sc.nextInt(); 
		
		int soma;
		soma = num1 + num2 + num3 + num4 + num5 + num6 + num7 + num8 + num9 + num10;
		
		System.out.println("O resultado da soma e: " + soma);
	}
}