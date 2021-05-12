Algoritmo promedio
	Escribir 'ingrese cantidad de alumnos'
	Leer cantidad
	suma <- 0
	Para i<-1 Hasta cantidad Con Paso PASO Hacer
		Escribir 'ingrese edad '
		Leer num
		suma <- suma+num
		i <- i+1
	FinPara
	prom <- suma/cantidad
	Escribir 'el promedio de edad de los alumnos es ',prom
FinAlgoritmo
