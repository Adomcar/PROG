Algoritmo OrdenarNumeros
	Definir n1, n2, n3 Como Real
	
    Escribir "Ingresa el primer número: "
    Leer n1
    Escribir "Ingresa el segundo número: "
    Leer n2
    Escribir "Ingresa el tercer número: "
    Leer n3
	
    Si (n1 <= n2) Y (n1 <= n3) Entonces
        Si (n2 <= n3) Entonces
            Escribir n1, n2, n3
        Sino
            Escribir n1, n3, n2
        FinSi
    Sino
        Si (n2 <= n1) Y (n2 <= n3) Entonces
            Si (n1 <= n3) Entonces
                Escribir n2, n1, n3
            Sino
                Escribir n2, n3, n1
            FinSi
        Sino
            Si (n3 <= n1) Y (n3 <= n2) Entonces
                Si (n1 <= n2) Entonces
                    Escribir n3, n1, n2
                Sino
                    Escribir n3, n2, n1
                FinSi
            FinSi
        FinSi
    FinSi
FinAlgoritmo
