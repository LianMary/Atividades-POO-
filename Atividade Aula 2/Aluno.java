class Aluno{
   string nome_Aluno;
   string matricula_Aluno;
   double media = 8;


   void foiAprovado(boolean mediaTotal){
    if (media >= 7){
        mediaTotal = true; 
        System.out.println("Aprovado");

    }
    else{
        System.out.println("Reprovado");
    }
   }
   
}