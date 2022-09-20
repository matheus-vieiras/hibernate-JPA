package br.com.fiap.grupoR.domain;

import java.util.Objects;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name = "tb_vaga_estacionamento")
public class VagaEstacionamento {

	@Id
	@SequenceGenerator(name = "vaga_estacionamento", sequenceName = "sq_tb_vaga_estacionamento", allocationSize = 1)
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "vaga_estacionamento")
	@Column(name = "id_vaga")
	private Integer id;

	@Column(name = "num_vaga", length = 15)
	private Integer numeroVaga;

	@Column(name = "garagem", length = 15)
	private String garagem;

	@ManyToOne
	@JoinColumn(name = "id_proprietario")
	private Proprietario proprietario;

	public VagaEstacionamento() {

	}

	public VagaEstacionamento(Integer id, Integer numeroVaga, String garagem, Proprietario proprietario) {
		super();
		this.id = id;
		this.numeroVaga = numeroVaga;
		this.garagem = garagem;
		this.proprietario = proprietario;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getNumeroVaga() {
		return numeroVaga;
	}

	public void setNumeroVaga(Integer numeroVaga) {
		this.numeroVaga = numeroVaga;
	}

	public String getGaragem() {
		return garagem;
	}

	public void setGaragem(String garagem) {
		this.garagem = garagem;
	}

	public Proprietario getProprietario() {
		return proprietario;
	}

	public void setProprietario(Proprietario proprietario) {
		this.proprietario = proprietario;
	}

	@Override
	public String toString() {
		return "VagaEstacionamento [id=" + id + ", numeroVaga=" + numeroVaga + ", garagem=" + garagem
				+ ", proprietario=" + proprietario + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(garagem, id, numeroVaga, proprietario);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		VagaEstacionamento other = (VagaEstacionamento) obj;
		return Objects.equals(garagem, other.garagem) && Objects.equals(id, other.id)
				&& Objects.equals(numeroVaga, other.numeroVaga) && Objects.equals(proprietario, other.proprietario);
	}

}