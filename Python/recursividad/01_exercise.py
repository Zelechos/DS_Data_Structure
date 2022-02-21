# ---------------------- Ejercicio 1 ---------------------- 

# Hallar el Factorial de un Numero introducido por teclado (Aplicando Recursividad)

Numero = int(input("Digite un Numero para hallar su Factorial : "))
NumeroVerificador = Numero

#Nuestra Funcion Recursiva solo funciona para numeros positivos por eso primero verificaremos el numero 
def Verificador(Numero):
    if Numero < 0 :
        NumeroFinal = Numero*-1
        return NumeroFinal
    else:
        return Numero

NumeroFactorial = Verificador(Numero)

#Aplicando Recursividad
def Factorial(NumeroFactorial):
    
    if NumeroFactorial == 0 or NumeroFactorial == 1:
        return 1
    else:
        return NumeroFactorial * Factorial(NumeroFactorial-1)  #Aqui la Funcion se LLama asi misma


def VerificadorFinal(NumeroVerificador):
    
    if NumeroVerificador < 0:
        FacetorialNumero = Factorial(NumeroFactorial)*-1
        return FacetorialNumero
    else : 
        FacetorialNumero = Factorial(NumeroFactorial)
        return FacetorialNumero

Respuesta = VerificadorFinal(Numero)
    
print("El Factorial de",NumeroVerificador,"es : ",Respuesta)
print("Fin del Programa . . .")