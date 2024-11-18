Algoritmo Fibonacci
	Definir n, c, t, aux Como Entero
	aux = 1
	Escribir "Introduze la cantidad de numeros quiere ver"
	Leer n
	
	Para c <- 1 Hasta n Con Paso 1 Hacer
		Escribir aux
		t<- t + aux
		
		Escribir t
		aux <- aux + t
	
	Fin Para
	
	Escribir t
FinAlgoritmo
