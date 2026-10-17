public class Funcionarios {
    private String nomeFuncionario;
    private String cpfFuncionario;
    private Double salario;

    public Funcionarios (String nome, String cpf, double salario){
            this.nomeFuncionario = nome;
            this.cpfFuncionario = cpf;
            this.salario = salario;
        }
    public void AumentarSalario(double percentual){
        salario = salario + (salario * percentual);
    }

    public String getNome() {
        return nomeFuncionario;
    }
    public void setNomeFuncionario(String nome) {
        this.nomeFuncionario = nome;
    }
    public String getCpfFuncionario() {
        return cpfFuncionario;
    }
    public void setCpf(String cpf) {
        this.cpfFuncionario = cpf;
    }
    public Double getSalario() {
        return salario;
    }
    public void setSalario(Double salario) {
        this.salario = salario;
    }

   
}
