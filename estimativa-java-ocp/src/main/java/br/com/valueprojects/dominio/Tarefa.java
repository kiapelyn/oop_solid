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

import java.util.Objects;

public final class Tarefa {
    private final int idTarefa;
    private final String descricaoTarefa;
    private final double metricaTarefa;

    public Tarefa(int idTarefa, String descricaoTarefa, double metricaTarefa) {
        this.idTarefa = idTarefa;
        this.descricaoTarefa = descricaoTarefa;
        this.metricaTarefa = metricaTarefa;
    }

    @Override
    public String toString() {
        return "Tarefa{" +
                "idTarefa=" + idTarefa +
                ", descricaoTarefa='" + descricaoTarefa + '\'' +
                ", metricaTarefa=" + metricaTarefa +
                '}';
    }

    public int idTarefa() {
        return idTarefa;
    }

    public String descricaoTarefa() {
        return descricaoTarefa;
    }

    public double metricaTarefa() {
        return metricaTarefa;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == this) return true;
        if (obj == null || obj.getClass() != this.getClass()) return false;
        var that = (Tarefa) obj;
        return this.idTarefa == that.idTarefa &&
                Objects.equals(this.descricaoTarefa, that.descricaoTarefa) &&
                Double.doubleToLongBits(this.metricaTarefa) == Double.doubleToLongBits(that.metricaTarefa);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idTarefa, descricaoTarefa, metricaTarefa);
    }

}
