# ---------------------- Ejercicio 5 ---------------------- 

# Representar la siguiente sucesion y mostrar su Resultado(Aplicando Recursividad) 4^0+9^1+6^1+11^2+8^3+13^5+10^8+N^N= 100371942

N = int(input("Digite el numero de elementos que tendra la Sucesion : "))
fibo =0
fibo1=0
num = 4
suma = 0
switch=0
posi=0
lista =[]
def Fibonacci(lista,N,posi,fibo,fibo1):
    while(N>0):
        if fibo == 0:
            lista.append(fibo)
            fibo+=1  
            N-=1
        else:
            lista.append(fibo)# para 5 aqui se hacer 4
            posi=fibo         # 1<-1  , 1<-1  , 2<-2  , 3<-3            
            fibo = fibo+fibo1 # 1=1+0 , 2=1+1 , 3=2+1 , 5=3+2
            fibo1=posi        # 1<-1  , 1<-1  , 2<-2  , 3<-3
            N-=1

    return lista 


Lista = Fibonacci(lista,N,posi,fibo,fibo1)       
pos=0
def Sucesion(pos,Lista,num,suma,N,switch):
    if N > 0:
        if switch == 0:
            
            suma+=(num**Lista[pos])
            if N!=1:
                print("[",num,"^",Lista[pos],"]",end=" + ")
            else:
                print("[",num,"^",Lista[pos],"]",end=" = ")

            return Sucesion(pos+1,Lista,num+5,suma,N-1,switch+1)# Aplicando Recursividad
        
        else:
            suma+=(num**Lista[pos])
            if N!=1:
                print("[",num,"^",Lista[pos],"]",end=" + ")
            else:
                print("[",num,"^",Lista[pos],"]",end=" = ")
                
            return Sucesion(pos+1,Lista,num-3,suma,N-1,switch-1)# Aplicando Recursividad
        
    return suma

print(Sucesion(pos,Lista,num,suma,N,switch))
print("Fin del Programa . . .")