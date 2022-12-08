package application;
import java.util.Locale;
import java.util.Scanner;

public class ProgramPares {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner (System.in);
		
		System.out.print("Quantos números vc vai digitar? ");
		int n = sc.nextInt();
		int [] vect = new int [n]; //instancia um vetor vect de tamanho n
		
		for (int i=0; i<n; i++) {
			System.out.print("Digite um número: ");
			vect[i]= sc.nextInt();		
		}
		
		int qtdpares = 0;
		
		System.out.println("\nNumeros Pares: ");
		for (int i=0; i<n; i++) {
			if (vect[i] % 2 == 0) {
			   System.out.printf("%d ", vect[i]);
			   qtdpares ++;
			}
		}
		
		System.out.printf("\n\nQUANTIDADE DE PARES = %d\n", qtdpares);

	}

}
