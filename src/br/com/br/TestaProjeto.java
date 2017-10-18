package br.com.br;

public class TestaProjeto {

    public static void main(String[] args) {
        Juiz geraldo = new Juiz();
        geraldo.setNome("Geralt d'Rivia");
        geraldo.setVara(19);
        Processo p14 = new Processo(geraldo);
        p14.getAdvogado().setNome("Avhalac");
        p14.getAdvogado().setArea("Novigrad");
        p14.getProcessante().setNome("Dijkstra");
        p14.getProcessante().setCpf("123.123.123-12");
        p14.setAbertura("23/1/1254");
        p14.setNumero(14);
        
        String capaProcesso = p14.capaProcesso();
        System.out.println(capaProcesso);
    }

}
