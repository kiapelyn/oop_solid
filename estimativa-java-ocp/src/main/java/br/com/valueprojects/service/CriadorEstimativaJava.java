/*
 * Copyright (c) 2026 Evelyn Chiaperini
 *
 * Este código foi desenvolvido para fins acadêmicos como parte de atividades
 * educacionais.
 *
 * Não é permitida a cópia, redistribuição ou utilização deste código,
 * total ou parcial, para entrega em trabalhos acadêmicos por terceiros,
 * caracterizando plágio.
 *
 * É permitido o uso como referência para estudo, desde que seja dado o
 * devido crédito ao autor original.
 *
 * Este software é fornecido "como está", sem garantias de qualquer tipo,
 * expressas ou implícitas. O autor não se responsabiliza por quaisquer
 * danos decorrentes do uso deste código.
 */

package br.com.valueprojects.service;

import br.com.valueprojects.dominio.EstimativaJava;
import br.com.valueprojects.dominio.Tarefa;

public class CriadorEstimativaJava {
    private final CalculadoraProdutividade calculadoraProdutividade;
    private final NotificadorEstimativa notificadorEstimativa;
    private final EstimativaRepository estimativaRepository;

    public CriadorEstimativaJava(CalculadoraProdutividade calculadoraProdutividade,
                                 NotificadorEstimativa notificadorEstimativa,
                                 EstimativaRepository estimativaRepository) {
        this.calculadoraProdutividade = calculadoraProdutividade;
        this.notificadorEstimativa = notificadorEstimativa;
        this.estimativaRepository = estimativaRepository;
    }

    public EstimativaJava cria(Tarefa tarefa) {
        double metrica = tarefa.metricaTarefa();
        double produtividade = calculadoraProdutividade.calcular(metrica);
        String perfil = calculadoraProdutividade.getPerfil();

        EstimativaJava estimativaJava = new EstimativaJava(metrica, produtividade, perfil);

        notificadorEstimativa.notificar(estimativaJava);
        estimativaRepository.salvar(estimativaJava);

        return estimativaJava;
    }
}
