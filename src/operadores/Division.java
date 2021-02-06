package operadores;

public class Division {

	float n1;
	float n2;
	
	public Division() {
	
	}

	public float dividir(float a, float b) {
		float result=0;
		try {
			result=a/b;
		}catch (ArithmeticException e) {
			System.out.print("no division entre cero\n");
		}
		return result;
	}	

}
