import java.util.*;

public class Ex7{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in); 
		
		System.out.println("Digite 10 numeros.\n Primeiro numero:");  
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
		
		int soma = 0;
		if (num1>=40){
			soma = soma + num1;
		}if (num2>=40){
			soma = soma + num2;
		}if (num3>=40){
			soma = soma + num3;
		}if (num4>=40){
			soma = soma + num4;
		}if (num5>=40){
			soma = soma + num5;
		}if (num6>=40){
			soma = soma + num6;
		}if (num7>=40){
			soma = soma + num7;
		}if (num8>=40){
			soma = soma + num8;
		}if (num9>=40){
			soma = soma + num9;
		}if (num10>=40){
			soma = soma + num10;
		}
		
		System.out.println("O resultado da soma dos numeros maiores que 40 e: " + soma);
	}
}
