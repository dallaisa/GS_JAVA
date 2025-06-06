package model;

import java.time.LocalDate;
import java.time.LocalDateTime;

/**
 * Classe que representa um Sentinel do tipo "Ant" (formiga robô sensor),
 * especializado na coleta de dados ambientais como temperatura, CO₂, metano, umidade,
 * e localização geográfica.
 * Estende a classe abstrata Sentinel.
 */
public class SentinelAnt extends Sentinel {
    private double lat, lon;          // Coordenadas geográficas
    private double umidade;           // Umidade ambiental
    private double temperatura;       // Temperatura medida em °C
    private double co2;               // Concentração de CO₂ em ppm
    private double metano;            // Concentração de metano em ppm
    private LocalDateTime dhUltimoAlerta; // Data e hora do último alerta emitido

    /**
     * Construtor que inicializa o SentinelAnt com dados ambientais e localização.
     * O status é definido como "ativo" e a data de ativação como a data atual.
     * O timestamp do último alerta também é inicializado com o momento atual.
     *
     * @param id Identificador único do SentinelAnt.
     * @param lat Latitude da localização.
     * @param lon Longitude da localização.
     * @param umidade Umidade ambiental atual.
     * @param temperatura Temperatura atual em °C.
     * @param co2 Concentração de CO₂ em ppm.
     * @param metano Concentração de metano em ppm.
     * @param bioma Bioma onde o Sentinel está inserido.
     */
    public SentinelAnt(int id, double lat, double lon, double umidade, double temperatura, double co2, double metano, Bioma bioma) {
        super(id, "ativo", LocalDate.now(), bioma);
        this.lat = lat;
        this.lon = lon;
        this.umidade = umidade;
        this.temperatura = temperatura;
        this.co2 = co2;
        this.metano = metano;
        this.dhUltimoAlerta = LocalDateTime.now();
    }

    /**
     * Verifica se o Sentinel detecta risco subterrâneo baseado em limites
     * de temperatura e CO₂ fornecidos.
     *
     * @param limiteTemp Limite de temperatura para risco.
     * @param limiteCO2 Limite de concentração de CO₂ para risco.
     * @return true se temperatura e CO₂ estiverem acima dos limites, false caso contrário.
     */
    public boolean riscoSubterraneo(double limiteTemp, double limiteCO2) {
        return temperatura > limiteTemp && co2 > limiteCO2;
    }

    /**
     * Retorna um diagnóstico resumido contendo o ID, temperatura e CO₂.
     *
     * @return String com diagnóstico básico.
     */
    @Override
    public String diagnostico() {
        return "ANT " + id + " | Temperatura: " + temperatura + "°C | CO2: " + co2 + " ppm";
    }

    /**
     * Retorna um diagnóstico que pode ser detalhado ou resumido conforme parâmetro.
     *
     * @param detalhado Se true, inclui metano e umidade no diagnóstico.
     * @return String com diagnóstico detalhado ou resumido.
     */
    public String diagnostico(boolean detalhado) {
        return detalhado ? diagnostico() + " | Metano: " + metano + " | Umidade: " + umidade : diagnostico();
    }

    // Getters para os atributos do SentinelAnt

    public double getTemperatura() {
        return temperatura;
    }

    public double getCo2() {
        return co2;
    }

    public double getUmidade() {
        return umidade;
    }

    public double getMetano() {
        return metano;
    }

    public double getLat() {
        return lat;
    }

    public double getLon() {
        return lon;
    }

    public LocalDateTime getDhUltimoAlerta() {
        return dhUltimoAlerta;
    }
}
