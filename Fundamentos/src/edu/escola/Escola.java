package edu.escola;

public class Escola {
    public static void main(String[] args) {
        Aluno luis = new Aluno(25, "Luis");

        

        //luis.setNome("Luis Claudio");
        //luis.setIdade(22);

        System.out.println(luis.getNome() + " tem " + luis.getIdade() + " anos. ");
    }
}
