package contador;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class ContadorTest {

	Contador calc;
	
	@Before
	public void before() {
		System.out.println("before()");
		calc = new Contador(); // Esta inicializacion es una precondición  
	}
	
	@After
	public void after() {
		System.out.println("after()");
		calc.clear(); // Reiniciar los valores
	}
	
	
	@Test
	public void testSum() {
		System.out.println("sum()");
		int resul = calc.add(29,1); // Al llegar una persona +1 al total de asistentes
		int esper = 30;
		assertEquals("Entra un persona",esper, resul);
	}
	@Test
	public void testRes() {
		System.out.println("res()");
		int resul = calc.sub(30,1);  // Al salir una persona -1 al total de asistentes
		int esper = 29;
		assertEquals("Sale una persona",esper, resul);
	}
	

}
