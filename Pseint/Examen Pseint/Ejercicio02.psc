Algoritmo Ejercicio02
	Definir num, num2, div, div2, cont Como Entero
	
	Escribir "Introduzca un numero: " sin saltar
	Leer num
	
	Escribir "Introduzca un numero: " sin saltar
	Leer num2
	
	
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
	
	Escribir "y la suma de los mismos es ",div
	
	Escribir  "Los diviores propios de ",num2," son " Sin Saltar
	
	Para cont = 1 Hasta num2/2 Con Paso 1 Hacer
		Si (num2 MOD cont) = 0 Entonces
			Escribir cont Sin Saltar
			div2 = div2 + cont
			Si cont < num/2 Entonces
				Escribir ", " Sin Saltar
			Fin Si
		Fin Si
	Fin Para
	
	Escribir "y la suma de los mismos es ",div2
	
	Si (num = div2) Y (num2 = div) Entonces
		Escribir "Los dos numeros SI son amigos"
	SiNo
		Escribir "Los dos numeros NO son amigos"
	Fin Si
	
	
FinAlgoritmo
