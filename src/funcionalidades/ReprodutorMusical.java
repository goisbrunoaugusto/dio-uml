package funcionalidades;

import java.util.Scanner;

public interface ReprodutorMusical {
    private void tocar(String musica){
        System.out.println("Tocando a musica" + musica);
    }
    private void pausar(){
        System.out.println("Pausando a musica");
    }
    private void selecionarMusica(){
        System.out.println("Digite o nome do musica");
        Scanner sc = new Scanner(System.in);
        String musica = sc.nextLine();
        System.out.println("Musica selecionada: " + musica);
        sc.close();
    }
}
