Algoritmo Ejercicio01
	Definir num, div, cont Como Entero
	
	Escribir "Introduzca un numero: " sin saltar
	Leer num
	
	Escribir  "Los diviores propios de ",num," son " Sin Saltar
	
	Para cont = 1 Hasta num/2 Con Paso 1 Hacer
		
		Si (num MOD cont) = 0 Entonces
			
			Escribir cont Sin Saltar
			div = div + cont
			
			Si cont < num/2 Entonces
				Escribir ", " Sin Saltar
			Fin Si
			
		Fin Si
		
	Fin Para
	
	Escribir " y la suma de los mismos es ",div
	
FinAlgoritmo
