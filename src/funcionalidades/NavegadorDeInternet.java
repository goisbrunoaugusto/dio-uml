package funcionalidades;

public interface NavegadorDeInternet {
    private void exibirPagina(String url){
        System.out.println("Exibindo página "+ url);
    }
    private void adicionarNovaAba(){
        System.out.println("Nova aba adicionada");
    }
    private void atualizarPagina(){
        System.out.println("Pagina atualizada");
    }
}
