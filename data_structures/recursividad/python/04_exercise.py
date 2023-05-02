# ---------------------- Ejercicio 4 ---------------------- 

# Mostrar la siguiente sucesion y mostrar su Resultado(Aplicando Recursividad) N^N+9^1+8^2+7^3+6^4+5^5+4^6+3^7+2^8+1^9+N^N=11377

Numero = int(input("Digite el numero de Elementos que tendra la sucesion : "))

Contador = 1
Suma = 0

def Sucesion(Numero,Contador,Suma):
    
    if Numero > 0:
        Suma += (Numero**Contador)
        if Numero != 1:
            print("[",Numero,"^",Contador,"]",end=" + ")
        else:
            print("[",Numero,"^",Contador,"]",end=" = ")

        return Sucesion(Numero-1,Contador+1,Suma)# Aplicando Recursividad
    else:
        return Suma

Respuesta = Sucesion(Numero,Contador,Suma)

print(Respuesta)    
print("Fin del Programa . . .")