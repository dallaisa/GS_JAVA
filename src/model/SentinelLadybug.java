package model;

import java.time.LocalDate;
import java.time.LocalDateTime;

/**
 * Classe que representa um Sentinel do tipo "Ladybug" (joaninha robô sensor),
 * focado na detecção e análise de sons ambientais.
 * Estende a classe abstrata Sentinel.
 */
public class SentinelLadybug extends Sentinel {
    private double lat, lon;              // Coordenadas geográficas do sensor
    private String tipoSom;               // Tipo de som detectado (ex: canto, estridulação)
    private double intensidadeSom;        // Intensidade do som em decibéis (dB)
    private LocalDateTime dhUltimoAlerta; // Data e hora do último alerta emitido

    /**
     * Construtor que inicializa o SentinelLadybug com localização, tipo e intensidade de som,
     * status ativo e data de ativação atual.
     *
     * @param id Identificador único do SentinelLadybug.
     * @param lat Latitude da localização.
     * @param lon Longitude da localização.
     * @param som Tipo do som detectado.
     * @param intensidade Intensidade do som em dB.
     * @param bioma Bioma onde o Sentinel está inserido.
     */
    public SentinelLadybug(int id, double lat, double lon, String som, double intensidade, Bioma bioma) {
        super(id, "ativo", LocalDate.now(), bioma);
        this.lat = lat;
        this.lon = lon;
        this.tipoSom = som;
        this.intensidadeSom = intensidade;
        this.dhUltimoAlerta = LocalDateTime.now();
    }

    /**
     * Retorna um diagnóstico resumido do SentinelLadybug,
     * informando seu ID, tipo de som detectado e a intensidade em decibéis.
     *
     * @return Diagnóstico básico em formato String.
     */
    @Override
    public String diagnostico() {
        return "LADYBUG " + id + "| Som: " + tipoSom + " | Intensidade: " + intensidadeSom + " dB";
    }
}
