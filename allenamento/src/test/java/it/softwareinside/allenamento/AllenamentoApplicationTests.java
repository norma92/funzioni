package it.softwareinside.allenamento;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import it.softwareinside.allenamento.models.Metodi;

@SpringBootTest
class AllenamentoApplicationTests {

	@Test
	void testRicorrenzaChar() {

		char[] vettore = {'a', 'r', 'e', 's', 'e', 'k', 'o', 'a'};
		char caratterePresente = 'a';
		char carattereAssente = 'm';

		assertEquals(Metodi.ricorrenzaChar(vettore, carattereAssente), 0);
		assertEquals(Metodi.ricorrenzaChar(vettore, caratterePresente), 2);
	}

	@Test
	void testOccorrenzaMaggiore() {

		boolean[] vettore = {true, true, false, true, false};

		assertEquals(Metodi.occorrenzaMaggiore(vettore),"true");

		String[] vettoreStringhe = {"casa", "cane", "mela"};
    	String parola = "cane";

		assertEquals(Metodi.censura(vettoreStringhe, parola)[1], "****");
		assertEquals(Metodi.censura(vettoreStringhe, parola)[0], "casa");

	}

}
