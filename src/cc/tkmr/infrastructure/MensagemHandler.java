package cc.tkmr.infrastructure;

// A classe cc.tkmr.infrastructure.MensagemHandler é responsável por exibir mensagens
public class MensagemHandler {
    private MensagemHandler() {
    }

    public static void exibirMensagem(String mensagem) {
        System.out.println(mensagem);
    }

    public static MensagemHandler createMensagemHandler() {
        return new MensagemHandler();
    }
}
