import java.util.Date;

public class EscolaMain {
    public static void main(String[] args) {
        // Criando os objetos
        Aluno aluno = new Aluno("José Francisco", "123.456.789-00", new Date(), "A12345");
        Professor professor = new Professor("Maria Silva", "987.654.321-00", new Date(), 3500.00, "Matemática");
        Funcionario funcionario = new Funcionario("Carlos Souza", "111.222.333-44", new Date(), 2500.00, "Secretário", new Date());

        // Quantidade de cópias
        int qtdCopias = 100;

        // Exibindo resultados
        System.out.println("===== Valores de cópias =====");
        System.out.println("Aluno: " + aluno.nome + " - Valor: R$ " + aluno.tirarCopias(qtdCopias));
        System.out.println("Professor: " + professor.nome + " - Valor: R$ " + professor.tirarCopias(qtdCopias));
        System.out.println("Funcionario: " + funcionario.nome + " - Valor: R$ " + funcionario.tirarCopias(qtdCopias));
    }
}
