package com.petfriends.transporte.domain.valueobject;

import jakarta.persistence.Embeddable;
import java.util.Objects;

@Embeddable
public class EnderecoEntrega {

    private String rua;
    private String cidade;
    private String cep;

    protected EnderecoEntrega() {}

    public EnderecoEntrega(String rua, String cidade, String cep) {
        if (rua == null || cidade == null || cep == null) {
            throw new IllegalArgumentException("Endereço inválido");
        }
        this.rua = rua;
        this.cidade = cidade;
        this.cep = cep;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof EnderecoEntrega)) return false;
        EnderecoEntrega that = (EnderecoEntrega) o;
        return Objects.equals(rua, that.rua) &&
                Objects.equals(cidade, that.cidade) &&
                Objects.equals(cep, that.cep);
    }

    @Override
    public int hashCode() {
        return Objects.hash(rua, cidade, cep);
    }
}
