package com.desafioibm.apirest.model;
import lombok.Data;
import javax.persistence.Entity;
import javax.persistence.*;
import java.io.Serializable;


@Data
@Entity
@Table(name = "TB_IBM")
public class ExpectativasMensais implements Serializable {

	private static final Long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "id", nullable = false)
	private Long id;

	@Column(name = "Indicador")
	private String indicador;

	@Column(name = "Data")
	private String data;

	@Column(name = "DataReferencia")
	private String dataReferencia;

	@Column(name = "Media")
	private double media;

	@Column(name = "Mediana")
	private double mediana;

	@Column(name = "DesvioPadrao")
	private Double desvioPadrao;

	@Column(name = "CoefiVariacao")
	private Double coefiVariacao;

	@Column(name = "Minimo")
	private Double minimo;

	@Column(name = "Maximo")
	private Double maximo;

	@Column(name = "numeroRespondentes")
	private Integer numeroRespondentes;

	@Column
	private Integer baseCalculo;



}


