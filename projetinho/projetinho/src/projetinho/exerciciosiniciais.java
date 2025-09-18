package projetinho;

public class exerciciosiniciais {

	public class ExerciciosIniciais {
	    public static void main(String[] args) {
	        
	        // 1. Exibir informações pessoais
	        String nome = "Carlos";
	        int idade = 25;
	        String cidade = "São Paulo";
	        System.out.println("Informações pessoais:");
	        System.out.println("Nome: " + nome + ", Idade: " + idade + ", Cidade: " + cidade);
	        System.out.println("--------------------------------");

	        // 2. Soma de dois números
	        int numero1 = 10;
	        int numero2 = 20;
	        int soma = numero1 + numero2;
	        System.out.println("Soma de " + numero1 + " + " + numero2 + " = " + soma);
	        System.out.println("--------------------------------");

	        // 3. Conversão de temperatura (Celsius -> Fahrenheit)
	        double celsius = 30.0;
	        double fahrenheit = (celsius * 9/5) + 32;
	        System.out.println(celsius + "°C em Fahrenheit é: " + fahrenheit + "°F");
	        System.out.println("--------------------------------");

	        // 4. Mensagem personalizada
	        String nomeUsuario = "Maria";
	        System.out.println("Bem-vindo(a), " + nomeUsuario + "!");
	        System.out.println("--------------------------------");

	        // 5. Desafio extra
	        String nomePessoa = "João";
	        int idadePessoa = 28;
	        double alturaPessoa = 1.75;
	        System.out.println("Olá, meu nome é " + nomePessoa + 
	                           ", tenho " + idadePessoa + " anos e " + 
	                           alturaPessoa + "m de altura.");
	    }
	}

}
