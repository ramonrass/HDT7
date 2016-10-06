
import java.util.Vector;

public class Codificacion {

    private Vector<Tree> PriorityQueue;
    private String mensaje;

    public Codificacion(String line){
        mensaje=line;
        PriorityQueue=new Vector<Tree>();
    }
    

    public Vector<Tree> Separar(){
        String lines=mensaje.toLowerCase();
        char hold;
        int size1,size2;
        Tree tree;
        while (lines.length()>0){
            hold=lines.charAt(0);
            size1=lines.length();
            lines=lines.replace(hold, ' ');
            lines=lines.replaceAll(" ", "");
            size2=lines.length();
            tree= new Tree(null,null,hold);
            tree.setFrec(size1-size2);
            PriorityQueue.add(tree);
        
        }
        return PriorityQueue;
    }
    
    public void Construir(){
        int pos=0;
        Tree t1,t2,tree;
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
            Tree cara;
            t1.setCode("0"+t1.getCode(),"0");
            t2.setCode("1"+t2.getCode(),"1");
            tree=new Tree(t1,t2,' ');
            PriorityQueue.add(tree);
        }
    }
    
    public void Cdatos(Tree find){
        
        if (find.getIzquierda()!=null){
            Cdatos(find.getIzquierda());
        }
        if (find.getDerecha()!=null){
            Cdatos(find.getDerecha());
        }
        if (find.getCharacter()!=' '){
            PriorityQueue.add(find);
        }
        
    }
    public Vector<Tree> getQueue() {
        return PriorityQueue;
    }

    public void setQueue(Vector<Tree> queue) {
        this.PriorityQueue = queue;
    }

    public String getMsg() {
        return mensaje;
    }

    public void setMsg(String msg) {
        this.mensaje = msg;
    }
    
    
    
}
