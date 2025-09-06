package projeto_java_dia_28;

public class bla28 {

	public class Carro {
	    private String nomeModelo;
	    protected double precoAno1;
	    protected double precoAno2;
	    protected double precoAno3;
	    
	    // Setter do nome do carro
	    public void setNomeModelo(String nomeModelo) {
	        this.nomeModelo = nomeModelo;
	    }

	    // Setter dos preços
	    public void setPrecos(double precoAno1, double precoAno2, double precoAno3) {
	        this.precoAno1 = precoAno1;
	        this.precoAno2 = precoAno2;
	        this.precoAno3 = precoAno3;
	    }

	    // Método para calcular o menor preço
	    public double calcularMenorPreco() {
	        double menorPreco = precoAno1;

	        if (precoAno2 < menorPreco) {
	            menorPreco = precoAno2;
	        }
	        if (precoAno3 < menorPreco) {
	            menorPreco = precoAno3;
	        }

	        return menorPreco;
	    }

	    // Método para calcular o maior preço
	    public double calcularMaiorPreco() {
	        double maiorPreco = precoAno1;

	        if (precoAno2 > maiorPreco) {
	            maiorPreco = precoAno2;
	        }
	        if (precoAno3 > maiorPreco) {
	            maiorPreco = precoAno3;
	        }

	        return maiorPreco;
	    }

	    // Exibir informações do carro
	    public void exibeInformacaoCarro() {
	        System.out.println("Nome do carro: " + nomeModelo);
	        System.out.println("Menor preço: " + calcularMenorPreco());
	        System.out.println("Maior preço: " + calcularMaiorPreco());
	    }
	}


	}


