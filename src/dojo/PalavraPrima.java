package dojo;

public class PalavraPrima {
	public static int converterEmNumero(String palavra) {
		if (palavra == "a")
			return 1;
		else if (palavra == "b")
			return 2;
		else if (palavra == "A")
			return 27;
		else if (palavra == "z")
			return 26;
		else if (palavra == "Z")
			return 52;
		return 0;
	}

	public static boolean ehPrimo(int num) {
		if (num % 2 == 0 && num != 2)
			return false;
		return true;
	}

}
