import java.util.Date;

public class Funcionario extends Pessoa {
    public double salario;
    public String cargo;
    public Date dataAdmissao;

    public Funcionario(String _nome, String _cpf, Date _data, double _salario, String _cargo, Date _dataAdmissao) {
        super(_nome, _cpf, _data);
        this.salario = _salario;
        this.cargo = _cargo;
        this.dataAdmissao = _dataAdmissao;
    }
}
