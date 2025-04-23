package entidades;

public class Aluno {

	public String nome;
	public double nota1;
	public double nota2;
	public double nota3;
	
	public double notaFinal() {
		return nota1 + nota2 + nota3;
	}
	
	public double notaFaltante() {
		return 60 - notaFinal();
	}
	
	/* Usando o metodo toString
	 public String toString() {
		if (notaFinal() >= 60) {
			return "Nota final = " 
			+ String.format("%.2f", notaFinal()) + "\n" 
			+ "Aprovado";
		} else {
			return "Nota final = " 
			+ String.format("%.2f", notaFinal()) 
			+ "\n" + "Reprovado" + "\n" + "Nota faltante " 
			+ String.format("%.2f", notaFaltante()); 
		}
	}
	 */
 }
