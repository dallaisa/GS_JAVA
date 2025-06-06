package model;

import model.*;

import java.util.UUID;

/**
 * Classe responsável por avaliar os riscos ambientais detectados por um SentinelAnt
 * e gerar um alerta correspondente com base em temperatura e níveis de CO₂.
 */
public class AvaliarRiscos {

    /**
     * Avalia os dados de um SentinelAnt e retorna um alerta com o nível de risco.
     *
     * @param ant Instância do SentinelAnt contendo dados ambientais.
     * @return Alerta gerado com base nos valores de temperatura e CO₂.
     */
    public static Alerta avaliar(SentinelAnt ant) {
        double temp = ant.getTemperatura(); // Obtém a temperatura atual do SentinelAnt
        double co2 = ant.getCo2(); // Obtém o nível de CO₂ atual

        int nivel;
        String descricao;

        // Verifica os níveis de temperatura e CO₂ para classificar o risco
        if (temp > 40 && co2 > 350) {
            nivel = 4;
            descricao = "🔥 ALERTA CRÍTICO: Temperatura e CO₂ muito elevados";
        } else if (temp > 37 && co2 > 300) {
            nivel = 3;
            descricao = "⚠️ RISCO SIGNIFICATIVO: Temperatura e CO₂ elevados";
        } else if (temp > 35 && co2 <= 300) {
            nivel = 2;
            descricao = "⚠️ RISCO LEVE: Temperatura acima do ideal";
        } else {
            nivel = 1;
            descricao = "✅ Condições estáveis";
        }

        // Gera um identificador único para o alerta
        int idAlerta = UUID.randomUUID().hashCode();

        // Cria e retorna o alerta com as informações avaliadas
        return new Alerta(idAlerta, "ANT", nivel, descricao, ant);
    }
}
