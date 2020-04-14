package temperatura;

import static org.junit.Assert.*;

import java.util.*;

import org.junit.*;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.*;

@RunWith(value = Parameterized.class)

public class Temperatura2Test {
	
	private double celsius;
	private double fharenheit;
	private double reamur;
	private double error;
	
	public Temperatura2Test(double celsius, double fharenheit, double reamur, double error) {
		this.celsius=celsius;
		this.fharenheit=fharenheit;
		this.reamur=reamur;
		this.error=error;
	}
		
	Temperatura2 conversor = new Temperatura2();
	
	@BeforeClass
	public static void beforeClass() {
		System.out.println("Este es un beforeClass\n");
	}
	@AfterClass
	public static void afterClass() {
		System.out.println("Este es un afterClass");
	}
	
	@Before
	public void before() {
		System.out.println("Este es un before");
	}
	@After
	public void after() {
		System.out.println("Este es un after\n");
	}
	
	/*@Test
	public void testCelsiusAFharenheit() { 
	//Temperatura2 conversor = new Temperatura2(); 
	assertEquals(celsius, conversor.celsiusAFharenheit(fharenheit),error);
	System.out.println("Metodo 1");
	} 
	@Test 
	public void testCelsiusAReamur() { 
	//Temperatura2 conversor = new Temperatura2(); 
	assertEquals(celsius, conversor.celsiusAReamur(reamur),error); 
	System.out.println("Metodo 2");
	}*/
	
	@Parameters
	public static Collection<Object[]> datos() {
	return Arrays.asList(new Object[][] {
	{ 0.0, 32.0, 0.0, 0.0 },
	{ 15, 59.0, 12.0, 0.0 },
	{ 30, 86.0, 24.0, 0.0 },
	{ 50, 122.0, 40.0, 0.0 },
	{ 90, 194.0, 72.0, 0.0 } ,
	{ 90, 19.0, 72.0, 0.0}
	});
	}
	
	@Test
	public void mostrar() {
		System.out.println(celsius + ", " + fharenheit + ", " + reamur + ", " + error);
	}
}
