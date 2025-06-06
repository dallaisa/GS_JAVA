import model.*;

import java.util.List;
import java.util.Scanner;
import java.util.UUID;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        System.out.println("=== BIOMAS MONITORADOS ===");
        List<String> biomasDisponiveis = BiomaFactory.getBiomasDisponiveis();
        for (String nome : biomasDisponiveis) {
            System.out.println("- " + nome);
        }

        // Solicita ao usuário o nome do bioma que deseja verificar
        System.out.print("\nQual bioma quer verificar: ");
        String nomeBioma = sc.nextLine().trim().toLowerCase();

        // Cria as instâncias dos objetos relacionados ao bioma escolhido
        Bioma bioma = BiomaFactory.criarBioma(nomeBioma);
        SentinelAnt ant = BiomaFactory.criarAnt(nomeBioma, bioma);
        SentinelLadybug ladybug = BiomaFactory.criarLadybug(nomeBioma, bioma);
        Comunidade comunidade = BiomaFactory.gerarComunidadePorBioma(nomeBioma, bioma);

        // Exibe resumo da comunidade vinculada ao bioma
        System.out.println("\n--- RESUMO DA COMUNIDADE ---");
        System.out.println(comunidade.getResumo());

        // Exibe diagnóstico dos microrrobôs SentinelAnt e SentinelLadybug
        System.out.println("\n--- DIAGNÓSTICO DOS MICRORROBÔS ---");
        System.out.println(ant.diagnostico(true));    // diagnóstico detalhado para o ant
        System.out.println(ladybug.diagnostico());

        // Avalia os riscos baseando-se nos dados do SentinelAnt e gera alerta
        Alerta alerta = AvaliarRiscos.avaliar(ant);

        // Cria um alerta comunitário, simulando envio por SMS para a comunidade
        AlertaComunidade alertaComunitario = new AlertaComunidade(alerta, comunidade, "SMS");

        // Exibe os alertas gerados e o status do envio
        System.out.println("\n--- ALERTAS ---");
        System.out.println(alerta.emitirResumo());
        System.out.println(alertaComunitario.statusEnvio());

        sc.close();
    }
}
