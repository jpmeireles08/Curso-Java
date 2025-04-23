package entidades;

public class ConversorMoeda {
	
	public static final double IOF = 0.06;
	
	public static double conversor(double dolar, double quantidade) {
		quantidade += (quantidade * IOF);
		return dolar * quantidade;
	}
}
