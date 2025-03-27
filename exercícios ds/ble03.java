public class ble03  {
    public static void main(String args[]) {

        String nome = ("Jeremias");
        int salfix = 2000;
        int vendpm = 200;

        int div;
        int mult;
        int expo;

        //numeros
        System.out.println("O nome do vendedor é " + nome);
        System.out.println("O salário fixo é " + salfix);
        System.out.println("O total de vendas mensais é " + vendpm);

        //operacoes
        div = salfix/100;
        mult = vendpm*15;
        expo = salfix+mult;

        //resultados
        System.out.println("O nome do vendedor é " + nome +", o salário fixo é " + expo + " de acordo com total de vendas mensais.");
        
    }
}
