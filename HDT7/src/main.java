

import java.util.Scanner;
import java.util.Vector;

public class main {
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Bienvenidos al programa!\nCodifiquemos un mensaje!");
        System.out.print("Por favor ingrese el mensaje a codificar: ");
        String mensaje = input.nextLine();
        Codificacion code = new Codificacion(mensaje);
        code.Separar();
        code.Construir();

        code.Cdatos(code.getQueue().elementAt(0));
        System.out.println("Caracter  |  Frecuencia  |  Codigo");

        for (int i=1;i<code.getQueue().size();i++){
            System.out.println("   "+code.getQueue().elementAt(i).getCharacter()+"              "+ code.getQueue().elementAt(i).getFrec()+"           "+ code.getQueue().elementAt(i).getCode());}

        String codigo = "";
        String decoded = "";
        int error=0;
        Tree dec=code.getQueue().elementAt(0);
        
        while(!codigo.equalsIgnoreCase("exit")){
            dec = code.getQueue().elementAt(0);
            codigo = "";
            decoded = "";
            System.out.println("\nSi desea ahora convertir un codigo a caracteres, ingrese el codigo (Exit para la salir): ");
            codigo=input.nextLine();

            if (codigo.equalsIgnoreCase("exit")){
                System.out.println("\n\tQue tenga un buen dia...");
            }
            
            else{
                for(int i=0;i<codigo.length();i++){
                    if (dec.getIzquierda()!=null && dec.getDerecha()!=null){
                        if (codigo.charAt(i)=='0'){
                             dec=dec.getIzquierda();
                        }
                        else {                 
                            dec=dec.getDerecha();
                        }
                    }

                    if(dec.getIzquierda()==null && dec.getDerecha()==null && dec.getCharacter()!=' ') {
                        decoded = decoded+Character.toString(dec.getCharacter());
                        dec = code.getQueue().elementAt(0);
                    }
                }
                
                if (dec!=code.getQueue().elementAt(0) && !codigo.equalsIgnoreCase("end")){
                    System.out.println("[Error]  El codigo ingresado no corresponde con el arbol! Revise su codigo.");
                }
                else if (!codigo.equalsIgnoreCase("end")){
                    System.out.println("Mensaje Producido: "+decoded);
                }

            }
            }
            
        }
}
