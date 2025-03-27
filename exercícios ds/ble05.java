import java.util.Scanner; //Import the Scanner class
public class ble05 {
    public static void main(String args[]){

        //numeros
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Digite um número de 1 a 10: ");
        int a = sc.nextInt();

        System.out.println("Digite outro número de 1 a 10: ");
        int b = sc.nextInt();


        //operacoes
        System.out.println("O valor do primeiro número é "+ a + " e o segundo número é " + b);

        //resultados
        System.out.println("Agora o primeiro é "+ b + " e o segundo é "+ a);

        //fecha
        sc.close();
        }
}
