class Disciplina{
    private string nome = "Porgramação Orientada à Objetos";
    private int cargHoraria = 90 ; 

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome; 
    }
    
    public int getCargHoraria() {
        return this.cargHoraria;
    }

    public void setCargHoraria(int cargHoraria) {
        this.cargHoraria = cargHoraria; 
    }
   

    void resumo (String resumo){
        return System.out.println("Disciplina: " + nome + "Carga Horária: " + cargHoraria ) ;
    }
}