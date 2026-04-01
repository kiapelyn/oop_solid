

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

package br.com.valueprojects.app;

import br.com.valueprojects.dominio.EstimativaJava;
import br.com.valueprojects.dominio.Tarefa;
import br.com.valueprojects.infra.notificacao.EmissorDeSms;
import br.com.valueprojects.infra.persistencia.EstimativaJavaDao;
import br.com.valueprojects.service.CalculadoraProdutividade;
import br.com.valueprojects.service.CalculadoraProdutividadeJunior;
import br.com.valueprojects.service.CriadorEstimativaJava;
import br.com.valueprojects.service.EstimativaRepository;
import br.com.valueprojects.service.NotificadorEstimativa;

import java.sql.SQLOutput;

public class Main {
    public static void main(String[] args) {
        Tarefa tarefa = new Tarefa(1, "Criar endpoint de autenticação", 120);

        System.out.println("------------------TAREFA-----------------\n");
        System.out.println(tarefa);
        System.out.println();

        System.out.println("-----ARMAZENAMENTO E DISPONIBILIDADE-----");
        CalculadoraProdutividade calculadora = new CalculadoraProdutividadeJunior();
        NotificadorEstimativa notificador = new EmissorDeSms();
        EstimativaRepository repository = new EstimativaJavaDao();
        System.out.println();

        CriadorEstimativaJava criador = new CriadorEstimativaJava(calculadora, notificador, repository);

        EstimativaJava estimativa = criador.cria(tarefa);
        System.out.println();

        System.out.println("------------------------------------------");
        System.out.println("Resultado final da estimativa: " + estimativa);
    }
}
