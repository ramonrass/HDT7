


public class Tree {
    private int Frec;
    private String Code="";
    private char Character;
    private Tree Izquierda=null;
    private Tree Derecha=null;
    
    public Tree(Tree iz, Tree der, char name){
        Izquierda=iz;
        Derecha=der;
        Character=name;
        
        if (iz!=null && der!=null){
        Frec = iz.getFrec()+der.getFrec();
        }
    }
    
    public int getFrec() {
        return Frec;
    }

    public void setFrec(int Frec) {
        this.Frec = Frec;
    }

    
    public char getCharacter() {
        return Character;
    }
    public void setCharacter(char Character) {
        this.Character = Character;
    }
      
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

    public Tree getDerecha() {
        return Derecha;
    }
    public void setDerecha(Tree Derecha) {
        this.Derecha = Derecha;
    }

    public Tree getIzquierda() {
        return Izquierda;
    }
    public void setIzquierda(Tree Izquierda) {
        this.Izquierda = Izquierda;
    }
}
