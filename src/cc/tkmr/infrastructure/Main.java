package cc.tkmr.infrastructure;

import cc.tkmr.model.Aluno;
import cc.tkmr.model.RegistroAluno;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Criando uma instância da classe cc.tkmr.model.RegistroAluno
        RegistroAluno registroAluno = new RegistroAluno();

        // Loop para continuar pedindo informações até que o usuário forneça as informações corretamente
        while (true) {
            // Entrada do usuário
            String input = scanner.nextLine();

            // Separando nome e ID
            String[] dadosAluno = input.split(", ");

            // Verificar se a entrada possui exatamente dois valores separados por vírgula
            if (dadosAluno.length == 2) {
                // Criando uma instância da classe cc.tkmr.infrastructure.Aluno com as informações fornecidas pelo usuário
                Aluno aluno = new Aluno(dadosAluno[0], dadosAluno[1]);

                // TODO: Chamar o método para adicionar o aluno usando a classe cc.tkmr.infrastructure.RegistroAluno
                registroAluno.adicionarAluno(aluno);

                // Fechando o scanner
                scanner.close();

                // Sai do loop após adicionar o aluno com sucesso
                break;
            } else {
                MensagemHandler.exibirMensagem("Por favor, informe o nome e o ID separados por vírgula.");
            }
        }
    }
}