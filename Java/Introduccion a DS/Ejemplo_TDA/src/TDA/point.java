/*
 * @Author : Pragmatic Coder
 * @Repositorio : https://github.com/Zelechos/DS_Data_Structure
 */
package TDA;

// La clase point es nuestro TDA
public class point {
    
    private int x, y, z;
    String dimension;
    
    
    public point(int coordinateX, int coordinateY){
        this.x = coordinateX;
        this.y = coordinateY;
    }
    
    public point(int coordinateX, int coordinateY, int coordinateZ){
        this.x = coordinateX;
        this.y = coordinateY;
        this.z = coordinateZ;
    }
    
    public point(){
        this.x = 0;
        this.y = 0;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public int getZ() {
        return z;
    }

    public String getDimension(){
        return  dimension;
    }
    
    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    public void setZ(int z) {
        this.z = z;
    }
    
    public void setDimension(String dimension){
        this.dimension = dimension;
    }
        
}
