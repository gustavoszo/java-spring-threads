package br.com.alura.adopetstore.dto;

import br.com.alura.adopetstore.entities.enums.Categoria;

import java.math.BigDecimal;

public record EstatisticasVenda(Categoria categoria, Long quantidadesVenda, BigDecimal faturamento) {
}