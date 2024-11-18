Algoritmo Cuadrado
	Definir fila, altura, astersico, i Como Entero
	
	Escribir "Introduzca la altura del cuadrado: "
	Leer altura
	
	Para fila <- 1 Hasta altura Con Paso 1 Hacer
		
		Si (fila = 1) O (fila = altura) Entonces
			Para astersico <- 1 Hasta altura Con Paso 1 Hacer
				Escribir "*" Sin Saltar
			Fin Para
		SiNo
			Escribir "*" Sin Saltar
			
			Para esp = 2 Hasta altura -1 Con Paso 1 Hacer
					Escribir " " Sin Saltar 
			Fin Para
				
			Escribir "*" Sin Saltar
		Fin Si
		Escribir " "
		
	Fin Para
FinAlgoritmo
