package lista_linear;

public class Main {

	public static void main(String[] args) {
		
		System.out.println("Lista Linear");
		
		Lista lista = new Lista(6);
		int x1, x2, x3;
		
		lista.inserirInicio(1);
		lista.mostrar();
		lista.inserirFim(7);
		lista.mostrar();
		lista.inserirFim(9);
		lista.mostrar();
		lista.inserirInicio(3);
		lista.mostrar();
		lista.inserir(8, 3);
		lista.mostrar();
		lista.inserir(4, 2);
		lista.mostrar();
		
		x1 = lista.removerInicio();
		lista.mostrar();
		x2 = lista.removerFim();
		lista.mostrar();
		x3 = lista.remover(2);
		lista.mostrar();
		System.out.println(x1 + ", " + x2 + ", " + x3);
		lista.mostrar();
	
		
		
		
	}

}
