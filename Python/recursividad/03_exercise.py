# ---------------------- Ejercicio 3 ---------------------- 

# Introducir un Numero mostrar el Numero que le Corresponde de la Sucesion Fibonacii (Aplicando Recursividad)

Numero = int(input("Digite que numero desea ver de la Famosa Sucesion Fibonacci : "))

def Fibonacci(Numero):
    
    if Numero == 0:
        return 0
    elif Numero == 1 or Numero == 2:
        return 1
    else:
        return Fibonacci(Numero-1)+Fibonacci(Numero-2)# Aplicando Recursividad

Respuesta = Fibonacci(Numero)

print("El Numero de la Sucesion Fibonacci que Corresponde a su Numero es : ",Respuesta)
print("Fin del Programa . . .")