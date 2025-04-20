import java.util.Scanner;

public class exercicio08 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite um valor de N maior que zero: ");
		int N = sc.nextInt();
		
		for(int i = 1; i <=N; i++) {
			System.out.println(i);
		}
		
		sc.close();

	}

}