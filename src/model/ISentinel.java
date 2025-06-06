package model;

/**
 * Interface que representa um Sentinel (robô sensor) capaz de fornecer um diagnóstico resumido.
 */
public interface ISentinel {
    /**
     * Retorna um diagnóstico resumido do robô, com base nos seus sensores e dados coletados.
     *
     * @return Uma String contendo o diagnóstico atual do Sentinel.
     */
    String diagnostico();
}
