package model;

public class BiomaFactory {

    public static Bioma criarBioma(String nome) {
        switch (nome.toLowerCase()) {
            case "amazônia":
                return new Bioma(1, "Amazônia", "úmido", "biodiversidade alta", "floresta densa");
            case "cerrado":
                return new Bioma(2, "Cerrado", "tropical sazonal", "aves do planalto", "vegetação de galeria");
            case "caatinga":
                return new Bioma(3, "Caatinga", "semiárido", "animais adaptados à seca", "vegetação espinhosa");
            case "pantanal":
                return new Bioma(4, "Pantanal", "úmido com inundações", "aves aquáticas", "vegetação aquática");
            case "mata atlântica":
                return new Bioma(5, "Mata Atlântica", "úmido", "diversidade endêmica", "mata fechada");
            case "pampa":
                return new Bioma(6, "Pampa", "subtropical", "aves campestres", "campos e gramíneas");
            default:
                return new Bioma(0, nome, "desconhecido", "fauna genérica", "vegetação genérica");
        }
    }

    public static SentinelAnt criarAnt(String nomeBioma, Bioma bioma) {
        switch (nomeBioma.toLowerCase()) {
            case "amazônia":
                return new SentinelAnt(101, -3.1, -60.0, 75.0, 32.0, 600, 2.5, bioma);
            case "cerrado":
                return new SentinelAnt(102, -15.5, -47.5, 55.0, 33.0, 300, 1.8, bioma);
            case "caatinga":
                return new SentinelAnt(103, -9.4, -40.3, 40.0, 38.0, 250, 1.5, bioma);
            case "pantanal":
                return new SentinelAnt(104, -16.6, -56.1, 65.0, 30.0, 400, 2.0, bioma);
            case "mata atlântica":
                return new SentinelAnt(105, -23.5, -46.6, 70.0, 28.0, 350, 2.2, bioma);
            case "pampa":
                return new SentinelAnt(106, -30.0, -51.2, 50.0, 25.0, 200, 1.6, bioma);
            default:
                return new SentinelAnt(999, 0.0, 0.0, 0.0, 0.0, 100, 1.0, bioma);
        }
    }

    public static SentinelLadybug criarLadybug(String nomeBioma, Bioma bioma) {
        switch (nomeBioma.toLowerCase()) {
            case "amazônia":
                return new SentinelLadybug(201, -3.1, -60.0, "canto agudo", 90.0, bioma);
            case "cerrado":
                return new SentinelLadybug(202, -15.5, -47.5, "estridulação", 60.0, bioma);
            case "caatinga":
                return new SentinelLadybug(203, -9.4, -40.3, "estalido seco", 50.0, bioma);
            case "pantanal":
                return new SentinelLadybug(204, -16.6, -56.1, "chiado", 70.0, bioma);
            case "mata atlântica":
                return new SentinelLadybug(205, -23.5, -46.6, "zumbido baixo", 80.0, bioma);
            case "pampa":
                return new SentinelLadybug(206, -30.0, -51.2, "estalido suave", 55.0, bioma);
            default:
                return new SentinelLadybug(999, 0.0, 0.0, "som genérico", 40.0, bioma);
        }
    }
    public static Comunidade gerarComunidadePorBioma(String nomeBioma, Bioma bioma) {
        switch (nomeBioma.toLowerCase()) {
            case "amazônia":
                return new Comunidade(1, "Comunidade Arara Azul", "Pedro", "92 98888-1122", "Manaus", 150, bioma);
            case "cerrado":
                return new Comunidade(2, "Veredas Vivas", "Vanessa", "61 99999-3344", "Brasília", 200, bioma);
            case "caatinga":
                return new Comunidade(3, "Sol do Sertão", "Matheus", "85 98765-4321", "Juazeiro do Norte", 180, bioma);
            case "pantanal":
                return new Comunidade(4, "Água Clara", "Leticia", "67 99876-5432", "Corumbá", 95, bioma);
            case "mata atlântica":
                return new Comunidade(5, "Vila Esperança", "Carol", "21 98765-0001", "Paraty", 260, bioma);
            case "pampa":
                return new Comunidade(6, "Campo Sereno", "Camila", "51 99666-7788", "Bagé", 130, bioma);
            default:
                return new Comunidade(0, "Comunidade Genérica", "Jessica", "00 90000-0000", "Desconhecida", 100, bioma);
        }
    }

}
