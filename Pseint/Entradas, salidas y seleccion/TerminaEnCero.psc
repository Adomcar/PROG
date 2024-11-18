Algoritmo TerminaEnCero
	Definir  n, f como Real
	
	Escribir "Introduzca un numero"
	Leer n
	
	f<- n MOD 10
	
	Si f = 0 Entonces
		Escribir "El numero termina en 0"
	SiNo
		Escribir "El numero no termina en 0"
	Fin Si
FinAlgoritmo
