package com.petfriends.almoxarifado.domain.valueobject;

import jakarta.persistence.Embeddable;
import java.util.Objects;

@Embeddable
public class LocalizacaoEstoque {

    private String corredor;
    private String prateleira;

    protected LocalizacaoEstoque() {}

    public LocalizacaoEstoque(String corredor, String prateleira) {
        if (corredor == null || prateleira == null) {
            throw new IllegalArgumentException("Localização inválida");
        }
        this.corredor = corredor;
        this.prateleira = prateleira;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof LocalizacaoEstoque)) return false;
        LocalizacaoEstoque that = (LocalizacaoEstoque) o;
        return Objects.equals(corredor, that.corredor) &&
                Objects.equals(prateleira, that.prateleira);
    }

    @Override
    public int hashCode() {
        return Objects.hash(corredor, prateleira);
    }
}
