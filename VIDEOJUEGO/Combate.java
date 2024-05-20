import java.util.Random;
import java.util.Scanner;
public class Combate {

    


    private boolean pierdeCombate1;
    //Metodo constructor vacio, solo queremos crear el combate y agregarle la accion  .hacerCombate
    public Combate(){

    }
    
//hacerCombate es una funcion la cual recoge todos los valores marcados para usarlos dentro
    public void hacerCombate(String jugador, String arma, String enemigo, double vidaJugador, double danoJugador, double especialJugador, double vidaEnemigo, double danoEnemigo, double especialEnemigo, boolean lose, String fraseIntro ){
       //Declaracion de métodos utiles
        Scanner reader = new Scanner(System.in);
        Random random = new Random();
//frase unica por personaje, se pone desde el main en la declaracion de hacerCombate("aqui")
        System.out.println(fraseIntro);
       
        //Combate:
        boolean seguirCombate = true;
        //Menu de opciones 
        while(seguirCombate) {
            System.out.println("Vida "+jugador+" "+vidaJugador+ "                    Vida Enemigo: "+vidaEnemigo);
            System.out.println("Opciones de Combate");
            System.out.println("1) Atacar con tu arma");
            System.out.println("2) Usar tu bolsa de objetos");
            System.out.println("3)Usar tu ataque especial (Tus posiblidades ahora mismo son del: "+ especialJugador+")");
            System.out.println("---------------------------------------------------------------------------------------");
            int opciones = reader.nextInt();

            switch (opciones) {
                //Case 1 Terminado
                case 1:
                    System.out.println("Has decidido atacar con tu arma.");
                    System.out.println("Has logrado hacer: "+danoJugador+" puntos de daño");
                    vidaEnemigo = vidaEnemigo-danoJugador;
                    System.out.println("Ahora tu enemigo tiene: "+vidaEnemigo+" puntos de salud");
                    break;
                case 2:

                if (vidaJugador>10) {
                    System.out.println("Menu de objetos: ");
                    System.out.println("1) Pocion de vida (+2 vida)");
                    System.out.println("2) Pocion de ataque(x1.5 de atk)");
                    System.out.println("Pulsa cualquier otro numero para salir");
                    int opcionesObj = reader.nextInt();
                    switch (opcionesObj) {
                        case 1:
                            System.out.println("Has usado una pocion de vida!");
                            vidaJugador = vidaJugador+2;
                            break;
                        case 2: 
                            System.out.println("Has usado una pocion de ataque!");
                            danoJugador = danoJugador*1.5;
                            break;
                        default:
                        System.out.println("Has abierto tu bolsa para nada. El enemigo aprovcehara para atacarte...");
                            break;
                    }
                }else{
                    System.out.println("No tienes nada en tu bolsa aún");
                }

                    break;
                case 3:
                    System.out.println("Has decidido atacar con tu ataque especial");
               
                    int esp = random.nextInt(6);
                    if (esp==1) {
                        System.out.println("Le has hecho 100 de daño a "+enemigo);
                        vidaEnemigo = -1;
                    }else{
                        System.out.println("Has fallado tu ataque especial");
                    }
                    break;
                default:
                    break;
            }
            int posiblidad = random.nextInt(10);
            if (posiblidad==1) { danoEnemigo=100; }
                
            
            
            System.out.println("El enemigo te ha atacado y te he hecho "+danoEnemigo+" puntos de daño");
            vidaJugador = vidaJugador - danoEnemigo;
            System.out.println("Tu vida actual es : "+ vidaJugador);

            if (vidaEnemigo<=0) {
                seguirCombate=false;
            }else if(vidaJugador<=0){
                seguirCombate=false;     
            }

          

        } 


        if (vidaEnemigo<0) {
            System.out.println("*Has logrado matar a "+enemigo+". ¡Felicidades! *");
        }else if(vidaJugador<0){
                System.out.println("¡Has perdido!");
               pierdeCombate1 = true;
                
        }
       

        reader.close();
    }


    public boolean isPierdeCombate1() {
        return pierdeCombate1;
    }


    public void setPierdeCombate1(boolean pierdeCombate1) {
        this.pierdeCombate1 = pierdeCombate1;
    }
}