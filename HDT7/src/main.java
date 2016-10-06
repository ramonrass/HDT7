/*
UVG
HDT 7
Ramon Samayoa
Jorge Mario Lara
Miercoles 5 de Cotubre de 2016
*/


import java.util.Scanner;
import java.util.Vector;

public class main {
    
    public static void main(String[] args) {
        //Se crea el scanner para poder recibir las entradas del usuario
        Scanner input = new Scanner(System.in);
        System.out.println("Bienvenidos al programa!\nCodifiquemos un mensaje!");
        System.out.print("\nPor favor ingrese el mensaje a codificar: ");
        String mensaje = input.nextLine();

        
        //-------------------------------------------CODIFICACION-----------------------------------------
        //Crea un nuevo objeto de Codificacion (HUFFMAN)
        Codificacion code = new Codificacion(mensaje);
        //Separa y organiza cada caracter del mensaje ingresado
        code.Separar();
        //Se crea el arbol con Priority Queue
        code.Construir();
        //Consigue cada uno de los elementos de el arbol creado
        code.Data(code.getQueue().elementAt(0));
        System.out.println("Caracter  |  Frecuencia  |  Codigo");

        //Imprime la tabla con todos los valores que tiene el arbol, su frecuencia y su respectivo codigo
        for (int i=1;i<code.getQueue().size();i++){
            System.out.println("   "+code.getQueue().elementAt(i).getCharacter()+"              "+ code.getQueue().elementAt(i).getFrec()+"           "+ code.getQueue().elementAt(i).getCode());
        }
        
        
        
        //-----------------------------------------DECODIFICACION----------------------------------------
        String codigo = "";
        String decoded = "";
        Tree dec=code.getQueue().elementAt(0);
        
        while(!codigo.equalsIgnoreCase("exit")){
            dec = code.getQueue().elementAt(0);
            codigo = "";
            decoded = "";
            System.out.println("\nIngrese un codigo a Decodificar (EXIT para terminar): ");
            codigo=input.nextLine();

            if (codigo.equalsIgnoreCase("exit")){
                System.out.println("\n\tQue tenga un buen dia...");
            }
            
            
            //Este atraviesa el arbol con el codigo para conseguir el caracter al que llega.
            else{
                for(int i=0;i<codigo.length();i++){
                    if (dec.getIzquierda()!=null && dec.getDerecha()!=null){
                        //Si es 0, se mueve a la izquierda
                        if (codigo.charAt(i)=='0'){
                             dec=dec.getIzquierda();
                        }
                        //Si es 1, se mueve a la derecha
                        else {
                            dec=dec.getDerecha();
                        }
                    }
                    //Obtiene el ultimo Nodo que pueda tener el arbol
                    if(dec.getIzquierda()==null && dec.getDerecha()==null && dec.getCharacter()!=' ') {
                        decoded = decoded+Character.toString(dec.getCharacter());
                        dec = code.getQueue().elementAt(0);
                    }
                }
                //Se muestra un error cuando no se encuentra un codigo,ya que no existe
                if (dec!=code.getQueue().elementAt(0) && !codigo.equalsIgnoreCase("exit")){
                    System.out.println("[Error]  El codigo ingresado no corresponde con el arbol! Revise su codigo.");
                }
                else if (!codigo.equalsIgnoreCase("exit")){
                    System.out.println("Mensaje Producido: "+decoded);
                }
            }
        }
    }
}
