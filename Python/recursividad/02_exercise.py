# ---------------------- Ejercicio 2 ----------------------

# Mostrar la siguiente sucesion de numeros  S = 3+6+4+7+5+8 .. etc para n numeros y mostrar el Resultado (Aplicando Recursividad)

number = int(input("Digita la Cantidad de numbers a sumar : "))


def show_sequence(
    number, initial_number, response, addition, switch
):  # respetar el orden al llamar los argumento en la recusividad
    if number > 0:
        if switch:

            if number != 1:
                print(response, end=" + ")
            else:
                print(response, end=" = ")
            addition += response
            response += initial_number
            initial_number -= 1
            switch = False

            return show_sequence(
                number - 1, initial_number, response, addition, switch
            )  # Aplicando Recusividad

        else:
            if number != 1:
                print(response, end=" + ")
            else:
                print(response, end=" = ")
            addition += response
            response -= initial_number
            initial_number += 1
            switch = True

            return show_sequence(
                number - 1, initial_number, response, addition, switch
            )  # Aplicando Recursividad

    return addition


print(show_sequence(number, initial_number=3, response=3, addition=0, switch=True))
print("Fin del Programa . . .")
