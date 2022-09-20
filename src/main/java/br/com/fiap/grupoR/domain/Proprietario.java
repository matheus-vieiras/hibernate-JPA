package br.com.fiap.grupoR.domain;

import java.util.List;
import java.util.Objects;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "tb_proprietario")
public class Proprietario {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_proprietario")
	private Integer id;

	@Column(name = "nm_proprietario", length = 60, nullable = false)
	private String nomeProprietario;

	@Column(name = "placa_carro", length = 15, nullable = false)
	private String placaCarro;

	@Column(name = "marca_carro", length = 30, nullable = false)
	private String marcaCarro;

	@Column(name = "cor_carro", length = 15, nullable = false)
	private String corCarro;

	@Column(name = "num_apartamento", length = 10, nullable = false)
	private Integer numApartamento;

	@OneToMany(mappedBy = "proprietario")
	private List<VagaEstacionamento> estacionamento;

	public Proprietario() {

	}

	public Proprietario(Integer id, String nomeProprietario, String placaCarro, String marcaCarro, String corCarro,
			Integer numApartamento, List<VagaEstacionamento> estacionamento) {
		super();
		this.id = id;
		this.nomeProprietario = nomeProprietario;
		this.placaCarro = placaCarro;
		this.marcaCarro = marcaCarro;
		this.corCarro = corCarro;
		this.numApartamento = numApartamento;
		this.estacionamento = estacionamento;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNomeProprietario() {
		return nomeProprietario;
	}

	public void setNomeProprietario(String nomeProprietario) {
		this.nomeProprietario = nomeProprietario;
	}

	public String getPlacaCarro() {
		return placaCarro;
	}

	public void setPlacaCarro(String placaCarro) {
		this.placaCarro = placaCarro;
	}

	public String getMarcaCarro() {
		return marcaCarro;
	}

	public void setMarcaCarro(String marcaCarro) {
		this.marcaCarro = marcaCarro;
	}

	public String getCorCarro() {
		return corCarro;
	}

	public void setCorCarro(String corCarro) {
		this.corCarro = corCarro;
	}

	public Integer getNumApartamento() {
		return numApartamento;
	}

	public void setNumApartamento(Integer numApartamento) {
		this.numApartamento = numApartamento;
	}

	public List<VagaEstacionamento> getEstacionamento() {
		return estacionamento;
	}

	public void setEstacionamento(List<VagaEstacionamento> estacionamento) {
		this.estacionamento = estacionamento;
	}

	@Override
	public String toString() {
		return "Proprietario [id=" + id + ", nomeProprietario=" + nomeProprietario + ", placaCarro=" + placaCarro
				+ ", marcaCarro=" + marcaCarro + ", corCarro=" + corCarro + ", numApartamento=" + numApartamento
				+ ", estacionamento=" + estacionamento + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(corCarro, estacionamento, id, marcaCarro, nomeProprietario, numApartamento, placaCarro);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Proprietario other = (Proprietario) obj;
		return Objects.equals(corCarro, other.corCarro) && Objects.equals(estacionamento, other.estacionamento)
				&& Objects.equals(id, other.id) && Objects.equals(marcaCarro, other.marcaCarro)
				&& Objects.equals(nomeProprietario, other.nomeProprietario)
				&& Objects.equals(numApartamento, other.numApartamento) && Objects.equals(placaCarro, other.placaCarro);
	}

}