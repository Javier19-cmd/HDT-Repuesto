public class vista implements RadioGeneral{
        
        public boolean isOn(){
         //Se usará para ver si el radio está o no encendido y en caso de no estar encendido, le prohíbe al main hacer que funcione el radio.
            return true; 
        }

        public void encender(){
            //Pone al boolean del radio en true. Esto enciende el radio.
        }

        public void apagar(){
            //Pone el boolean del radio como false. Esto apagará por completo al radio.
        }

        public void incrementar(){
            //Avanza la emisora. Esto verifica si la emisora es de am o fm.
        }

        public void disminuir(){
            //Retrocede la emisra También verifica si la emisora es am o fm.
        }

        public void asignar(){
            //Creará una arraylist o array con las emisoras de am y fm.
        }

        public void emisoras(){
            //Enseña la lista de estaciones de radio ya sea que esté en am o fm.
        }

        public void frecuencia(){
            //Cambiar de am a fm o a am.
        }
}
