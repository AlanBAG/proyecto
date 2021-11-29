package contador;

public class Contador {
	
	private int ans;
	
	public Contador() {
		ans = 0; // guarda ultimo valor puede ser el ultimo numero del total de asistentes
	}
	
	public int add(int a, int b) {
		ans = a + b;
		return ans;
	}
	
	public int sub(int a, int b) {
		ans = a - b;
		return ans;
	}
	
	public int add(int v) {
		ans += v; // Acumulaci�n en aumento
		return ans;
	}
	
	public int sub(int v) {
		ans -= v; // Acumulaci�n en descenso
		return ans;
	}
	
	public int ans() {
		return ans;
	}
	
	public void clear() {
		ans = 0; // Funci�n para borrar el ultimo valor guardado
	}
	
}
