import model.*;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o nome do bioma:");
        String nomeDigitado = sc.nextLine().trim().toLowerCase();

        Bioma bioma = BiomaFactory.criarBioma(nomeDigitado);
        SentinelAnt ant = BiomaFactory.criarAnt(nomeDigitado, bioma);
        SentinelLadybug ladybug = BiomaFactory.criarLadybug(nomeDigitado, bioma);
        Comunidade comunidade = BiomaFactory.gerarComunidadePorBioma(nomeDigitado, bioma);

        // Exibe informações da comunidade e sensores
        System.out.println(comunidade.getResumo());
        System.out.println(ant.diagnostico(true));
        System.out.println(ladybug.diagnostico());

        Alerta alerta = avaliarRiscoAmbiental(ant);
        AlertaComunidade ac = new AlertaComunidade(alerta, comunidade, "SMS");

        // Exibe os alertas
        System.out.println(alerta.emitirResumo());
        System.out.println(ac.statusEnvio());
    }

    public static Alerta avaliarRiscoAmbiental(SentinelAnt ant) {
        double temp = ant.getTemperatura();
        double co2 = ant.getCo2();

        int nivel;
        String descricao;

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

        return new Alerta(1, "ANT", nivel, descricao, ant);
    }

}

