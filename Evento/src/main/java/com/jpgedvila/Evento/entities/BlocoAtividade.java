package com.jpgedvila.Evento.entities;

import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

import java.util.Objects;

@Entity
@Table(name = "tb_bloco_atividade")
public class BlocoAtividade {

    @EmbeddedId
    private ParticipantesAtividadePK id = new ParticipantesAtividadePK();

    public BlocoAtividade(){}

    public BlocoAtividade(Participante participante, Atividade atividade) {
        id.setParticipante(participante);
        id.setAtividade(atividade);
    }

    public ParticipantesAtividadePK getId() {
        return id;
    }

    public void setId(ParticipantesAtividadePK id) {
        this.id = id;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;

        BlocoAtividade that = (BlocoAtividade) o;
        return Objects.equals(id, that.id);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(id);
    }
}
