public class Vendedor extends Funcionarios {
 private double comissao;
    public Vendedor(String nome, String cpf, double salario, double comissao) {
        super(nome, cpf, salario);
        this.comissao = comissao;
    }
    public double getComissao() {
        return comissao;
    }

    Gerente g1 = new Gerente("Maria", "111.111.111-11", 5000, 1500);
    Vendedor v1 = new Vendedor("João", "222.222.222-22", 2500, 800);
    
    g1.aumentarSalario(10);   // método herdado de Funcionario

    System.out.println(g1.getSalario()); // 5500.0
    System.out.println(g1.getBonificacao()); // 1500.0
    System.out.println(v1.getComissao()); // 800.0

} 