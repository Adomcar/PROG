Algoritmo NombreApellidoSexo
	Definir nom,ape,sex Como Cadena
	
	Escribir "Introduzca tu no nombre:"
	Leer nom
	
	Escribir "Introduzca su apellido"
	Leer ape
	
	Escribir "Introduzca su sexo (H/Hombre --- M/Mujer)"
	Leer sex
	
	Si sex == "H" Entonces
		Escribir  "Bienvenido,Sr."
	SiNo
		Escribir  "Bienvenido,Sra."
	Fin Si
	
	Escribir nom," ",ape
	
FinAlgoritmo
