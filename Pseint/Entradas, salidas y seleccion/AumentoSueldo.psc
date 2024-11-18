Algoritmo AumentoSueldo
	Definir s Como Real
	
	Escribir "Introduzca su sueldo: "
	Leer s
	
	Si s > 500000 Entonces
		s = s * 1.12
	SiNo
		s = s * 1.15
	Fin Si
	
	Escribir "Sueldo final: ",s
	
FinAlgoritmo

