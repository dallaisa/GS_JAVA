package model;

import java.time.LocalDateTime;

public class Alerta {
    private int id;
    private String tipoOrigem, descricao;
    private int nivel;
    private LocalDateTime dataHora;
    private Sentinel sentinel;

    public Alerta(int id, String tipoOrigem, int nivel, String descricao, Sentinel sentinel) {
        this.id = id;
        this.tipoOrigem = tipoOrigem;
        this.nivel = nivel;
        this.descricao = descricao;
        this.sentinel = sentinel;
        this.dataHora = LocalDateTime.now();
    }

    public String emitirResumo() {
        return "Alerta Nível " + nivel + " emitido por " + tipoOrigem + ": " + descricao;
    }
}