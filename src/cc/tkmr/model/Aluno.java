package cc.tkmr.model;

// A classe cc.tkmr.infrastructure.Aluno representa as informações do aluno
class Aluno {
    private String nome;
    private String id;

    // Construtor da classe cc.tkmr.infrastructure.Aluno
    public Aluno(String nome, String id) {
        this.nome = nome;
        this.id = id;
    }

    // Getters para obter informações do aluno
    public String getNome() {
        return nome;
    }

    public String getId() {
        return id;
    }
}
