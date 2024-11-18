Algoritmo Factorial
	Definir n, c, t como Real
	
	Escribir "Introduzca un numero:"
	Leer n
	t= 1
	
	Para c <- n Hasta 1 Con Paso -1 Hacer
		t <- t * c
	Fin Para
	
	Escribir "El factorial es: ",t
FinAlgoritmo
