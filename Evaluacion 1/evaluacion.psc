Funcion  muestraBoleta ( total, descripcion,cantProducto )
	Escribir ""
	Escribir ""
	Escribir "---------- Comprobante de Venta --------------"
	Escribir ""
	Escribir "Producto :	",descripcion
	Escribir "Catidad	:	",cantProducto
	Escribir "Total 		:	",total
	Escribir ""
	Escribir "---------------------------------------------"
Fin Funcion

Funcion ventaExitosa <- realizaVenta( total,montoBilletera )
	Escribir "Su total es :",total
	Escribir "Desea cotinuar con el Pago (s/n)"
	Leer opt
	si opt="s"
		si validaPago(total,montoBilletera)
			Escribir "Compra realizada existosamente"
			ventaExitosa=Verdadero
		SiNo
			ventaExitosa=falso
			Escribir "Su saldo es insuficiente para realizar la compra -Saldo :",montoBilletera 
		FinSi
	SiNo
		Escribir "Venta Cancelada por el usuario"
	FinSi
Fin Funcion

Funcion pagoValido <- validaPago ( total ,montoBilletera)
	si montoBilletera >= total
		pagoValido = Verdadero
	SiNo
		pagoValido=Falso
	FinSi
	
Fin Funcion



Algoritmo evaluacion
	
	definir stock1 Como Entero
	definir stock2 Como Entero
	definir stock3 Como Entero
	definir valor1 Como Entero
	definir valor2 Como Entero
	definir valor3 Como Entero
	definir montoBilletera Como Entero
	definir opt Como Caracter
	
	montoBilletera =50000
	valor1=10000
	valor2=5000
	valor3=1500
	stock1 =30
	stock2 =2
	stock3 =10
	descripcion1 ="Alimento para Gatos- $10.000"
	descripcion2="Arena para gatos - $5.000"
	descripcion3="Hierba para gatos - $1.500"
	
	Escribir "Selecciones un producto"
	Escribir "1.",descripcion1
	Escribir "2.",descripcion2
	Escribir "3.",descripcion3
	
	Leer  Producto
	Escribir "Ingrese la cantidad "
	Leer cantProducto
	
	Segun Producto Hacer
		1:
			Si stock1 >= cantProducto 
				
				total =valor1*cantProducto
				si realizaVenta(total,montoBilletera)==Verdadero
					stock1 =stock-cantProducto
					montoBilletera = montoBilletera-total
					muestraBoleta(total,descripcion1,cantProducto)
				FinSi
			FinSi
		2:
			Si stock2 >= cantProducto 
				
				total =valor2*cantProducto
				si realizaVenta(total,montoBilletera)==Verdadero
					stock2 =stock-cantProducto
					montoBilletera = montoBilletera-total
					muestraBoleta(total,descripcion3,cantProducto)
				FinSi
			FinSi
		3:
			Si stock3 >= cantProducto 
				
				total =valor3*cantProducto
				si realizaVenta(total,montoBilletera)==Verdadero
					stock3 =stock-cantProducto
					montoBilletera = montoBilletera-total
					muestraBoleta(total,descripcion3,cantProducto)
				FinSi
			FinSi
		De Otro Modo:
			Escribir "No existe stock del producto seleccionado"
	Fin Segun
FinAlgoritmo
