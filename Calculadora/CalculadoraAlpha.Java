import java.util.Scanner;
import java.time.LocalDate;
import java.time.Month;

public class CalculadoraAlpha {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcao;
        
        System.out.println("====================================");
        System.out.println("    CALCULADORA ALPHA - BEM-VINDO   ");
        System.out.println("====================================");
        
        do {
            System.out.println("\nMENU PRINCIPAL:");
            System.out.println("1 - Operações Básicas");
            System.out.println("2 - Descobrir Signo Zodiacal");
            System.out.println("3 - Calcular Raiz Quadrada");
            System.out.println("0 - Sair");
            System.out.print("Escolha uma opção: ");
            
            opcao = scanner.nextInt();
            
            switch(opcao) {
                case 1:
                    operacoesBasicas(scanner);
                    break;
                case 2:
                    descobrirSigno(scanner);
                    break;
                case 3:
                    calcularRaizQuadrada(scanner);
                    break;
                case 0:
                    System.out.println("Obrigado por usar a Calculadora Alpha!");
                    break;
                default:
                    System.out.println("Opção inválida! Tente novamente.");
            }
        } while(opcao != 0);
        
        scanner.close();
    }
    
    // Método para operações básicas
    public static void operacoesBasicas(Scanner scanner) {
        System.out.println("\n--- OPERAÇÕES BÁSICAS ---");
        System.out.print("Digite o primeiro número: ");
        double num1 = scanner.nextDouble();
        System.out.print("Digite o segundo número: ");
        double num2 = scanner.nextDouble();
        
        System.out.println("\nEscolha a operação:");
        System.out.println("1 - Soma");
        System.out.println("2 - Subtração");
        System.out.println("3 - Multiplicação");
        System.out.println("4 - Divisão");
        System.out.print("Opção: ");
        int operacao = scanner.nextInt();
        
        double resultado = 0;
        String simbolo = "";
        
        switch(operacao) {
            case 1:
                resultado = num1 + num2;
                simbolo = "+";
                break;
            case 2:
                resultado = num1 - num2;
                simbolo = "-";
                break;
            case 3:
                resultado = num1 * num2;
                simbolo = "×";
                break;
            case 4:
                if(num2 == 0) {
                    System.out.println("Erro: Divisão por zero!");
                    return;
                }
                resultado = num1 / num2;
                simbolo = "÷";
                break;
            default:
                System.out.println("Operação inválida!");
                return;
        }
        
        System.out.printf("\nResultado: %.2f %s %.2f = %.2f\n", num1, simbolo, num2, resultado);
    }
    
    // Método para descobrir signo zodiacal
    public static void descobrirSigno(Scanner scanner) {
        System.out.println("\n--- SIGNO ZODIACAL ---");
        System.out.print("Digite o dia do nascimento (1-31): ");
        int dia = scanner.nextInt();
        System.out.print("Digite o mês do nascimento (1-12): ");
        int mes = scanner.nextInt();
        
        // Validação básica da data
        try {
            LocalDate.of(2000, mes, dia); // Ano arbitrário (2000) para validação
        } catch(Exception e) {
            System.out.println("Data inválida!");
            return;
        }
        
        String signo = "";
        
        if ((mes == 3 && dia >= 21) || (mes == 4 && dia <= 19)) {
            signo = "Áries";
        } else if ((mes == 4 && dia >= 20) || (mes == 5 && dia <= 20)) {
            signo = "Touro";
        } else if ((mes == 5 && dia >= 21) || (mes == 6 && dia <= 20)) {
            signo = "Gêmeos";
        } else if ((mes == 6 && dia >= 21) || (mes == 7 && dia <= 22)) {
            signo = "Câncer";
        } else if ((mes == 7 && dia >= 23) || (mes == 8 && dia <= 22)) {
            signo = "Leão";
        } else if ((mes == 8 && dia >= 23) || (mes == 9 && dia <= 22)) {
            signo = "Virgem";
        } else if ((mes == 9 && dia >= 23) || (mes == 10 && dia <= 22)) {
            signo = "Libra";
        } else if ((mes == 10 && dia >= 23) || (mes == 11 && dia <= 21)) {
            signo = "Escorpião";
        } else if ((mes == 11 && dia >= 22) || (mes == 12 && dia <= 21)) {
            signo = "Sagitário";
        } else if ((mes == 12 && dia >= 22) || (mes == 1 && dia <= 19)) {
            signo = "Capricórnio";
        } else if ((mes == 1 && dia >= 20) || (mes == 2 && dia <= 18)) {
            signo = "Aquário";
        } else if ((mes == 2 && dia >= 19) || (mes == 3 && dia <= 20)) {
            signo = "Peixes";
        }
        
        System.out.println("\nSeu signo zodiacal é: " + signo);
    }
    
    // Método para calcular raiz quadrada
    public static void calcularRaizQuadrada(Scanner scanner) {
        System.out.println("\n--- RAIZ QUADRADA ---");
        System.out.print("Digite um número: ");
        double numero = scanner.nextDouble();
        
        if(numero < 0) {
            System.out.println("Não é possível calcular raiz quadrada de número negativo!");
            return;
        }
        
        double raiz = Math.sqrt(numero);
        System.out.printf("\nA raiz quadrada de %.2f é %.2f\n", numero, raiz);
    }
}