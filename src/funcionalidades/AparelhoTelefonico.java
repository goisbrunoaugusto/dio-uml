package funcionalidades;

public interface AparelhoTelefonico {
   private void ligar(String numero){
       System.out.println("Ligando para "+ numero);
   };
   private void atender(){
       System.out.println("Ligação atendida.");
   };
   private void iniciarCorrerioVoz(){
       System.out.println("Apos o sinal deixe sua mensagem.");
   };
}

