Algoritmo  SumaRestaMultiplicacionDivision
	
	Definir n1, n2, sum, res, mult, div Como Real
	Definir Op como Entero
	
	Escribir "Introduzca el primer numero"
	Leer n1
	
	Escribir "Introduzca el segundo numero"
	Leer n2
	
	Escribir "¿Que operacion quieres realizar? (Sumar=1/Restar=2/Multiplicar=3/Dividir=4)"
	Leer Op
	
	Segun Op Hacer
		1:
			sum <- n1 + n2
			Escribir sum;
		2:
			res <- n1 - n2
			Escribir res;
		3:
			mult <- n1 * n2
			Escribir mult;
		4:
			div <- n1 / n2
			Escribir div;
	Fin Segun
	
FinAlgoritmo
