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

package br.com.valueprojects.dominio;

public record EstimativaJava(double metrica, double produtividadeDesenvolvedor, String perfil) {

    @Override
    public String toString() {
        return "EstimativaJava{" +
                "metrica=" + metrica +
                ", produtividadeDesenvolvedor=" + produtividadeDesenvolvedor +
                ", perfil='" + perfil + '\'' +
                '}';
    }
}
