Algoritmo DescZapato
	Definir z, c, t, desc Como Real
	z = 80
	
	Escribir  "Introduzca la cantidad de zapatos que quiere comprar:"
	Leer c
	
	t <- c * z
	
	Si (c > 10) y (c <= 20) Entonces
		desc = t * 0.1
		t = t - desc
	SiNo
		Si (c > 20) y (c < 30) Entonces
			desc = t * 0.2
			t = t - desc
		Fin Si
		
		Si (c > 40) Entonces
			desc = t * 0.4
			t = t - desc
		Fin Si
	Fin Si
	
	Escribir "Total a pagar: ",t
FinAlgoritmo
