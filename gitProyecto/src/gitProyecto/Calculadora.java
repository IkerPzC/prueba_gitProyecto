package gitProyecto;

public class Calculadora {
	int num1, num2;
	
	public Calculadora(int num1, int num2){
		this.num1=num1;
		this.num2=num2;
	}
	
	public int sumar(){
		return num1+num2;
	}
	public int restar(){
		return num1-num2;
	}
	public int dividir(){
		return num1/num2;
	}
	public int multiplicar(){
		return num1*num2;
	}

	
//	public static void main(String[] args) {
//		Calculadora c=new Calculadora(1,2);
//		System.out.println(c.sumar());
//	}
}
