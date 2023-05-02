# ---------------------- Ejercicio 6 ---------------------- 

# Realizar la siguiente sucesion para N numeros introducidos y mostrar el Resultado(Aplicando Recursividad) (3/1)^1+(5/1)^3+(4/2)^5+(6/3)^7+(5/5)^9+(7/8)^11+(6/13)^13= 289.2302343

Numero  = int(input("Digite un La Cantidad de Elementos que tendra la Sucesion : "))

#Variables Divisor
Fibonaci = 1
Auxiliar = 0
Antecesor = 0
Lista = []

#Variables Dividendo
NumeroDividendo = 3
Switch = 0
Lista1 = []

#Variables Exponente
Exponent = 1 
Lista2 = []

#Varivles Resultado
Contador = 0
Respuesta = 0

#Primero Generamos la Sucesion Fibonacci para el Divisor
def Divisor(Fibonaci,Auxiliar,Antecesor,Lista,Numero):
    
    while (Numero > 0):

        Lista.append(Fibonaci)
        
        Auxiliar = Fibonaci              
        Fibonaci = Antecesor + Auxiliar  
        Antecesor = Auxiliar             
        
        Numero -= 1
    
    return Lista


#Segundo Generamos la Sucesion de Dividendos Aplicando Recursividad
def Dividendo(Numero,Switch,NumeroDividendo,Lista1):
    if Numero > 0 :
        if Switch == 0:
            Lista1.append(NumeroDividendo)
            return Dividendo(Numero-1,Switch+1,NumeroDividendo+2,Lista1)# Aplicando Recursividad
        elif Switch == 1:
            Lista1.append(NumeroDividendo)
            return Dividendo(Numero-1,Switch-1,NumeroDividendo-1,Lista1)# Aplicando Recursividad
        
    return Lista1

#Tercero Genereamos La Sucesion de Exponenete Aplicando Recursividad
def Exponente(Exponent,Lista2,Numero):
    if Numero > 0:
        Lista2.append(Exponent)
        return Exponente(Exponent+2,Lista2,Numero-1)# Aplicando Recursividad
    
    return Lista2

#Aqui Tranformamos Nuestras Funciones en Variables para Introducirlos en otra Funcion
Divisores = Divisor(Fibonaci,Auxiliar,Antecesor,Lista,Numero)
Dividendos = Dividendo(Numero,Switch,NumeroDividendo,Lista1)
Exponentes = Exponente(Exponent,Lista2,Numero)


#Aqui Definimos el Resultado Y lo que mostraremos en Pantalla Aplicancdo Recusividad
def Resultado(Divisores,Dividendos,Exponentes,Numero,Contador,Respuesta):
    if Numero > 0 :
        Respuesta += (( Dividendos[Contador]/Divisores[Contador] )**Exponentes[Contador])
        
        if Numero != 1:
            print("(",Dividendos[Contador],"/",Divisores[Contador],")^",Exponentes[Contador],end=" + ")
        else:
            print("(",Dividendos[Contador],"/",Divisores[Contador],")^",Exponentes[Contador],end=" = ")
        
        return Resultado(Divisores,Dividendos,Exponentes,Numero-1,Contador+1,Respuesta)# Aplicando Recursividad
     
    return Respuesta   


print(Resultado(Divisores,Dividendos,Exponentes,Numero,Contador,Respuesta))
print("Fin del Programa . . .")