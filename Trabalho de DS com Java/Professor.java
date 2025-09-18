import java.util.Date;

public class Professor extends Pessoa {
    public double salario;
    public String disciplina;

    public Professor(String _nome, String _cpf, Date _data, double _salario, String _disciplina) {
        super(_nome, _cpf, _data);
        this.salario = _salario;
        this.disciplina = _disciplina;
    }
}
