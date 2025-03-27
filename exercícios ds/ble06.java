import java.util.Scanner; // Import the Scanner class;
public class ble06 {
    public static void main(String args[]){

        //variaveis
        Double div = 0.0;
        Double mult = 0.0;

        //valores
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite a quilometragem da viagem: ");
        double km = sc.nextDouble();

        System.out.println("Digite o preço do combustivel por litro: ");
        double comb = sc.nextDouble();

        System.out.println("Digite o preço do consumo do veiculo: ");
        double con = sc.nextDouble();

        //operacoes
        div = km/con;
        mult = div*comb;

        //resultados
        System.out.println("O consumo estimado de combustivel para essa viagem é de "+ mult + "km/l");

        //fecha
        sc.close();
    }
}