package model;

import java.util.List;

/**
 * Fábrica para criação de objetos relacionados a Biomas, Sentinels e Comunidades,
 * com dados pré-definidos para cada bioma.
 */
public class BiomaFactory {

    /**
     * Cria um objeto Bioma a partir do nome informado.
     *
     * @param nome Nome do bioma.
     * @return Bioma correspondente ao nome ou um bioma genérico se não reconhecido.
     */
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

    /**
     * Cria um SentinelAnt configurado para o bioma informado.
     * Cada bioma tem parâmetros específicos que influenciam os níveis de risco.
     *
     * @param nomeBioma Nome do bioma.
     * @param bioma Instância do bioma.
     * @return Objeto SentinelAnt configurado para o bioma.
     */
    public static SentinelAnt criarAnt(String nomeBioma, Bioma bioma) {
        switch (nomeBioma.toLowerCase()) {
            case "amazônia":
                // CO₂ muito alto e temperatura acima do nível crítico → nível 4
                return new SentinelAnt(101, -3.1, -60.0, 75.0, 42.0, 800, 2.5, bioma);
            case "cerrado":
                // Temperatura e CO₂ acima dos parâmetros de risco significativo → nível 3
                return new SentinelAnt(102, -15.5, -47.5, 70.0, 38.5, 350, 1.8, bioma);
            case "caatinga":
                // Temperatura e CO₂ muito elevados → nível 4
                return new SentinelAnt(103, -9.4, -40.3, 65.0, 39.0, 380, 1.5, bioma);
            case "pantanal":
                // Temperatura acima de 35 e CO₂ entre 300–350 → nível 2 ou 3
                return new SentinelAnt(104, -16.6, -56.1, 60.0, 36.5, 320, 2.0, bioma);
            case "mata atlântica":
                // Valores mais moderados, ainda nível 2
                return new SentinelAnt(105, -23.5, -46.6, 68.0, 34.5, 290, 2.2, bioma);
            case "pampa":
                // Temperatura ligeiramente acima de 35 e CO₂ > 300 → nível 2
                return new SentinelAnt(106, -30.0, -51.2, 55.0, 37.2, 310, 1.6, bioma);
            default:
                // Genérico (nível 1)
                return new SentinelAnt(999, 0.0, 0.0, 0.0, 0.0, 100, 1.0, bioma);
        }
    }

    /**
     * Cria um SentinelLadybug configurado para o bioma informado.
     *
     * @param nomeBioma Nome do bioma.
     * @param bioma Instância do bioma.
     * @return Objeto SentinelLadybug configurado para o bioma.
     */
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

    /**
     * Gera uma comunidade associada a um bioma específico.
     *
     * @param nomeBioma Nome do bioma.
     * @param bioma Instância do bioma.
     * @return Comunidade correspondente ao bioma.
     */
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

    /**
     * Retorna uma lista dos biomas disponíveis para uso no sistema.
     *
     * @return Lista com os nomes dos biomas.
     */
    public static List<String> getBiomasDisponiveis() {
        return List.of("amazônia", "cerrado", "caatinga", "pantanal", "mata atlântica", "pampa");
    }

}
