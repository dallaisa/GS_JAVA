import model.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite nome do bioma:");
        String nome = sc.nextLine();

        Bioma bioma = new Bioma(1, nome, "úmido", "aves tropicais", "mata fechada");
        SentinelAnt ant = new SentinelAnt(101, -23.5, -46.6, 60.5, 35.0, 400, 1.8, bioma);
        SentinelLadybug ladybug = new SentinelLadybug(202, -23.5, -46.6, "estalo", 70.0, bioma);

        System.out.println(ant.diagnostico(true));
        System.out.println(ladybug.diagnostico());

        Comunidade comunidade = new Comunidade(1, "Vila Verde", "Joana", "11 99999-0000", "Vale do Xingu", 320, bioma);
        System.out.println(comunidade.getResumo());

        Alerta alerta = new Alerta(1, "ANT", 3, "Temperatura e CO2 elevados", ant);
        AlertaComunidade ac = new AlertaComunidade(alerta, comunidade, "SMS");

        System.out.println(alerta.emitirResumo());
        System.out.println(ac.statusEnvio());
    }
}
