package br.com.fiap.grupoR.testes;

import javax.persistence.EntityManager;
import javax.persistence.Persistence;

import br.com.fiap.grupoR.domain.Proprietario;
import br.com.fiap.grupoR.domain.VagaEstacionamento;

public class VagaInserirTest {

	public static void main(String[] args) {

		EntityManager em = null;

		try {

			em = Persistence.createEntityManagerFactory("grupoR").createEntityManager();
			em.getTransaction().begin();

			Proprietario tipo = new Proprietario(1, null, null, null, null, null, null);

			VagaEstacionamento vaga = new VagaEstacionamento();
			vaga.setGaragem("G4");
			vaga.setNumeroVaga(400);
			vaga.setProprietario(tipo);
			em.persist(vaga);

			em.getTransaction().commit();

		} catch (Exception e) {
			e.printStackTrace();
			if (em != null && em.getTransaction().isActive()) {
				em.getTransaction().rollback();
			}
		} finally {
			if (em != null) {
				em.close();
			}
		}

	}

}
