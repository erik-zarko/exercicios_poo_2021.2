class Aluno {

    //atributos de um aluno

    String nome;
    String matricula;
    float notaProva1;
    float notaProva2;
    float notaTrabalho;

    //metodos de um aluno

    double media(){
        return ((2.5*notaProva1)+(2.5*notaProva2)+(2*notaTrabalho))/7;
    }
    boolean estaAprovado(double media){
        if(media()>6){
            return true;
        }else {
            return false;
        }
    }

}
