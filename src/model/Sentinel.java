package model;

import java.time.LocalDate;

public abstract class Sentinel implements ISentinel {
    protected int id;
    protected String status;
    protected LocalDate ativacao, desativacao;
    protected Bioma bioma;

    public Sentinel(int id, String status, LocalDate ativacao, Bioma bioma) {
        this.id = id;
        this.status = status;
        this.ativacao = ativacao;
        this.bioma = bioma;
    }

    public abstract String diagnostico();
}