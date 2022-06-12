package com.virissimo.smartlist.model;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@Entity
@Table(name = "lista_compras")
public class ListaCompras {

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	@Column(name = "id", nullable = false)
	private Integer id;

	@Column(name = "titulo", nullable = false)
	private String titulo;

	@ManyToMany
	@JoinTable(name = "produto", 
	joinColumns = @JoinColumn(name = "lista_compras_id"), inverseJoinColumns = @JoinColumn(name = "produto_id"))
	private List<Produto> produtos;

}
