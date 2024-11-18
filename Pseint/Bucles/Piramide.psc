Algoritmo Piramide
	Definir altura, esp, asterisco Como Entero

	
	Escribir  "Introduce la altura"
	Leer altura
	
	Para fila <- 1 Hasta altura Con Paso 1 Hacer
		Para esp <- fila Hasta altura - 1 Con Paso 1 Hacer
			Escribir " " Sin Saltar
		Fin Para
		Para asterisco <- 1 Hasta (2*fila)-1 Con Paso 1 Hacer
			Escribir "*" Sin Saltar
		Fin Para
		Escribir  " "
	Fin Para
FinAlgoritmo
