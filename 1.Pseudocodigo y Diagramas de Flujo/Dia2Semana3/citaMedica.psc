Algoritmo consultaMedica
	// Definir nroCita Como Entero
	// Definir totalAcumulado Como Entero
	Escribir 'Ingrese su numer de cita'
	Leer nroCita
	Segun nroCita  Hacer
		nroCita<=3:
			valorCita <- 20000
			totalAcumulado <- valorCita-1*nroCita
		nroCita>3 Y nroCita<=5:
			valorCita <- 15000
			totalAcumulado <- (nroCita-3-1)*valorCita+60000
		nroCita>5 Y nroCita<=8:
			valorCita <- 10000
			totalAcumulado <- (nroCita-5-1)*valorCita+60000+30000
		nroCita>8:
			valorCita <- 5000
			totalAcumulado <- (nroCita-9-1)*valorCita+60000+30000+30000
	FinSegun
	Escribir 'el valor de su cita actual es ',valorCita
	Escribir 'el total acumulado en su tratamiento es ',totalAcumulado
FinAlgoritmo
