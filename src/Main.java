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

        System.out.println(ant.diagnostico(true));
        System.out.println(ladybug.diagnostico());

        Comunidade comunidade = new Comunidade(1, "Vila Verde", "Joana", "11 99999-0000", "SP", 320, bioma);
        System.out.println(comunidade.getResumo());

        Alerta alerta = new Alerta(1, "ANT", 3, "Temperatura e CO2 elevados", ant);
        AlertaComunidade ac = new AlertaComunidade(alerta, comunidade, "SMS");

        System.out.println(alerta.emitirResumo());
        System.out.println(ac.statusEnvio());
    }
}
