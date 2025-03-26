package com.jpgedvila.Evento.entities;

import jakarta.persistence.Embeddable;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

import java.util.Objects;

@Embeddable
public class BlocoAtividadePK {

    @ManyToOne
    @JoinColumn(name = "bloco_id")
    private Bloco bloco;

    @ManyToOne
    @JoinColumn(name = "atividade_id")
    private Atividade atividade;

    public BlocoAtividadePK(){

    }

    public Bloco getBloco() {
        return bloco;
    }

    public void setBloco(Bloco bloco) {
        this.bloco = bloco;
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

        BlocoAtividadePK that = (BlocoAtividadePK) o;
        return Objects.equals(bloco, that.bloco) && Objects.equals(atividade, that.atividade);
    }

    @Override
    public int hashCode() {
        int result = Objects.hashCode(bloco);
        result = 31 * result + Objects.hashCode(atividade);
        return result;
    }
}
