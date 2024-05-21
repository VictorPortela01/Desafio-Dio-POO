package classes;

import Interfaces.NavegadorInternet;

public class Internet implements NavegadorInternet {

    @Override
    public void exibirPagina(String url) {
       System.out.println("Navegando na página "+url);
    }

    @Override
    public void adicionarAba() {
        System.out.println("Criando uma nova aba");
    }

    @Override
    public void atualizarPagina() {
        System.out.println("Atualizando página");
    }
    
}