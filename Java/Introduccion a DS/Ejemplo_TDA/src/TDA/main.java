/*
 * @Author : Pragmatic Coder
 * @Repositorio : https://github.com/Zelechos/DS_Data_Structure
 */
package TDA;

public class main {

    public static void main(String[] args) {
        
//        Instanciamos nuestro TDA es que el point
        point instance = new point();
        instance.setX(9);
        instance.setY(99);
        instance.setZ(999);
        instance.setDimension("3D");
        System.out.println("Dimension : "+instance.getDimension());
        System.out.println("Coordinate X: "+instance.getX());
        System.out.println("Coordinate Y: "+instance.getY());
        System.out.println("Coordinate Z: "+instance.getZ());
        
    }
    
}
