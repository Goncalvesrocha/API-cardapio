package com.springboot.cardapio.entity;

import jakarta.persistence.*;

import java.math.BigDecimal;

@Entity
@Table(name= "cardapio")
public class Cardapio {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nomeItem;
    private String categoria;
    private BigDecimal valor;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNomeItem() {
        return nomeItem;
    }

    public void setNomeItem(String nomeItem) {
        this.nomeItem = nomeItem;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public BigDecimal getValor() {
        return valor;
    }

    public void setValor(BigDecimal valor) {
        this.valor = valor;
    }

    @Override
    public String toString() {
        return "Cardapio{" +
                "id=" + id +
                ", nomeItem='" + nomeItem + '\'' +
                ", categoria='" + categoria + '\'' +
                ", valor=" + valor +
                '}';
    }
}
