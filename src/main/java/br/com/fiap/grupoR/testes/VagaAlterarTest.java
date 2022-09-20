package br.com.fiap.grupoR.testes;

import javax.persistence.EntityManager;
import javax.persistence.Persistence;

import br.com.fiap.grupoR.domain.VagaEstacionamento;

public class VagaAlterarTest {

public static void main(String[] args) {
		
		EntityManager em = null;

		try { 
			
			int idProcurado = 1;
			
			em = Persistence.createEntityManagerFactory("grupoR").createEntityManager();
			VagaEstacionamento vaga = em.find(VagaEstacionamento.class, idProcurado);
			
			
			em.getTransaction().begin();
			vaga.setGaragem("Vaga G1");
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
