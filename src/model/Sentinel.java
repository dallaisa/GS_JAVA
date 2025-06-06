package model;

import java.time.LocalDate;

/**
 * Classe abstrata que representa um Sentinel (robô sensor) básico,
 * com informações gerais como ID, status, datas de ativação e desativação,
 * além do bioma onde está inserido.
 * Implementa a interface ISentinel, exigindo que subclasses definam o método diagnostico().
 */
public abstract class Sentinel implements ISentinel {
    protected int id;
    protected String status;
    protected LocalDate ativacao, desativacao;
    protected Bioma bioma;

    /**
     * Construtor para inicializar um Sentinel com seu ID, status,
     * data de ativação e o bioma associado.
     *
     * @param id Identificador único do Sentinel.
     * @param status Status atual do Sentinel (ex: "ativo", "inativo").
     * @param ativacao Data de ativação do Sentinel.
     * @param bioma Bioma onde o Sentinel está operando.
     */
    public Sentinel(int id, String status, LocalDate ativacao, Bioma bioma) {
        this.id = id;
        this.status = status;
        this.ativacao = ativacao;
        this.bioma = bioma;
    }

    /**
     * Método abstrato que deve ser implementado por subclasses para
     * fornecer um diagnóstico resumido baseado nos dados do Sentinel.
     *
     * @return String com o diagnóstico.
     */
    public abstract String diagnostico();
}
