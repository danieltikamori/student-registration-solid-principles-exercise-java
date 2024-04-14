import cc.tkmr.model.Aluno;
import cc.tkmr.model.RegistroAluno;

import java.util.ArrayList;
import java.util.Scanner;

// A classe RegistroAluno gerencia as operações de registro de alunos


public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Criando uma instância da classe RegistroAluno
        RegistroAluno registroAluno = new RegistroAluno();

        // Entrada do usuário
        String input = scanner.nextLine();

        // Separando nome e ID
        String[] dadosAluno = input.split(", ");

        // Criando uma instância da classe Aluno com as informações fornecidas pelo usuário
        Aluno aluno = new Aluno(dadosAluno[0], dadosAluno[1]);

        // TODO: Chamar o método para adicionar o aluno usando a classe RegistroAluno

        // Fechando o scanner
        scanner.close();
    }
}