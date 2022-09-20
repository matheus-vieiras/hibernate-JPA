package br.com.fiap.grupoR.testes;

import javax.persistence.EntityManager;
import javax.persistence.Persistence;

import br.com.fiap.grupoR.domain.Proprietario;

public class ProprietarioInserirTest {

	public static void main(String[] args) {
		EntityManager em = null;

		try {

			em = Persistence.createEntityManagerFactory("grupoR").createEntityManager();
			em.getTransaction().begin();

			Proprietario proprietario1 = new Proprietario();
			proprietario1.setNomeProprietario("Matheus");
			proprietario1.setPlacaCarro("GTX-1650");
			proprietario1.setMarcaCarro("Audi");
			proprietario1.setCorCarro("Preto");
			proprietario1.setNumApartamento(400);
			em.persist(proprietario1);

			Proprietario proprietario2 = new Proprietario();
			proprietario2.setNomeProprietario("Natã-Grecu");
			proprietario2.setPlacaCarro("RTX-3050");
			proprietario2.setMarcaCarro("BMW");
			proprietario2.setCorCarro("Branco");
			proprietario2.setNumApartamento(100);
			em.persist(proprietario2);

			Proprietario proprietario3 = new Proprietario();
			proprietario3.setNomeProprietario("Nathan");
			proprietario3.setPlacaCarro("GTX-1050");
			proprietario3.setMarcaCarro("FORD");
			proprietario3.setCorCarro("Azul");
			proprietario3.setNumApartamento(200);
			em.persist(proprietario3);

			Proprietario proprietario4 = new Proprietario();
			proprietario4.setNomeProprietario("Murilo");
			proprietario4.setPlacaCarro("GTX-3060");
			proprietario4.setMarcaCarro("Volksvagen");
			proprietario4.setCorCarro("Preto");
			proprietario4.setNumApartamento(300);
			em.persist(proprietario4);

			Proprietario proprietario5 = new Proprietario();
			proprietario5.setNomeProprietario("Thiago");
			proprietario5.setPlacaCarro("RTX-3080");
			proprietario5.setMarcaCarro("Mercedes");
			proprietario5.setCorCarro("Roxo");
			proprietario5.setNumApartamento(500);
			em.persist(proprietario5);

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
