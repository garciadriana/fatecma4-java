package br.com.br;

public class Processo {

    private final Advogado advogado;
    private final Processante processante;
    private final Juiz juiz;
    private int numero;
    private String abertura;

    public Processo(Juiz juiz) {
        this.advogado = new Advogado();
        this.processante = new Processante();
        this.juiz = juiz;
    }

    public String capaProcesso() {
        return "Numero do Processo: " + numero + " \nAbertura do Processo: "
                + abertura + "\n"
                + "Nome do Processante: "+processante.getNome()+"\n"
                + "Nome do Advogado: "+advogado.getNome()+"\n"
                + "Nome do Juiz: "+juiz.getNome()+"\n"
                + "CPF do Processante: "+processante.getCpf()+"\n"
                + "Area: "+advogado.getArea()+"\n"
                + "Vara: "+juiz.getVara()+"\n";
                 
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getAbertura() {
        return abertura;
    }

    public void setAbertura(String abertura) {
        this.abertura = abertura;
    }

    public Advogado getAdvogado() {
        return advogado;
    }

    public Processante getProcessante() {
        return processante;
    }
    
}
