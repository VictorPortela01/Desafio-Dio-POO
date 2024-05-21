package classes;

import Interfaces.AparelhoTelefonico;

public class Telefone implements AparelhoTelefonico {

    @Override
    public void ligar(String numero) {
       System.out.println("Ligando para "+numero);
    }

    @Override
    public void atender() {
       System.out.println("Atendendo ...");
    }

    @Override
    public void iniciarCorreiosVoz() {
        System.out.println("Iniciando mensagem de voz.");
    }
    
}