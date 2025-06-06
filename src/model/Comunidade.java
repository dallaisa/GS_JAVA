package model;

/**
 * Representa uma comunidade localizada em um determinado bioma,
 * com informações sobre nome, responsável, contato, região e quantidade de habitantes.
 */
public class Comunidade {
    private int id;
    private String nome, responsavel, contato, regiao;
    private int qtdHabitantes;
    private Bioma bioma;

    /**
     * Construtor para inicializar uma comunidade com todos os seus dados.
     *
     * @param id Identificador único da comunidade.
     * @param nome Nome da comunidade.
     * @param resp Nome do responsável pela comunidade.
     * @param contato Informação de contato da comunidade.
     * @param regiao Região onde a comunidade está localizada.
     * @param qtd Quantidade de habitantes da comunidade.
     * @param bioma Bioma onde a comunidade está inserida.
     */
    public Comunidade(int id, String nome, String resp, String contato, String regiao, int qtd, Bioma bioma) {
        this.id = id;
        this.nome = nome;
        this.responsavel = resp;
        this.contato = contato;
        this.regiao = regiao;
        this.qtdHabitantes = qtd;
        this.bioma = bioma;
    }

    /**
     * Retorna um resumo básico da comunidade contendo seu nome,
     * população e descrição do clima e fauna do bioma onde está inserida.
     *
     * @return Resumo em formato de string.
     */
    public String getResumo() {
        return nome + " (" + qtdHabitantes + " habs.) - " + bioma.getDescricaoClimaFauna();
    }
}
