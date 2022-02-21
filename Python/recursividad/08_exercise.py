# ---------------------- Ejercicio 8 ---------------------- 

# Escriba una función recursiva para invertir una lista.

Lista = [3,6,9,4,12,16,34,4,21,100,19] #Lista Invertida es  = [19,16,12,9,6,3]
print('La Lista Actual es : \n',Lista)

# Variables Que Se Introduciran en la Funcion
Longitud = len(Lista)
Ultimo = Longitud-1
Primero = 0
Aux = 0 

def Invertir(Lista,Primero,Ultimo,Aux):
    if Primero == Ultimo:
        return print('La Lista Invertida es : \n',Lista) 
    elif Primero < Ultimo:
        Aux = Lista[Primero]
        Lista[Primero] = Lista[Ultimo]
        Lista[Ultimo] = Aux
        return Invertir(Lista,Primero+1,Ultimo-1,Aux)#Aplicando Recursividad
        

Invertir(Lista,Primero,Ultimo,Aux)