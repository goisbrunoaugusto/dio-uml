import aparelhos.IPhone;

public class Main {
    public static void main(String[] args) {
        IPhone iphone = new IPhone();
        iphone.atualizarPagina();
        iphone.ligar("98897998");
        iphone.adicionarNovaAba();
        iphone.atender();
        iphone.exibirPagina("web.dio.me");
    }
}