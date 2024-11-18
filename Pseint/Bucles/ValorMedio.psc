Algoritmo ValorMedio
	Definir c, n, m, aux Como Real
	
	Escribir "Indique la cantidad de numeros que desea introducir:"
	Leer c
	aux = c
	
	Mientras c <> 0 Hacer
		
		Escribir "Introduzca un numero"
		Leer n
		
		m = m + n
		
		c = c - 1 
	Fin Mientras
	
	m = m / aux
	
	Escribir "La media de los numeros es: ", m
FinAlgoritmo
