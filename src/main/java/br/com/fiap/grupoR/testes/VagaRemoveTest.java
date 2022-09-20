package br.com.fiap.grupoR.testes;

import javax.persistence.EntityManager;
import javax.persistence.Persistence;

import br.com.fiap.grupoR.domain.VagaEstacionamento;

public class VagaRemoveTest {

	public static void main(String[] args) {

		EntityManager em = null;

		try {

			int idProcurado = 2;

			em = Persistence.createEntityManagerFactory("grupoR").createEntityManager();
			VagaEstacionamento vaga = em.find(VagaEstacionamento.class, idProcurado);

			em.getTransaction().begin();
			em.remove(vaga);
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
