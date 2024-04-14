package cc.tkmr.model;

import cc.tkmr.infrastructure.MensagemHandler;

import java.util.ArrayList;
import java.util.List;

// A classe cc.tkmr.infrastructure.RegistroAluno gerencia as operações de registro de alunos
public class RegistroAluno {
    private List<Aluno> alunosRegistrados;

    // Construtor da classe cc.tkmr.infrastructure.RegistroAluno
    public RegistroAluno() {
        this.alunosRegistrados = new ArrayList<>();
        // Adiciona João, 123 na lista inicialmente
        this.alunosRegistrados.add(new Aluno("João", "123"));
    }

    // TODO: Implementar lógica para adicionar aluno à lista apenas se o ID não estiver duplicado
    // Dica: Utilize o método alunoJaRegistrado()
    public void adicionarAluno(Aluno aluno) {
        if (!alunoJaRegistrado(aluno)) {
            alunosRegistrados.add(aluno);
            MensagemHandler.exibirMensagem(aluno.getNome() + " adicionado.");
        } else {
            MensagemHandler.exibirMensagem("Aluno ja registrado.");
        }
    }

    // Método para verificar se um aluno já está registrado
    private boolean alunoJaRegistrado(Aluno aluno) {
        return alunosRegistrados.stream().anyMatch(a -> a.getId().equals(aluno.getId()));
    }
}
