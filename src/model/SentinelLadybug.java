package model;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class SentinelLadybug extends Sentinel {
    private double lat, lon;
    private String tipoSom;
    private double intensidadeSom;
    private LocalDateTime dhUltimoAlerta;

    public SentinelLadybug(int id, double lat, double lon, String som, double intensidade, Bioma bioma) {
        super(id, "ativo", LocalDate.now(), bioma);
        this.lat = lat;
        this.lon = lon;
        this.tipoSom = som;
        this.intensidadeSom = intensidade;
        this.dhUltimoAlerta = LocalDateTime.now();
    }

    @Override
    public String diagnostico() {
        return "LADYBUG ID " + id + ": Som=" + tipoSom + ", Int=" + intensidadeSom;
    }
}