package aparelhos;

import funcionalidades.AparelhoTelefonico;
import funcionalidades.NavegadorDeInternet;
import funcionalidades.ReprodutorMusical;

import java.util.Scanner;

public class IPhone implements AparelhoTelefonico, NavegadorDeInternet, ReprodutorMusical {
    public IPhone() {
    }
    public void tocar(String musica){
        System.out.println("Tocando a musica no iPhone" + musica);
    }
    public void pausar(){
        System.out.println("Pausando a musica no iPhone");
    }
    public void selecionarMusica(){
        System.out.println("Digite o nome do musica no iPhone");
        Scanner sc = new Scanner(System.in);
        String musica = sc.nextLine();
        System.out.println("Musica selecionada no iPhone: " + musica);
        sc.close();
    }

    public void ligar(String numero){
        System.out.println("Ligando para "+ numero +" do iPhone");
    };
    public void atender(){
        System.out.println("Ligação atendida do iPhone.");
    };
    public void iniciarCorrerioVoz(){
        System.out.println("Apos o sinal deixe sua mensagem pro iPhone.");
    };
    public void exibirPagina(String url){
        System.out.println("Exibindo página "+ url + " no iPhone");
    }
    public void adicionarNovaAba(){
        System.out.println("Nova aba adicionada no iPhone");
    }
    public void atualizarPagina(){
        System.out.println("Pagina atualizada no iPhone");
    }
}

