package model;

import java.time.LocalDateTime;

/**
 * Representa um alerta emitido por um Sentinel em caso de risco ou ocorrência.
 */
public class Alerta {

    private int id;
    private String tipoOrigem;
    private String descricao;
    private int nivel;
    private LocalDateTime dataHora;
    private Sentinel sentinel;

    /**
     * Construtor da classe Alerta.
     *
     * @param id          Identificador único do alerta.
     * @param tipoOrigem  Tipo de origem do alerta.
     * @param nivel       Nível de gravidade do alerta.
     * @param descricao   Descrição do alerta.
     * @param sentinel    Sentinel que gerou o alerta.
     */
    public Alerta(int id, String tipoOrigem, int nivel, String descricao, Sentinel sentinel) {
        this.id = id;
        this.tipoOrigem = tipoOrigem;
        this.nivel = nivel;
        this.descricao = descricao;
        this.sentinel = sentinel;
        this.dataHora = LocalDateTime.now();
    }

    /**
     * Emite um resumo textual do alerta.
     *
     * @return String resumida contendo o nível, origem e descrição do alerta.
     */
    public String emitirResumo() {
        return "Alerta Nível " + nivel + " emitido por " + tipoOrigem + ": " + descricao;
    }
}
