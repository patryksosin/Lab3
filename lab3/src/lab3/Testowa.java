package lab3;

public class Testowa {
	
	static Vector2D vec1, vec2 , vec3;
	
	public static void main(String[] args) {
		
		vec1 = new Vector2D(4, 12);
		vec2 = new Vector2D(6, 7);
		
		System.out.println("Wspolrzedne wektora 1:" + vec1);
		System.out.println("Dlugosc wektora 1 wynosi: "+vec1.dlugosc());
		
		System.out.println("Wspolrzedne wektora 2:" + vec2);
		System.out.println("Dlugosc wektora 2 wynosi: "+vec2.dlugosc());
		
		vec3 = vec1.suma(vec2);
		System.out.println("Suma wektorow: " + vec3);
		
		vec3 = vec1.minus(vec2);
		System.out.println("Roznica wektorow: "+ vec3);
		
		vec3 = vec1.mnozenie(3);
		System.out.println("Iloczyn wektora 1 i stalej rownej 3: "+ vec3);
		
		vec3 = vec1.normalizacja();
		System.out.println("Znormalizowany wektor 1: "+vec3);
	}
}
