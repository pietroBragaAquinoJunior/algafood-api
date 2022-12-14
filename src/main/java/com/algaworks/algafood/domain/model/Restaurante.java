package com.algaworks.algafood.domain.model;

import java.io.Serializable;
import java.math.BigDecimal;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.Data;
import lombok.EqualsAndHashCode;

@Entity
@Table(name = "tb_restaurante")
@Data
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
public class Restaurante implements Serializable {

	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@EqualsAndHashCode.Include
	private Long id;
	
	@Column(nullable=false)
	private String nome;
	
	@Column(name="taxa_frete",nullable=false)
	private BigDecimal taxaFrete;
	
	@ManyToOne
	@JoinColumn(nullable = false)
	Cozinha cozinha;
	
	@ManyToOne
	@JoinColumn(nullable = false)
	FormaPagamento formaPagamento;
	
}
