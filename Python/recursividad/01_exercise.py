# ---------------------- Ejercicio 1 ----------------------

# Hallar el Factorial de un Numero introducido por teclado (Aplicando Recursividad)
number = int(input("Digite un Numero para hallar su Factorial : "))

# Nuestra Funcion Recursiva solo funciona para numeros positivos por eso primero verificaremos el numero
def check_negative_number(number):
    if number >= 0:
        return number
    return number * -1


positive_number = check_negative_number(number)

# Aplicando Recursividad
def factorial(number):
    if number == 0 or number == 1:
        return 1
    else:
        return number * factorial(number - 1)  # Aqui la Funcion se LLama asi misma


print("El Factorial de", positive_number, "es : ", factorial(positive_number))
print("Fin del Programa . . .")
