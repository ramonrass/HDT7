/*
UVG
HDT 7
Ramon Samayoa
Jorge Mario Lara
Miercoles 5 de Cotubre de 2016
*/

import java.util.Vector;

public class Codificacion {
    //ATRIBUTOS
    private Vector<Tree> PriorityQueue;
    private String mensaje;
    
    
    //CONSTRUCTOR
    public Codificacion(String line){
        mensaje=line;
        PriorityQueue=new Vector<Tree>();
    }
    
    //------------------SETERS Y GETERS--------------------
    public Vector<Tree> getQueue() {
        return PriorityQueue;
    }

    public void setQueue(Vector<Tree> queue) {
        this.PriorityQueue = queue;
    }

    public String getMensaje() {
        return mensaje;
    }

    public void setMensaje(String msg) {
        this.mensaje = msg;
    }
    
    
    
    //Este metodo contruye el arbol a base del PriorityQueue y combina todo al final
    public void Construir(){
        int pos=0;
        Tree t1 , t2, tree;
        //Se encuentra el que tenga la frecuencia mas baja
        while(PriorityQueue.size()>1){
            t1=PriorityQueue.elementAt(0);
            for(int i=0;i<PriorityQueue.size();i++){
                if (PriorityQueue.elementAt(i).getFrec()<t1.getFrec()){
                    t1=PriorityQueue.elementAt(i);
                    pos=i;
                }
            }
            PriorityQueue.remove(pos);
            pos=0;
            t2=PriorityQueue.elementAt(0);
            for(int i=0;i<PriorityQueue.size();i++){
                if (PriorityQueue.elementAt(i).getFrec()<t2.getFrec()){
                    t2=PriorityQueue.elementAt(i);
                    pos=i;
                }
            }
            PriorityQueue.remove(pos);
            pos=0;
            //Se coloca un 0 o 1 al codigo para navegar en el arbol
            t1.setCode("0"+t1.getCode(),"0");
            t2.setCode("1"+t2.getCode(),"1");
            tree = new Tree(t1,t2,' ');
            PriorityQueue.add(tree);
        }
    }
    
    
    
    //Este atravies todo el arbol para extraer todos los caracteres.
    public void Data(Tree find){
        
        if (find.getIzquierda()!=null){
            Data(find.getIzquierda());
        }
        if (find.getDerecha()!=null){
            Data(find.getDerecha());
        }
        if (find.getCharacter()!=' '){
            PriorityQueue.add(find);
        }
        
    }
    
    
    
    //Este metodo separa el mensaje y convierte cada caracter en un arbol.
    public Vector<Tree> Separar(){
        String lines=mensaje.toLowerCase();
        char hold;
        int tam1, tam2;
        Tree tree;
        while (lines.length()>0){
            hold = lines.charAt(0);
            tam1 = lines.length();
            lines = lines.replace(hold, ' ');
            lines = lines.replaceAll(" ", "");
            tam2 = lines.length();
            tree= new Tree(null,null,hold);
            tree.setFrec(tam1-tam2);
            PriorityQueue.add(tree);
        
        }
        return PriorityQueue;
    }
}
