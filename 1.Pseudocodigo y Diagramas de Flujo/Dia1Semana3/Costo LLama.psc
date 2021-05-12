Algoritmo Llamada
	
	Leer cantMinutos
	
	Segun cantMinutos Hacer
		cantMinutos<=5  :
			costoLlmada = cantMinutos* 100
		cantMinutos>5 & cantMinutos <=8  :
			costoLlmada = (cantMinutos-5* 80)-5*100
		cantMinutos>8 & cantMinutos <=10  :
			costoLlmada = (cantMinutos-5* 70)-(5*100)-(3*80)
		cantMinutos >10:
			costoLlmada = (cantMinutos-5* 50)-(5*100)-(3*80)-(2*70)
	Fin Segun
	imprimir "ingrese fecha y hora de la llamada"
	Leer fecha
	si(fecha=="domingo")
		costoLlmada=costoLlmada*1.03
	fin si
	si(fecha=="diahabil"&fecha=="turnoMatutino")
		costoLlmada=costoLlmada*1.15
	fin si
	si(fecha=="diahabil"&fecha=="turnoMatutino")
		costoLlmada=costoLlmada*1.1
	fin si
	Imprimir "el costo final de la llamada es" costoLlmada
	
FinAlgoritmo
