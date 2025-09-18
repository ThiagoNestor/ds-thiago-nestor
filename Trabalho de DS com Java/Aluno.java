import java.util.Date;

public class Aluno extends Pessoa {
    public String matricula;

    public Aluno(String _nome, String _cpf, Date _data, String _matricula) {
        super(_nome, _cpf, _data);
        this.matricula = _matricula;
    }

    @Override
    public double tirarCopias(int qtd) {
        return 0.07 * (double) qtd; // desconto para alunos
    }
}
