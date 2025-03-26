package com.jpgedvila.Evento.entities;

import jakarta.persistence.Embeddable;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

import java.util.Objects;

@Embeddable
public class ParticipantesAtividadePK {

    @ManyToOne
    @JoinColumn(name = "participante_id")
    private Participante participante;

    @ManyToOne
    @JoinColumn(name = "atividade_id")
    private Atividade atividade;

    public ParticipantesAtividadePK(){

    }

    public Participante getParticipante() {
        return participante;
    }

    public void setParticipante(Participante participante) {
        this.participante = participante;
    }

    public Atividade getAtividade() {
        return atividade;
    }

    public void setAtividade(Atividade atividade) {
        this.atividade = atividade;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;

        ParticipantesAtividadePK that = (ParticipantesAtividadePK) o;
        return Objects.equals(participante, that.participante) && Objects.equals(atividade, that.atividade);
    }

    @Override
    public int hashCode() {
        int result = Objects.hashCode(participante);
        result = 31 * result + Objects.hashCode(atividade);
        return result;
    }
}
