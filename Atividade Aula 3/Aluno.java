class Aluno{
   private String nome_Aluno;
   private String matricula_Aluno;
   private double media;

    public String getName() {
        return this.nome_Aluno;
    }

    public void setName(String nome_Aluno) {
        this.nome_Aluno = nome_Aluno; 
    }
   
    public String getMatricula_Aluno() {
        return this.matricula_Aluno;
    }

    public void setMatricula_Aluno(String matricula_Aluno) {
        this.matricula_Aluno = matricula_Aluno;
    }

    public double getMedia() {
        return this.media;
    }

    public void setMedia(double media) {
        this.media = media;
    }

   void foiAprovado(boolean mediaTotal){
    if (media >= 7){
        mediaTotal = true; 
        System.out.println("Aprovado");

    }else{
        System.out.println("Reprovado");
    }
   }
   
}