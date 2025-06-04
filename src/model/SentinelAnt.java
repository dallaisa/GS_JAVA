package model;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class SentinelAnt extends Sentinel {
    private double lat, lon, umidade, temperatura, co2, metano;
    private LocalDateTime dhUltimoAlerta;

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

    public boolean riscoSubterraneo(double limiteTemp, double limiteCO2) {
        return temperatura > limiteTemp && co2 > limiteCO2;
    }

    @Override
    public String diagnostico() {
        return "ANT ID " + id + ": Temp=" + temperatura + "C, CO2=" + co2 + "ppm";
    }

    public String diagnostico(boolean detalhado) {
        return detalhado ? diagnostico() + ", MET=" + metano + ", UMID=" + umidade : diagnostico();
    }
}
