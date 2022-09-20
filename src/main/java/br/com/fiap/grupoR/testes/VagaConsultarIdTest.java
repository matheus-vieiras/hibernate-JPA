package br.com.fiap.grupoR.testes;

import javax.persistence.EntityManager;
import javax.persistence.Persistence;

import br.com.fiap.grupoR.domain.VagaEstacionamento;

public class VagaConsultarIdTest {

	public static void main(String[] args) {

		
		EntityManager em = null;

		try { 
			
			int idProcurado = 0;
			
			em = Persistence.createEntityManagerFactory("grupoR").createEntityManager();
			VagaEstacionamento vaga = em.find(VagaEstacionamento.class, idProcurado);

			System.out.println("Vaga encontrada: " + vaga);
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			if (em != null) {
				em.close();
			}
		}
		
	}

}
