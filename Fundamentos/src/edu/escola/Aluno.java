package edu.escola;

public class Aluno {
    private String nome;
    private int idade;

    public Aluno(int idade, String nome) {
        this.idade = idade;
        this.nome = nome;
    }

    

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    
}
