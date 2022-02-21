# ---------------------- Ejercicio 2 ---------------------- 

# Mostrar la siguiente sucesion de Numeros  S = 3+6+4+7+5+8 .. etc para n Numeros y mostrar el Resultado (Aplicando Recursividad)

Numero = int(input("Digita la Cantidad de Numeros que sumara : "))

NumeroInicial = 3             
Respuesta = 3
Switch = 0
Suma = 0

def Mostrador(Numero, NumeroInicial , Respuesta , Switch , Suma):#respetar el orden al llamar los argumento en la recusividad
    if Numero > 0:
        
        if Switch == 0:
            
            if Numero != 1:
                print (Respuesta, end=" + ")
            else : 
                print(Respuesta, end =" = ")
                
            Suma +=Respuesta
            Respuesta+=NumeroInicial
            NumeroInicial-=1
            Switch+=1
            
            return Mostrador(Numero-1 , NumeroInicial , Respuesta , Switch , Suma)#Aplicando Recusividad
        
        else:
            
            if Numero != 1:
                print (Respuesta, end=" + ")
            else:
                print(Respuesta,end=" = ")
                
            Suma +=Respuesta
            Respuesta-=NumeroInicial
            NumeroInicial+=1
            Switch-=1
            
            return Mostrador(Numero-1 , NumeroInicial , Respuesta , Switch ,Suma)#Aplicando Recursividad
        
    return Suma

print(Mostrador(Numero, NumeroInicial ,Respuesta ,Switch,Suma))
print("Fin del Programa . . .")                      

