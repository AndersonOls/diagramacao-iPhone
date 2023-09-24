public class Iphone implements AparelhoTelefonico, NavegadorInternet, ReprodutorMusical{
    private String modelo;
    private String cor;
    private double tamanhoTela;
    private int memoria;
    private boolean ligado;

    // Construtor da classe iPhone
    public void iPhone(String modelo, String cor, double tamanhoTela, int memoria) {
        this.modelo = modelo;
        this.cor = cor;
        this.tamanhoTela = tamanhoTela;
        this.memoria = memoria;
        this.ligado = false;
    }

    // Métodos da classe iPhone
    public String getModelo() {
        return modelo;
    }

    public String getCor() {
        return cor;
    }

    public double getTamanhoTela() {
        return tamanhoTela;
    }

    public int getMemoria() {
        return memoria;
    }

    public boolean isLigado() {
        return ligado;
    }

    public void ligar() {
        if (!ligado) {
            ligado = true;
            System.out.println("iPhone ligado.");
        }
    }

    public void desligar() {
        if (ligado) {
            ligado = false;
            System.out.println("iPhone desligado.");
        }
    }

    // Métodos da interface ReprodutorMusical
    @Override
    public void tocar() {
        if (ligado) {
            System.out.println("Tocando música.");
        }
    }

    @Override
    public void pausar() {
        if (ligado) {
            System.out.println("Pausando música.");
        }
    }

    @Override
    public void selecionarMusica(String musica) {
        if (ligado) {
            System.out.println("Selecionando música: " + musica);
        }
    }

    // Métodos da interface AparelhoTelefonico
    @Override
    public void ligar(String numero) {
        if (ligado) {
            System.out.println("Ligando para: " + numero);
        }
    }

    @Override
    public void atender() {
        if (ligado) {
            System.out.println("Atendendo chamada.");
        }
    }

    @Override
    public void iniciarCorreioVoz() {
        if (ligado) {
            System.out.println("Iniciando correio de voz.");
        }
    }

    // Métodos da interface NavegadorInternet
    @Override
    public void exibirPagina(String url) {
        if (ligado) {
            System.out.println("Exibindo página: " + url);
        }
    }

    @Override
    public void adicionarNovaAba() {
        if (ligado) {
            System.out.println("Adicionando nova aba.");
        }
    }

    @Override
    public void atualizarPagina() {
        if (ligado) {
            System.out.println("Atualizando página.");
        }
    }
}
