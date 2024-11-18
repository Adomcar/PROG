Algoritmo EsPrimo
	Definir i, num Como Real
	Definir div Como Entero
	Escribir "Introduzca un numero"
	Leer num
	div = 0
	Para i <- 1 Hasta raiz(num) Con Paso 1 Hacer
		Si (num % i = 0)  Entonces
			div <- div + 1
		Fin Si
	Fin Para
	
	Si div = 1 Entonces
		Escribir "Es primo"
	SiNo
		Escribir  "No es primo"
	Fin Si
	
FinAlgoritmo
