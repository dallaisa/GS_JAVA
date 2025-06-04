package model;

public class Bioma {
    private int idBioma;
    private String nome, clima, fauna, flora;

    public Bioma(int id, String nome, String clima, String fauna, String flora) {
        this.idBioma = id;
        this.nome = nome;
        this.clima = clima;
        this.fauna = fauna;
        this.flora = flora;
    }

    public String getDescricaoClimaFauna() {
        return clima + " / " + fauna;
    }
}
