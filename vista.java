import java.util.*; //Importando todas las clases de java.  


public class vista implements RadioGeneral{
    
    boolean isOn = false; //la radio siempre inicia apagada
    int frecuencia = 1; // 1 == AM  2== FM  tiene am de default  cuando se enciende la radio
    int estam = 0;
    int estfm = 0;
    
    

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
        
        public boolean isOn(){
         //Se usará para ver si el radio está o no encendido y en caso de no estar encendido, le prohíbe al main hacer que funcione el radio.
            return isOn; 
        }

        public void encender(){
            //Pone al boolean del radio en true. Esto enciende el radio.
            isOn = true;
            
        }

        public void apagar(){
            //Pone el boolean del radio como false. Esto apagará por completo al radio.
            isOn = false;
        }

        public void incrementar(){
            //Avanza la emisora. Esto verifica si la emisora es de am o fm.
            if(frecuencia == 1){ //se cambia la estación en am
                estam = estam + 1;

            }else if(frecuencia == 2){ //cambiar la estación en fm
                estfm = estfm + 1;
            }
            
        }

        public void disminuir(){
            //Retrocede la emisra También verifica si la emisora es am o fm.
            if(frecuencia == 1){ //se cambia la estación en am
                estam = estam - 1;

            }else if(frecuencia == 2){ //cambiar la estación en fm
                estfm = estfm - 1;
            }
        }

        public void asignar(){
            //Creará una arraylist o array con las emisoras de am y fm.
        }

        public void emisoras(){
            //Enseña la lista de estaciones de radio ya sea que esté en am o fm.
            
            ArrayList Am = new ArrayList(); //Emisoras de la frecuencia am.
            ArrayList Fm = new ArrayList(); //Emisoras de la frecuencia fm.
        
        }

        public void frecuencia(){
            //Cambiar de am a fm o a am.
            if(frecuencia == 1){
                frecuencia= 2; //se traslada de am a fm
            }else if(frecuencia == 2){
                frecuencia = 1; //se traslada de fm a am
            }
        }
}
