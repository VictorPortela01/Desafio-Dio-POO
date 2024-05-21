import Interfaces.AparelhoTelefonico;
import Interfaces.NavegadorInternet;
import Interfaces.ReprodutorMusical;
import classes.Internet;
import classes.Ipod;
import classes.Telefone;

public class Iphone implements AparelhoTelefonico,NavegadorInternet,ReprodutorMusical{
    public static void main(String[] args) {
        AparelhoTelefonico AF = new Telefone();
        AF.ligar("88992890633");
        AF.atender();
        AF.iniciarCorreiosVoz();

        NavegadorInternet NI = new Internet();
        NI.exibirPagina("Exibindo página da GOOGLE");
        NI.adicionarAba();
        NI.atualizarPagina();

        ReprodutorMusical RP = new Ipod();
        RP.selecionarMusica("Higher");
        RP.tocar();
        RP.pausar();
    }

    @Override
    public void tocar() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'tocar'");
    }

    @Override
    public void pausar() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'pausar'");
    }

    @Override
    public void selecionarMusica(String musica) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'selecionarMusica'");
    }

    @Override
    public void exibirPagina(String url) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'exibirPagina'");
    }

    @Override
    public void adicionarAba() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'adicionarAba'");
    }

    @Override
    public void atualizarPagina() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'atualizarPagina'");
    }

    @Override
    public void ligar(String numero) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'ligar'");
    }

    @Override
    public void atender() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'atender'");
    }

    @Override
    public void iniciarCorreiosVoz() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'iniciarCorreiosVoz'");
    }
}