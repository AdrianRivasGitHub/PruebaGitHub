package temperatura;

public class Temperatura2 {
	private final double CERO_ABSOLUTO = -273.15;

	public Temperatura2() {
	}

	public double celsiusAFharenheit(double celsius) {
		double temperatura = 0;
		if (celsius < CERO_ABSOLUTO) {
			temperatura = 999999; // caso de error
			System.out.println("Temperatura incorrecta");
		} else
			temperatura = 9.0 / 5.0 * celsius + 32.0;
		return temperatura;
	}

	public double celsiusAReamur(double celsius) {
		double temperatura = 0;
		if (celsius < CERO_ABSOLUTO) {
			temperatura = 999999; // caso de error
			System.out.println("Temperatura incorrecta");
		} else
			temperatura = 4.0 / 5.0 * celsius;
		return temperatura;
	}
}