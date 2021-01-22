//María Fernanda Argueta 20458
//Javier Valle 20159

import java.util.*; //Importando todas las clases de java.  



public class vista implements Radio{
    
    boolean isOn = false; //la radio siempre inicia apagada
    int frecuencia = 1; // 1 == AM  2== FM  tiene am de default  cuando se enciende la radio
    int estam = 530;
    double estfm = 107.9;
    int[] saved  = {};
    
    ArrayList Am = new ArrayList(); //Emisoras de la frecuencia am.
    ArrayList Fm = new ArrayList(); //Emisoras de la frecuencia fm.
        

    int boton; //Botón para las emisoras de radio.
    
    Scanner elec = new Scanner(System.in);

        public static void menu(){//Menú de opciones para el usuario..

            //Impresión del menú para el usuario
            System.out.println("Bienvenido al radio de su computadora.");
            System.out.println("1. Encender el radio.");
            System.out.println("2. Cambiar la frecuencia.");
            System.out.println("3. Cambiar de emisora.");
            System.out.println("4. Guardar emisora de radio.");
            System.out.println("5. Seleccionar emisora.");
            System.out.println("6. Apagar el radio.");
            System.out.println("0. Salir.");

        }
        public void imprime(int num){
            //se imprime lo necesario según se indica por los otros métodos
            if(num == 1){
                System.out.println("Cambiando de estación en AM... Estación actual: "+estam); 
            }else if(num == 2){
                System.out.println("Cambiando de estación en FM... Estación actual: "+estfm);
            }else if(num == 3){
                System.out.println("Encendiendo la radio");
            }else if(num == 4){
                System.out.println("Apagando la radio");
            }
            
        }
        public boolean isOn(){
         //Se usará para ver si el radio está o no encendido y en caso de no estar encendido, le prohíbe al main hacer que funcione el radio.
         //Se asignan valores a los arrays de las emisoras 
         Am.add(1);
         Am.add(1);
         Am.add(1);
         Am.add(1);
         Am.add(1);
         Am.add(1);
         Am.add(1);
         Am.add(1);
         Am.add(1);
         Am.add(1);
         Am.add(1);
         Am.add(1);
         Am.add(1);
         
         Fm.add(1);
         Fm.add(1);
         Fm.add(1);
         Fm.add(1);
         Fm.add(1);
         Fm.add(1);
         Fm.add(1);
         Fm.add(1);
         Fm.add(1);
         Fm.add(1);
         Fm.add(1);
         Fm.add(1);
         Fm.add(1);
            
            return isOn;
             
        }

        public void encender(){
            //Pone al boolean del radio en true. Esto enciende el radio.
            isOn = true;
            imprime(3);
        }

        public void apagar(){
            //Pone el boolean del radio como false. Esto apagará por completo al radio.
            isOn = false;
        }

        public void incrementar(){
            //Avanza la emisora. Esto verifica si la emisora es de am o fm.
            if(frecuencia == 1){ //se cambia la estación en am
                if(estam == 1610){ //este es el valor máximo que puede llegar a tener las estaciones de am
                    estam = 530;
                    imprime(1);
                    
                }else{
                    estam = estam + 10; 
                    imprime(1);
                }
                
            }else if(frecuencia == 2){ //cambiar la estación en fm
                if(estfm == 107.9){ //este es el valor máximo que puede llegar a tener las estaciones de fm
                    estfm = 87.9;
                    imprime(2);
                }else{
                    estfm = estfm + 0.2; 
                    imprime(2);
                }
                
            }
            
        }

        public void disminuir(){
            //Retrocede la emisra También verifica si la emisora es am o fm.
            if(frecuencia == 1){ //se cambia la estación en am
                if(estam == 530){ //este es el valor máximo que puede llegar a tener las estaciones de am
                    estam = 1610;
                }else{
                    estam = estam - 10; 
                }
                
            }else if(frecuencia == 2){ //cambiar la estación en fm
                if(estfm == 87.9){ //este es el valor máximo que puede llegar a tener las estaciones de fm
                    estfm = 107.9;
                }else{
                    estfm = estfm - 0.2; 
                }
                
            }
        }

        public void asignar(int posicion){
            //Creará una arraylist o array con las emisoras de am y fm.
            
                    
                    //posicion = elec.nextInt();

                    //Switch para ver en qué botón lo desea meter.
                    switch(posicion){
                        
                        case 1: //Botón 1.
                        System.out.println("Emisora asignada al botón 1.");
                            
                            //Añadiendo la emisora en el botón 1. Si la frecuencia es 1, entonces la estación se guarda en el ArrayList de la AM.
                            //                                    Si la frecuencia es 2, entonces la estación se guarda en el ArrayList de la FM. 
                            if(frecuencia == 1){
                                Am.set(posicion, estam);
                            }else {
                                Fm.set(posicion, estfm);
                            }

                            break; //Terminando la opción 1.
                        
                        case 2: //Botón 2.
                            
                            System.out.println("Emisora asignada al botón 2.");
                             
                            //Añadiendo la emisora en el botón 1. Si la frecuencia es 1, entonces la estación se guarda en el ArrayList de la AM.
                            //                                    Si la frecuencia es 2, entonces la estación se guarda en el ArrayList de la FM. 
                            if(frecuencia == 1){
                                Am.set(posicion, estam); //Añadiendo la emisora am que se desea guardar en el ArrayList Am.
                            }else {
                               Fm.set(posicion, estfm); //Añadiendo la emisora am que se desea guardar en el ArrayList Fm.
                            }

                            break; //Terminando la opción 2.
                            
                        case 3: //Botón 3.
                            
                        System.out.println("Emisora asignada al botón 3.");
                            //Añadiendo la emisora en el botón 1. Si la frecuencia es 1, entonces la estación se guarda en el ArrayList de la AM.
                            //                                    Si la frecuencia es 2, entonces la estación se guarda en el ArrayList de la FM. 
                            if(frecuencia == 1){
                                Am.set(posicion, estam); //Añadiendo la emisora am que se desea guardar en el ArrayList Am.
                            }else {
                                Fm.set(posicion, estfm); //Añadiendo la emisora am que se desea guardar en el ArrayList Fm.
                            }
                            
                            break; //Terminando la opción 3.
                        
                        case 4: //Botón 4.

                        System.out.println("Emisora asignada al botón 4.");
                            //Añadiendo la emisora en el botón 1. Si la frecuencia es 1, entonces la estación se guarda en el ArrayList de la AM.
                            //                                    Si la frecuencia es 2, entonces la estación se guarda en el ArrayList de la FM. 
                            if(frecuencia == 1){
                                Am.set(posicion, estam); //Añadiendo la emisora am que se desea guardar en el ArrayList Am.
                            }else {
                                Fm.set(posicion, estfm); //Añadiendo la emisora am que se desea guardar en el ArrayList Fm.
                            }
                            break; //Terminando la opción 4.
                        
                        case 5: //Botón 5.
                            
                            System.out.println("Emisora asignada al botón 5.");
                            //Añadiendo la emisora en el botón 1. Si la frecuencia es 1, entonces la estación se guarda en el ArrayList de la AM.
                            //                                    Si la frecuencia es 2, entonces la estación se guarda en el ArrayList de la FM. 
                            if(frecuencia == 1){
                                Am.set(posicion, estam); //Añadiendo la emisora am que se desea guardar en el ArrayList Am.
                            }else {
                                Fm.set(posicion, estfm); //Añadiendo la emisora am que se desea guardar en el ArrayList Fm.
                            }
                            break; //Terminando la opción 5.
                        
                        case 6: //Botón 6.
                            
                            System.out.println("Emisora asignada al botón 6.");
                            //Añadiendo la emisora en el botón 1. Si la frecuencia es 1, entonces la estación se guarda en el ArrayList de la AM.
                            //                                    Si la frecuencia es 2, entonces la estación se guarda en el ArrayList de la FM. 
                            if(frecuencia == 1){
                                Am.set(posicion, estam); //Añadiendo la emisora am que se desea guardar en el ArrayList Am.
                            }else {
                                Fm.set(posicion, estfm); //Añadiendo la emisora am que se desea guardar en el ArrayList Fm.
                            }
                            
                            break; //Terminando la opción 6.
                        
                        case 7: //Botón 7.
                            
                            System.out.println("Emisora asignada al botón 7.");
                            //Añadiendo la emisora en el botón 1. Si la frecuencia es 1, entonces la estación se guarda en el ArrayList de la AM.
                            //                                    Si la frecuencia es 2, entonces la estación se guarda en el ArrayList de la FM. 
                            if(frecuencia == 1){
                                Am.set(posicion, estam); //Añadiendo la emisora am que se desea guardar en el ArrayList Am.
                            }else {
                                Fm.set(posicion, estfm); //Añadiendo la emisora am que se desea guardar en el ArrayList Fm.
                            }

                            break; //Terminando la opción 7.
                        
                        case 8: //Botón 8.

                            System.out.println("Emisora asignada al botón 8.");
                            //Añadiendo la emisora en el botón 1. Si la frecuencia es 1, entonces la estación se guarda en el ArrayList de la AM.
                            //                                    Si la frecuencia es 2, entonces la estación se guarda en el ArrayList de la FM. 
                            if(frecuencia == 1){
                                Am.set(posicion, estam);  //Añadiendo la emisora am que se desea guardar en el ArrayList Am.
                            }else {
                                Fm.set(posicion, estfm); //Añadiendo la emisora am que se desea guardar en el ArrayList Fm.
                            }
                            break; //Terminando la opción 8.
                        
                        case 9: //Botón 9.

                            System.out.println("Emisora asignada al botón 9.");
                            //Añadiendo la emisora en el botón 1. Si la frecuencia es 1, entonces la estación se guarda en el ArrayList de la AM.
                            //                                    Si la frecuencia es 2, entonces la estación se guarda en el ArrayList de la FM. 
                            if(frecuencia == 1){
                                Am.set(posicion, estam); //Añadiendo la emisora am que se desea guardar en el ArrayList Am.
                            }else {
                                Fm.set(posicion, estfm); //Añadiendo la emisora am que se desea guardar en el ArrayList Fm.
                            }
                            break; //Terminando la opción 9.
                        
                        case 10://Botón 10.
                            
                            System.out.print("Emisora asignada al botón 10");
                            //Añadiendo la emisora en el botón 1. Si la frecuencia es 1, entonces la estación se guarda en el ArrayList de la AM.
                            //                                    Si la frecuencia es 2, entonces la estación se guarda en el ArrayList de la FM. 
                            if(frecuencia == 1){
                                Am.set(posicion, estam); //Añadiendo la emisora am que se desea guardar en el ArrayList Am.
                            }else {
                                Fm.set(posicion, estfm); //Añadiendo la emisora am que se desea guardar en el ArrayList Fm.
                            }
                            break; //Terminando la opción 10.
                        
                        case 11://Botón 11.
                            
                            System.out.println("Emisora asignada al botón 11.");
                            //Añadiendo la emisora en el botón 1. Si la frecuencia es 1, entonces la estación se guarda en el ArrayList de la AM.
                            //                                    Si la frecuencia es 2, entonces la estación se guarda en el ArrayList de la FM. 
                            if(frecuencia == 1){
                                Am.set(posicion, estam); //Añadiendo la emisora am que se desea guardar en el ArrayList Am.
                            }else {
                                Fm.set(posicion, estfm); //Añadiendo la emisora am que se desea guardar en el ArrayList Fm.
                            }
                            break; //Terminando la opción 11.
                        
                        case 12://Botón 12.
                            
                            System.out.println("Emisora asignada al botón 12.");
                            //Añadiendo la emisora en el botón 1. Si la frecuencia es 1, entonces la estación se guarda en el ArrayList de la AM.
                            //                                    Si la frecuencia es 2, entonces la estación se guarda en el ArrayList de la FM. 
                            if(frecuencia == 1){
                                Am.set(posicion, estam); //Añadiendo la emisora am que se desea guardar en el ArrayList Am.
                            }else {
                                Fm.set(posicion, estfm); //Añadiendo la emisora am que se desea guardar en el ArrayList Fm.
                            }
                            break; //Terminando la opción 12.
                        
                        default: 
                        System.out.println("Ha elegido una opción no válida.");
                        break; //Terminando la opción default. 
                    }
                
        }

        public void emisoras(int posicion){
            //Enseña la lista de estaciones de radio ya sea que esté en am o fm.
            if(frecuencia == 1){
                if(Am.get(posicion).equals(1)){
                
                    System.out.println("No hay ninguna emisora AM guardada en el botón: "+posicion);
                
                }else{
                    System.out.println("La estación actual es: "+ estam);
                }
            }else if(frecuencia == 2){

                if(Fm.get(posicion).equals(1)){

                    System.out.println("No hay ninguna emisora FM guardada en el botón: "+posicion);
                
                }else{
                    System.out.println("La estación actual es: "+ estfm);
                }
            }
        
        }

        public void frecuencia(){
            //Cambiar de am a fm o a am.
            if(frecuencia == 1){
                frecuencia= 2; //se traslada de am a fm
                System.out.println("Cambiando de frecuencia. Frecuencia actual: FM");
            }else if(frecuencia == 2){
                frecuencia = 1; //se traslada de fm a am
                System.out.println("Cambiando de frecuencia. Frecuencia actual: AM");
            }
        }
    
}