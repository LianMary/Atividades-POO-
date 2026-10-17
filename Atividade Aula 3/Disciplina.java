class Disciplina{
    private String nome_Materia = "Porgramação Orientada à Objetos";
    private int cargaHoraria = 90 ; 

    public String getNome() {
        return this.nome_Materia;
    }

    public void setNome(String nome_Materia) {
        this.nome_Materia = nome_Materia; 
    }
    
    public int getCargHoraria() {
        return this.cargaHoraria;
    }

    public void setCargHoraria(int cargaHoraria) {
        if (cargaHoraria < 0 || cargaHoraria == 0){
            throw new IllegalArgumentException("A Carga Horária não pode ser negativa. " + cargaHoraria);
        }
        this.cargaHoraria = cargaHoraria; 
    }
   
    public Disciplina (String nome_Materia, int cargaHoraria ){
        this.cargaHoraria = cargaHoraria;
        this.nome_Materia = nome_Materia;
    }
}