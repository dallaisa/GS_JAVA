package model;

import java.time.LocalDateTime;

/**
 * Representa o envio de um alerta a uma comunidade específica, registrando
 * o meio de envio, status e horário.
 */
public class AlertaComunidade {
    private Alerta alerta;
    private Comunidade comunidade;
    private LocalDateTime dataEnvio;
    private String status, meio;

    /**
     * Constrói um objeto AlertaComunidade com os dados fornecidos.
     *
     * @param alerta      O alerta que será enviado.
     * @param comunidade  A comunidade que receberá o alerta.
     * @param meio        O meio utilizado para o envio (ex: SMS, rádio, aplicativo).
     */
    public AlertaComunidade(Alerta alerta, Comunidade comunidade, String meio) {
        this.alerta = alerta;
        this.comunidade = comunidade;
        this.meio = meio;
        this.status = "Enviado";
        this.dataEnvio = LocalDateTime.now();
    }

    /**
     * Retorna um resumo do status de envio do alerta para a comunidade.
     *
     * @return Uma string indicando o meio e o horário do envio.
     */
    public String statusEnvio() {
        return "Enviado via " + meio + " em " + dataEnvio.toLocalTime();
    }
}
