//María Fernanda Argueta 20458
//Javier Valle 20159

import java.util.*;

public class main {
    
    public static void main(String[] args){
        
        int elecc; //Variable para que el usuario elija la opción que desea.
        int elecc2; //Variable para que el usuario elija la opción que desea.
        Scanner elec = new Scanner(System.in); //Variable asignada para el Scanner.
        vista vis = new vista(); 
        elecc = 7;

        int posicion; //Variable para almacenar el botón en el que se desea guardar la emisora.
       
        

        while(elecc != 0){ //While para el que el usuario elija una opción.
            
            vis.menu(); //Imprimiendo el menú que se le presentará al usuario.
            System.out.println("Elija una opción.");
            elecc = elec.nextInt(); //Ingresando una opción.
    
            switch(elecc){
                
                case 1: //Encender el radio.
                if(vis.isOn()== false ){//Verificar si el radio está o no encendido.
                    vis.encender(); //Encendiendo el radio en caso de que no lo esté.
                }else{
                    System.out.println("La radio ya estaba encendida.");
                }
                
                break; //Terminando la opción 1. 

                

                case 2: //Cambiar la frecuencia del redio. De AM a FM y a AM (otra vez) 
                if(vis.isOn()== false){
                    System.out.println("La radio está apagada, no se puede realizar una acción todavía.");
                }else if(vis.isOn()== true){
                    vis.frecuencia(); //Llamando al método que se hará cargo de cambiar la frecuencia.
                }
                break; //Terminando la opción 2.

                case 3: //Avanzar entre las emisoras. Si en caso se llega al final del ArrayList, se debe poder volver a iniciar con el cambio entre emisoras.
                //También se debería poder retroceder.
                if(vis.isOn()== false){
                    System.out.println("La radio está apagada, no se puede realizar una acción todavía.");
                }else if(vis.isOn()== true){
                    System.out.println("Elija una opción.");
                    System.out.println("1. Incrementar emisora");
                    System.out.println("2. Disminuir emisora");
                    System.out.println("3. Regresar");
                    elecc2 = elec.nextInt(); //Ingresando una opción.
                    while(elecc != 3){ //While para el que el usuario elija una opción.
                        switch(elecc2){
                            case 1: //Incrementar emisora
                            vis.incrementar(); //Avanzar entre las emisoras.
                            break; //Terminando la opción 1. 
                            case 2: //Disminuir emisora
                            vis.disminuir(); //Retroceder entre las emisoras.
                            break; //Terminando la opción 2.
                            
                        }
                         
                    }
                    
                }

                
                
                break; //Terminando la opción 3.

                case 4: //Guardar emisora en uno de los botones.
                
                if(vis.isOn()== false){
                    System.out.println("La radio está apagada, no se puede realizar una acción todavía");
                }else if(vis.isOn()== true){ //Si el radio está encendido
                    
                    try { //Progra defensiva.

                        System.out.println("¿A qué botón lo desea asignar? (Debe elegir una opción numérica entre 1 y 12)");
                        posicion = elec.nextInt();
                        vis.asignar(posicion); //Método para asignar emisoras a botones entre 1 y 12.
                    
                    } catch (Exception e) { //No ingresó un número.
                        
                        System.out.println("Ha ingresado una opción no numérica, favor ingresar una opción correcta.");
                        elec.nextInt(); //Ingresando nuevamente la opción.
                    }
                }                 

                break; //Terminando la opción 4.
                
                case 5: 
                if(vis.isOn()== false){
                    System.out.println("La radio está apagada, no se puede realizar una acción todavía");
                }else if(vis.isOn()== true){
                    System.out.println("Ingrese el número de botón de emisora que desea escuchar");
                    int num = elec.nextInt(); //Ingresando una opción.   
                    if(num!= 0 && num<12){
                       vis.emisoras(num);
                        
                    }else{
                        System.out.println("Ha ingresado un número incorrecto"); 
                    }
                    
                }
               
                break; //Terminando la opción 5.

                default: //Apagar el radio.

                System.out.println("Radio apagado.");
                
                break; //Terminando el default.s

            }

        }
    }
 }   
 