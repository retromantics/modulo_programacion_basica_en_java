Algoritmo calculoAhorro
	meses =12
	acumulado =0
	
	Para i<-1 Hasta meses Con Paso paso Hacer
		
		Escribir "ahorro acumulado antes del deposito ", acumulado
		Escribir "ingrese cantidad depositada en el mes ",i
		leer monto
		Escribir "_____________________________________ "
		acumulado = acumulado+monto
		i=i+1
	Fin Para
	
	Escribir "el monto total acumulado durante el año es ", acumulado
FinAlgoritmo
