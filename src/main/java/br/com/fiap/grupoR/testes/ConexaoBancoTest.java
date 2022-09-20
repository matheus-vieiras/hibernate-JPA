package br.com.fiap.grupoR.testes;

import javax.persistence.Persistence;

public class ConexaoBancoTest {

	public static void main(String[] args) {
		Persistence.createEntityManagerFactory("grupoR").createEntityManager();
	}
	
}