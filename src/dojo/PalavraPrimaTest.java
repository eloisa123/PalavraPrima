package dojo;

import static org.junit.Assert.*;

import org.junit.Test;

public class PalavraPrimaTest {

	@Test
	public void testconverterLetraAMinusculo() {
		int valor = PalavraPrima.converterEmNumero("a");
		assertEquals(1, valor);
	}

	@Test
	public void testConverteLetraBMinuscula() {
		int valor = PalavraPrima.converterEmNumero("b");
		assertEquals(2, valor);
	}

	@Test
	public void testConverteLetraAMaiusculo() {
		int valor = PalavraPrima.converterEmNumero("A");
		assertEquals(27, valor);
	}

	@Test
	public void testConverteLetraZMinusculo() {
		int valor = PalavraPrima.converterEmNumero("z");
		assertEquals(26, valor);
	}

	@Test
	public void testConverteLetraZMaiusculo() {
		int valor = PalavraPrima.converterEmNumero("Z");
		assertEquals(52, valor);
	}

	@Test
	public void test2EhNumeroPrimo() {
		 boolean resultadoTeste = PalavraPrima.ehPrimo (2);
		 assertEquals(true, resultadoTeste);
	}

	@Test
	public void test26EhNumeroPrimo() {
		 boolean resultadoTeste = PalavraPrima.ehPrimo (26);
		 assertEquals(false, resultadoTeste);
	}
}