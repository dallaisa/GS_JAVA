package model;

/**
 * Representa um bioma com suas características principais.
 */
public class Bioma {
    private int idBioma;
    private String nome, clima, fauna, flora;

    /**
     * Construtor para inicializar um bioma com suas informações básicas.
     *
     * @param id     Identificador único do bioma.
     * @param nome   Nome do bioma (ex: Amazônia, Cerrado).
     * @param clima  Descrição do clima predominante.
     * @param fauna  Fauna típica do bioma.
     * @param flora  Flora típica do bioma.
     */
    public Bioma(int id, String nome, String clima, String fauna, String flora) {
        this.idBioma = id;
        this.nome = nome;
        this.clima = clima;
        this.fauna = fauna;
        this.flora = flora;
    }

    /**
     * Retorna uma descrição resumida do clima e da fauna do bioma.
     *
     * @return String com o clima e fauna separados por "/".
     */
    public String getDescricaoClimaFauna() {
        return clima + " / " + fauna;
    }
}
