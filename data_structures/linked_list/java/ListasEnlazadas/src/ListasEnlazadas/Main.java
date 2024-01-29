/*
  * @Author : Pragmatic Coder
  * @Repositorio : https://github.com/Zelechos/DS_Data_Structure
 */
package ListasEnlazadas;

import javax.swing.*;

public class Main {

    public static void main(String[] args) {

        ListaEnlazada lista = new ListaEnlazada();

        int Opcion = 0, elemento, posicion;

        do {
            try {

                Opcion = Integer.parseInt(JOptionPane.showInputDialog(" ---- MENU ----\n"
                        + "1 .- Insertar al Incio de la Lista. \n"
                        + "2 .- Insertar al Final de la Lista.\n"
                        + "3 .- Insertar un elemento en la Lista.\n"
                        + "4 .- Longitud de la Lista.\n"
                        + "5 .- Verificar si la Lista esta vacia.\n"
                        + "6 .- Eliminar el Primero elemento de la Lista.\n"
                        + "7 .- Eliminar el Ultimo elemento de la Lista.\n"
                        + "8 .- Eliminar un elemento de la Lista.\n"
                        + "9 .- Mostrar Lista.\n"
                        + "10 .- Salir."));

                switch (Opcion) {

                    case 1:
                        try {

                        elemento = Integer.parseInt(JOptionPane.showInputDialog("Digite un Número : "));

                        lista.InsertarPrincipio(elemento);

                    } catch (NumberFormatException ex) {
                        JOptionPane.showMessageDialog(null, "No Introdujo un Numero . . .  ERROR" + ex.getMessage());
                    } finally {
                        lista.MostrarLista();
                    }


                        break;
                    
                    case 2:
                        try {

                        elemento = Integer.parseInt(JOptionPane.showInputDialog("Digite un Numero : "));
                        lista.InsertarFinal(elemento);

                    } catch (NumberFormatException ex) {
                        JOptionPane.showMessageDialog(null, "No Introdujo un Numero . . .  ERROR" + ex.getMessage());
                    } finally {
                        lista.MostrarLista();
                    }
                    break;

                    case 3:
                        elemento = Integer.parseInt(JOptionPane.showInputDialog("Digite el Numero a insertar : "));
                        posicion = Integer.parseInt(JOptionPane.showInputDialog("Digite la posicion donde insertar : "));

                        lista.InsertarDespues(posicion, elemento);
                        lista.MostrarLista();
                        break;

                    case 4:
                        JOptionPane.showMessageDialog(null, "La Cantidad de elementos en la Lista Enlazada es : " + lista.Cantidad());
                        break;

                    case 5:
                        if (lista.Vacio() == true) {
                            JOptionPane.showMessageDialog(null, "La Lista Enlazada esta Vacia");
                        } else {
                            JOptionPane.showMessageDialog(null, "La Lista Enlazada tiene elementos");
                        }

                        break;
                    case 6:
                        lista.EliminarPrincipio();
                        lista.MostrarLista();
                        break;
                    case 7:
                        lista.EliminarFinal();
                        lista.MostrarLista();
                        break;
                    case 8:
                        elemento = Integer.parseInt(JOptionPane.showInputDialog("Digite la posicion de la Lista que desea Eliminar : "));
                        lista.EliminarNumero(elemento);
                        lista.MostrarLista();
                        break;
                    case 9:
                        lista.MostrarLista();
                        break;

                    case 10:
                        JOptionPane.showMessageDialog(null, "Fin del Programa");
                        System.exit(0);
                        break;
                    default:
                        JOptionPane.showMessageDialog(null, "Opcion Incorrecta No existe NaN");

                        break;

                }

            } catch (Exception Ex) {

            } finally {

            }
        } while (Opcion != 10);
    }

}
