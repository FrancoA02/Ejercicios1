package EJ1;

public class POO1EJ1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Ejercicio 1
		
				int max = 70;
				int sum =0;
				
				for(int k=1; k <= max; k++)
					sum = sum + k;
				
				System.out.println("La suma de los 70 primeros numeros es: " + sum);
				
				
				
		//Ejercicio 2
				
				int n1 = Integer.MAX_VALUE + 1;
				
				System.out.println("El numero es = " + n1);
				
				int n2 = Integer.MIN_VALUE + 1;
				
				System.out.println("El numero es = " + n2);
				
				
		//Ejecrcicio 3
				
				double numero = 10;
				int numero1 = 2;
				double resultado;
				
				resultado = 2/5 * numero;
				
				System.out.println(resultado);
				
		//Ejercicio 4
				
				double c = 2.5;
				double d = 0.0;
				double resultado1;
				double resultado2;
				double resultado3;
				double resultado4;
				
				resultado1 = c / d;
				System.out.println(resultado1); // Resultado Inf
				
				resultado2 = -2.5/d;
				System.out.println(resultado2); // Resultado -Inf
				
				resultado3 = d / d;
				System.out.println(resultado3); // Resultado NaN
				
				resultado4 = resultado1 * d;
				System.out.println(resultado4); // Resultado NaN
				
				
		//Ejercicio 5 
				
				double result = Double.POSITIVE_INFINITY;
				System.out.println(result);  // Resultado Inf
				double negativeInfinity = Double.NEGATIVE_INFINITY;
		        System.out.println(negativeInfinity); // Resultado -Inf
		        double nan = Double.NaN;
		        System.out.println(nan); // Resultado NaN
		        double maxvalue = Double.MAX_VALUE;
		        System.out.println(maxvalue); // 1.7976931348623157E308
		        double minvalue = Double.MIN_VALUE;
		        System.out.println(minvalue); // 4.9E-324
		        
		        
		 //Ejercicio 6
		        
		        int dato1 = 1;
		        long dato2 = 6010541234L;
		        double dato3 = 3.14159;
		        double dato4 = 0.152E2;
		        float dato5 = 3000.0F;
		        boolean dato6 = true;
		        char dato7 = '2';
		        String dato8 = "2";
		        
		 //Ejercicio 7 
		        
		        boolean hasDog = true;
		        boolean hasCat = false;
		        
		        if ( hasDog || hasCat ); // true
		        if ( hasDog ^ hasCat ); // false
		        if ( hasDog && hasCat); // false
		        	
		//Ejercicio 8
		        
		        String myCar; //Incorrecto
		        String myCar1; //Incorrecto
		        String myCar2 = "Toyota"; //Correcto
		        
		        
		        
		//Ejercicio 9 
		        
		        int n = 8;
		        long z = 4L;
		        long resultado22;
		        
		        resultado22 = n+z;
		        
		        System.out.println(resultado22);
		        
		        double doble = 2.0;
		        int entero = 9;
		        
		        int valor1 = 12;
		        double valor2 = 4.0;
		        double resultado11;
		        
		        resultado11 = valor1 * valor2;
		        
		        System.out.println(resultado11);
		        
		        
		        float valor3 = 7F;
		        int valor4 = 31;
		        float resultado33;
		        
		        resultado33 = valor3 + valor4;
		        
		        System.out.println(resultado33);
		        
		        
		        double valor5 = 2.0;
		        int valor6 = 9;
		        double resultado44;
		        
		        resultado44 = valor5 * valor6;
		        
		        System.out.println(resultado44);
		        		
		//Ejercicio 10
		      
		        int amount = 1000;
		        boolean PAY_TAX = true;
		        double taxI;
		        
		        if(PAY_TAX) { 
		        	taxI = 0.07 * amount;
		        }else { 
		        	taxI = 0.0;
		        }
		        System.out.println("El impuesto es: " + taxI);
		
		
		
	}

}
