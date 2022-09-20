package br.com.fiap.grupoR.testes;

import javax.persistence.EntityManager;
import javax.persistence.Persistence;

import br.com.fiap.grupoR.domain.VagaEstacionamento;

public class VagaMergeTest {

	public static void main(String[] args) {
		EntityManager em = null;
		try {
			em = Persistence.createEntityManagerFactory("grupoR").createEntityManager();
			VagaEstacionamento vaga = new VagaEstacionamento();
			vaga.setId(1);
			vaga.setNumeroVaga(402);
			em.merge(vaga);
			em.getTransaction().begin();
			em.getTransaction().commit();
		} catch (Exception e) {
			e.printStackTrace();
		}
		if (em != null) {
			em.close();
		}
		System.exit(0);
	}

}
