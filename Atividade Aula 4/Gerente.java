class Gerente extends Funcionarios{
    private double bonificacao;
    
     public Gerente(String nome, String cpf, double salario, double bonificacao) {
        super(nome, cpf, salario);
        this.bonificacao = bonificacao;
    }

    public double getBonificacao() {
    return bonificacao;
    }
}
