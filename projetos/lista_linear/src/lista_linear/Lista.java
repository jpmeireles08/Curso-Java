package lista_linear;

public class Lista {

	int [] array;
	int n;
	Lista () {
		array = new int[6];
		n = 0;
	}
	
	Lista (int tamanho) {
		array = new int[tamanho];
		n = 0;
	}
	
	public void inserirInicio(int x) {
		if (n >= array.length)
			System.out.println("Erro");
			
			for (int i = n; i > 0; i--) {
				array[i] = array[i - 1];
			}
			
			array[0] = x;
			n++;
	}
	
	public void inserirFim(int x) {
		if (n >= array.length)
			System.out.println("Erro");
		
		array[n] = x;
		n++;
	}
	
	public void inserir(int x, int pos) {
		if (n >= array.length || pos < 0 || pos > n) 
			System.out.println("Erro");
		
		for (int i = n; i > pos; i--) {
			array[i] = array[i-1];
		}
		
		array[pos] = x;
		n++;
	}
	
	public int removerInicio() {
		if (n == 0)
		System.out.println("Erro");
		
		int resp = array[0];
		n--;
		
		for (int i = 0; i < n; i++) {
			array[i] = array[i+1];
		}
		
		return resp;
	}
	
	public int removerFim() {
		if (n == 0)
			System.out.println("Erro");
		
		return array[--n];
	}
	
	public int remover (int pos) {
		if (n == 0 || pos < 0 || pos >= n) {
			System.out.println("Erro");
		}
		
		int resp = array[pos];
		n--;
		
		for (int i = pos; i < n; i++) {
			array[i] = array[i+1];
		}
		
		return resp;
	}
	
	public void mostrar() {
		System.out.print("[");
		for (int i = 0; i < n; i++) {
			System.out.print(array[i] + " ");
		}
		System.out.print("]");
	}
}
