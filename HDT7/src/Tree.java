/*
UVG
HDT 7
Ramon Samayoa
Jorge Mario Lara
Miercoles 5 de Cotubre de 2016
*/

public class Tree {
    //ATRIBUTOS
    private int Frec;
    private String Code="";
    private char Character;
    private Tree Izquierda=null;
    private Tree Derecha=null;
    
    
    //CONSTRUCTOR
    public Tree(Tree iz, Tree der, char name){
        Izquierda=iz;
        Derecha=der;
        Character=name;
        
        //Caso de la existencia de dos hijos
        if (iz!=null && der!=null){
        Frec = iz.getFrec()+der.getFrec();
        }
    }
    
    //-----------------SETERS Y GETERS-----------------
    
    //FRECUENCIA
    public int getFrec() {
        return Frec;
    }

    public void setFrec(int Frec) {
        this.Frec = Frec;
    }

    
    
    //CARACTER
    public char getCharacter() {
        return Character;
    }
    public void setCharacter(char Character) {
        this.Character = Character;
    }
    
    
    
    //CODIGO    
    public String getCode() {
        return Code;
    }
    public void setCode(String codigo,String add) {
        this.Code = codigo;
        if (Izquierda!=null){
            Izquierda.setCode(add+Izquierda.getCode(),add);
        }
        if (Derecha!=null){
            Derecha.setCode(add+Derecha.getCode(),add);
        }
    }


    
    //DERECHA
    public Tree getDerecha() {
        return Derecha;
    }
    public void setDerecha(Tree Derecha) {
        this.Derecha = Derecha;
    }
    
    
    
    //IZQUIERDA
    public Tree getIzquierda() {
        return Izquierda;
    }
    public void setIzquierda(Tree Izquierda) {
        this.Izquierda = Izquierda;
    }
}
