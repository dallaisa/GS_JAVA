package model;

import java.time.LocalDateTime;

public class AlertaComunidade {
    private Alerta alerta;
    private Comunidade comunidade;
    private LocalDateTime dataEnvio;
    private String status, meio;

    public AlertaComunidade(Alerta alerta, Comunidade comunidade, String meio) {
        this.alerta = alerta;
        this.comunidade = comunidade;
        this.meio = meio;
        this.status = "Enviado";
        this.dataEnvio = LocalDateTime.now();
    }

    public String statusEnvio() {
        return "Enviado via " + meio + " em " + dataEnvio.toLocalTime();
    }
}
