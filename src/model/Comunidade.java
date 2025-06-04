package model;

public class Comunidade {
    private int id;
    private String nome, responsavel, contato, regiao;
    private int qtdHabitantes;
    private Bioma bioma;

    public Comunidade(int id, String nome, String resp, String contato, String regiao, int qtd, Bioma bioma) {
        this.id = id;
        this.nome = nome;
        this.responsavel = resp;
        this.contato = contato;
        this.regiao = regiao;
        this.qtdHabitantes = qtd;
        this.bioma = bioma;
    }

    public String getResumo() {
        return nome + " (" + qtdHabitantes + " habs.) - " + bioma.getDescricaoClimaFauna();
    }
}