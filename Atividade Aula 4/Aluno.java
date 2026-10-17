class Aluno extends Pessoa{
   private String matricula_Aluno;
   private double media;
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
       if (media < 0){
         throw new IllegalArgumentException("A média não pode ser negativa: " + media);
       }
        this.media = media;
    }

    public Aluno(String nome_Aluno, String matricula_Aluno, double media){
        this.nomePessoa = nome_Aluno;
        this.matricula_Aluno = matricula_Aluno;
        this.media = media;
    }

   void foiAprovado(boolean mediaTotal){
        if (getMedia() >= 7){      
            System.out.println("Aprovado");

        }else if(getMedia() <= 0 ){
            System.out.println("Media invalida");
        }
        else{
            System.out.println("Reprovado");
        }
   }
   
}