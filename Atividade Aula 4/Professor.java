class Professor extends Pessoa{
    private String matricula_Professor;
    private String disciplina_Professor;
    private double salario_Professor;

    public String getMatricula_Professor() {
        return this.matricula_Professor;
    }

    public void setMatricula_Professor(String matricula_Professor) {
        this.matricula_Professor = matricula_Professor;
    }

    public String getDisciplina_Professor() {
        return this.disciplina_Professor;
    }

    public void setDisciplina_Professor(String disciplina_Professor) {
        this.disciplina_Professor = disciplina_Professor;
    }

    public double getSalario_Professor() {
        return this.salario_Professor;
    }

    public void setSalario_Professor(double salario_Professor) {
        this.salario_Professor = salario_Professor;
    }

    public Professor (String nome_Professor, String  matricula_Professor, String disciplina_Professor, Double salario_Professor ){
        this.disciplina_Professor = disciplina_Professor;
        this.nome_Professor = nome_Professor;
        this.matricula_Professor = matricula_Professor;
        this.salario_Professor = salario_Professor;
    }

}

