Algoritmo bus
	definir cantPersonas Como Entero
	definir distancia Como Entero
	definir tipoBus Como Cadena
	Definir  costoPP Como Entero
	definir total como entero
	
	escribir "ingrese cantidad de pasajeros: "
	leer cantPersonas
	escribir "ingrese cantidad de Km: "
	leer distancia
	escribir "ingrese tipo de bus "
	leer tipoBus
	
	Segun tipoBus Hacer
		"A":
			costoPP = 200
		"B":
			costoPP = 250
		"C":
			costoPP = 300
	Fin Segun
	
	si cantPersonas<20 entonces
		total = 20* costoPP
	SiNo
		total = cantPersonas*costoPP
	FinSi
	
	escribir "el costo por persona en el bus ",tipoBus " es ", costoPP
	Escribir  " el monto total del viaje es " ,total*distancia
	
FinAlgoritmo