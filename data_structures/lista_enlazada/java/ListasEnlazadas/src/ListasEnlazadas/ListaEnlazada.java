/*
  * @Author : Pragmatic Coder
  * @Repositorio : https://github.com/Zelechos/DS_Data_Structure
*/

package ListasEnlazadas;

import javax.swing.*;

public class ListaEnlazada {

    private Nodo Cabeza = null;
    private int Longitud = 0;
    
    private class Nodo{
        
        public int Numero;
        
        public Nodo Siguiente = null;
        
        //Constructor para el Nodo Final
        public Nodo(int Numero){
            this.Numero = Numero;
        }
        
    }
    
    public void InsertarPrincipio(int Numero){
        
        Nodo nodo = new Nodo(Numero);//Creamos Nuestro nodo que insertaremos
        nodo.Siguiente = Cabeza;
        Cabeza = nodo;
        Longitud++;
        
    }
    
    public void InsertarFinal(int Numero){
        
        Nodo nodo = new Nodo(Numero);//Creamos Nuestro nodo que insertaremos
        
        if(Cabeza == null){
            Cabeza = nodo;
        }else{
            
            Nodo puntero = Cabeza;
            //recorremos toda la lista hasta que el puntero sea igual null
            while(puntero.Siguiente != null){
                puntero = puntero.Siguiente;
            }
            //insertamos el nodo al final de la Lista
            puntero.Siguiente = nodo;
        }
        Longitud++;
        
    }
    
    public void InsertarDespues(int  Posicion , int Numero){
        Nodo nodo = new Nodo(Numero);
        if(Cabeza == null){
            Cabeza = nodo;
        }else{
            Nodo puntero = Cabeza;
            int contador = 0;
            
            while(contador < Posicion && puntero.Siguiente != null){
                puntero = puntero.Siguiente;
                contador++;
            }
            nodo.Siguiente = puntero.Siguiente;
            puntero.Siguiente = nodo;
        }
        Longitud++;
    }
    
    public int Cantidad(){
        return Longitud;
    }
    
    public boolean Vacio(){
        return Cabeza == null;
    }
    
    public void EliminarPrincipio(){
        if(Cabeza != null){
            Nodo Principio = Cabeza;
            Cabeza = Cabeza.Siguiente;
            Principio.Siguiente = null;
            Longitud--;
        }
    }
    
    public void EliminarFinal(){
        if(Cabeza != null){
            if(Cabeza.Siguiente == null){
                Cabeza = null;
                Longitud--;
            }else{
                Nodo puntero = Cabeza;
                while(puntero.Siguiente.Siguiente != null){
                    puntero = puntero.Siguiente;
                }
                puntero.Siguiente = null;
                Longitud--;
            }
        }
    }
    
    public void EliminarNumero(int Numero){
        if(Cabeza != null){
            if (Numero == 0) {
                Nodo Principio = Cabeza;
                Cabeza = Cabeza.Siguiente;
                Principio.Siguiente = null;
                Longitud--;
            }else if(Numero < Longitud){
                Nodo puntero = Cabeza;
                int contador = 0;
                while(contador < (Numero-1)){
                    puntero = puntero.Siguiente;
                    contador++;
                }
                Nodo Temporal = puntero.Siguiente;
                puntero.Siguiente = Temporal.Siguiente;
                Temporal.Siguiente = null;
                Longitud--;
            }
        }
    }
    
    public void MostrarLista(){
        Nodo puntero = Cabeza;
        StringBuilder text = new StringBuilder();
        while(puntero != null){
            text.append("[" + puntero.Numero + "]->");
            puntero = puntero.Siguiente;
        }
        JOptionPane.showMessageDialog(null, text);
    }
    
}
