package br.com.alura.adopetstore.dto;

import br.com.alura.adopetstore.entities.Produto;

import java.math.BigDecimal;

public record ProdutoDTO(Long id, String nome, String descricao, BigDecimal preco) {
    public ProdutoDTO(Produto produto){
        this(produto.getId(), produto.getNome(), produto.getDescricao(), produto.getPreco());
    }
}
