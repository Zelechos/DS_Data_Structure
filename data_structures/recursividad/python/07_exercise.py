# ---------------------- Ejercicio 7 ---------------------- 

# Para calcular el máximo común divisor de dos numeros enteros puedo aplicar el algoritmo de euclides, que consiste en ir restando el más pequeños del más grande hasta que queden dos numeros iguales , que seran el maximo común divisor del los dos números.
# Por Ejemplo:
# si comenzamos con el Par de números de : 412, 184.

# |412 |228 |44 |44 |44 |44 |44|36|28|20|12|8|4|
# |184 |184 |184|140|96 |52 |8 |8 |8 |8 |8 |4|4|

#### Es decir m.c.d de 412  ,  184   es   4

Numero1 = int(input("Digite el primer numero : "));
Numero2 = int(input("Digite el segundo numero : "));

#Aqui solo guardamos datos para mostrarlos posteriormente
n1 = Numero1
n2 = Numero2

def EuclidesAlgoritmo(Numero1,Numero2,n1,n2):
    if Numero1 > Numero2 : 
        Numero1 -= Numero2
    elif Numero2 > Numero1:
        Numero2 -= Numero1
    elif Numero2 == Numero1:
        print("El m.c.d(Maximo Comun Divisor) de ",n1," y ",n2," es : ",Numero1)
        return "Fin del Programa . . .";
    return EuclidesAlgoritmo(Numero1,Numero2,n1,n2);#Numero1 es la respuesta por que si se restaron, entonces ambos seran el m.c.d

print(EuclidesAlgoritmo(Numero1,Numero2,n1,n2));

