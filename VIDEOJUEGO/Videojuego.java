import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Videojuego {

    public static void main(String[] args) {
        boolean whileGeneral = true;
       
        final String valkiria = "Brynhildr";
        Scanner reader = new Scanner(System.in);
        // Construccion DIRECTA de los enemigos, son 5 enemigos.
        // Se pueden poner mas pero he decidido solamente poner 5 para que se vea que el
        // juego es escalable a un futuro y se puedan añadir mas enemigos

        Enemigo enemigo1 = new Enemigo("Gustabo la Rana", 6.5, 1, 50);
        Enemigo enemigo2 = new Enemigo("Duo de Arpías", 14, 4.5, 25);
        Enemigo enemigo3 = new Enemigo("Urg el Troll", 26, 8.75, 25);
        // Enemigo 4 sera un test de cultura general sobre la mitologia griega,
        // mitologia en la cual se basa el videojuego
        Adivinanza adivinanza1 = new Adivinanza("", "");
        Adivinanza adivinanza2 = new Adivinanza("", "");
        Adivinanza adivinanza3 = new Adivinanza("", "");
        Adivinanza adivinanza4 = new Adivinanza("", "");
        Adivinanza adivinanza5 = new Adivinanza("", "");
        // El enemigo 5 sera el enemigo final, siendo asi Hades
        Enemigo enemigo5 = new Enemigo("Hades", 40, 12, 80);

        // Empieza el juego. Todo en un while para poder empezar el juego

        while (whileGeneral == true) {

            System.out.println("Buenos dias jugador. Digame, cual es tu nombre?");
            String nombre = reader.next();
            System.out.println("Bienvenido " + nombre);
            System.out.println("Que clase quieres ser?");
            System.out.println("Mago(1)  Caballero(2)  Berserker(3)  Arquero(4)");
            int clase = reader.nextInt();
            // clase entra un primitivo de tipo entero y elige la clase como poner arriba,
            // cada clase equivale a un numero
            Jugador jugador1 = new Jugador(nombre, clase);
            jugador1.setClase(clase);
            jugador1.setNombre(nombre);

            double vidaBase = 10;
            double danobase = 3;
            
            switch (clase) {
                // Mago
                case 1:
                    jugador1.setVida(vidaBase - 2);
                    jugador1.setDaño(danobase * 2);
                    jugador1.setEspecial(0.75);
                    break;
                // Caballero
                case 2:
                    jugador1.setVida(vidaBase + 2);
                    jugador1.setDaño(danobase + 1);
                    jugador1.setEspecial(0.25);
                    break;
                // Berserker
                case 3:
                    jugador1.setVida(vidaBase);
                    jugador1.setDaño(danobase * 2.5);
                    jugador1.setEspecial(0.5);
                    break;
                // Arquero
                case 4:
                    jugador1.setVida(vidaBase - 1);
                    jugador1.setDaño(danobase * 1.5);
                    jugador1.setEspecial(0.90);
                    break;

                default:
                    break;

            }

          //  System.out.println(jugador1.getVida());
            // System.out.println(jugador1.getDaño());
            // System.out.println(jugador1.getDaño());

            System.out.println("Te doy la bienvenida " + jugador1.toString());

            System.out.println("¿En que dificultad quieres jugar?");
            System.out.println("----Opciones Dificultad----");
            System.out.println("");
            System.out.println("1-Facil. Los enemigos te haran menos daño y tendran menos vida");
            System.out.println("");
            System.out.println("2-Normal. Los enemigos no tendran ningun tipo de bonificacion extra");
            System.out.println("");
            System.out.println("3-Dificil. Los enemigos tienen el doble de vida y 1.5 veces su daño");
            System.out.println();
            System.out.println("--------------------------");
            int dificultad = reader.nextInt(); // lee la respuesta a la dificultdad para asi poder tener los diferentes
                                               // casos en el sw
            switch (dificultad) {
                case 1:
                    // Modificador de DAÑO
                    enemigo2.setDaño(enemigo2.getDaño() - 2);
                    enemigo3.setDaño(enemigo2.getDaño() - 2);
                    enemigo5.setDaño(enemigo2.getDaño() - 2);
                    // Modificar de VIDA
                    enemigo2.setVida(enemigo2.getVida() - 2);
                    enemigo3.setVida(enemigo3.getVida() - 5);
                    enemigo5.setVida(enemigo5.getVida() - 7);
                    System.out.println("Has elegido la dificultad Facil");
                    break;
                case 2:
                    System.out.println("Has elegido la dificultdad Normal");
                    break;

                case 3:
                    // Modificador de DAÑO
                    enemigo2.setDaño(enemigo2.getDaño() + 2);
                    enemigo3.setDaño(enemigo2.getDaño() + 2);
                    enemigo5.setDaño(enemigo2.getDaño() + 2);
                    // Modificador de VIDA
                    enemigo2.setVida(enemigo2.getVida() + 2);
                    enemigo3.setVida(enemigo3.getVida() + 5);
                    enemigo5.setVida(enemigo5.getVida() + 7);
                    break;
                default:
                    break;
            }

            // Una vez seleccionada la dificultad, la aventura empieza
            // Rol para dar contexto. nombre es sacado de un getNombre y la valkiria es un
            // final String pues es un nombre que durará todo el juego y no cambia nunca
            String espacio;
            System.out.println("------------------------------");
            System.out.println("Voz desconocida: \nBuenos días " + nombre);
            System.out.println(nombre + ": ¿Quien eres tú?");

            System.out.println(
                    "Voz desconocida: \nSoy una valkiria, mi nombre es Brynhildr y sere tu guia ante este Ragnarok. Los dioses se cansaron de vuestra existencia y quieren exterminaros");
            System.out.println(nombre + ":\n ¿¡Como!? ¿Como que el ragnarok? ¡No quiero morir aún!");
            System.out.println(valkiria
                    + ";\nTranquilo. El Ragnarok siempre se ha dicho que es algo inevitable, pero eso es falso, una persona puede pararlo y todos los eventos indican que eres tú");

                    System.out.println(nombre + ":\n Pe-pero como voy a ser yo. Nunca he peleado y... ¡MENOS CONTRA DIOSES!");
            System.out.println(valkiria
                    + "\n Sé que parece algo imposible pero te enseñare todo lo que debes saber y me fusionaré contigo para que obtengas así la posiblidad de matar a un Inmortal, pues un simple mortal no puede a menos que tenga un arma legendaria o, el poder de un semi-dios o un mismo Dios");

                    System.out.println(nombre + ":\n Q-QUE TU-TU Y-Y YO NO-NOS VAMOS A QUE");
            System.out.println(valkiria
                    + ":\n *se rie* Si, nuestras almas se juntaran, seguiras siendo tu mismo y cuando todo acabe nos separaremos y nada habra pasado");

                    System.out.println(nombre + ":\n Sigo sin entender nada, ¿no puedo no hacerlo?");
            System.out.println(valkiria
                    + ":\n No, solamente puedes tu y si no lo haces la raza humana desaparecera por completo, NADIE quedará con vida, solo aquellos que Budha admitio por haber conseguido llegar a conectar totalmente su alma y mente y hacerlas una");
            System.out.println(nombre + ":\nEntonces no quedará de otra, ¿como nos vamos a fusionar?");

            System.out.println(valkiria + ":\nMuy facil, tan solo ponte este anillo *le da un anillo*");
            System.out.println("*aparecen lineas de luz de la nada y ves como tu cuerpo empieza a brillar y el de "
                    + valkiria + " empieza a desvanezerse*");
            System.out.println("*Escuchas una ultima voz desde la boca de " + valkiria
                    + "* 'Concetrate en tu mente, estaré ahi siempre' ");

                    System.out.println(
                    "*Notas como tu cuerpo se ha hecho mas fuerte. Te sientes mejor que nunca y sientes un cosquilleo por tu cuerpo que acaba en tus manos*");
            String arma = jugador1.getArma();
            espacio = reader.nextLine();
            System.out.println("¡Un " + arma + " ha aparecido entre tus manos!");
            espacio = reader.nextLine();
            System.out.println("*Empiezas a caminar hacia una especie de casa en medio de un pantano...");
            System.out.println("*******************");
            System

            // Empezamos el juego bajo una estrecutura de if1{if2{if3{else3{else2{else1 para que ejecutar el siguiente combate solo si y unicamente si se ha  ganadi la anteior y poder salir del bucle while adecuadamente.
            
            
            // este combate SIEMPRE se ejecuta


            //Todos los combates son iguales, se añaden parametros de entrada para ser usados en Combate --> hacerCombate
            Combate combate = new Combate();
            combate.hacerCombate(jugador1.getNombre(), jugador1.getArma(), enemigo1.getNombre(), jugador1.getVida(),
                    jugador1.getDaño(), jugador1.getEspecial(), enemigo1.getVida(), enemigo1.getDaño(),
                    enemigo1.getEspecial(), false, enemigo1.getNombre()+": Mira a quien tenemos por aqui...\n Con que tu eres mi primer enemigo. No pareces gran cosa, ¡preparate para morir!\n"+enemigo1.getNombre()+": ¿Te crees que será facil? Ven y muere suplicando clemencia");
            boolean combate1 = combate.isPierdeCombate1();
            // Devuelve true o false. Treu si ha perdido, false si ha ganado

            // Empieza c2
            if (combate1 == false) {

                // 'Power-up tras el combate, subiendo stats'
                jugador1.setDaño(jugador1.getDaño() + 1);
                jugador1.setVida(jugador1.getVida() + 1.5);
                System.out.println("Has recibido un 'power-up!!' Has recibido 1.5 puntos de vida y 1 de ataque");

                Combate combate2 = new Combate();
                combate2.hacerCombate(jugador1.getNombre(), jugador1.getArma(), enemigo2.getNombre(),
                        jugador1.getVida(),
                        jugador1.getDaño(), jugador1.getEspecial(), enemigo2.getVida(), enemigo2.getDaño(),
                        enemigo2.getEspecial(), false, "Bienvenido al segundo nivel, somos "+enemigo2.getNombre()+" y nosotras seremos tu siguiente enemigo...");
                boolean c2 = combate2.isPierdeCombate1();
                if (c2 == false) {// empieza c3. Su else es si pierde c2

                    jugador1.setDaño(jugador1.getDaño() + 1.5);
                    jugador1.setVida(jugador1.getVida() + 2);
                    System.out.println("Has recibido un 'power-up!!' Has recibido 2 puntos de vida y 1.5 de ataque");

                    Combate combate3 = new Combate();
                    combate3.hacerCombate(jugador1.getNombre(), jugador1.getArma(), enemigo3.getNombre(), jugador1.getVida(), jugador1.getDaño(), jugador1.getEspecial(), enemigo3.getVida(), enemigo3.getDaño(), enemigo3.getEspecial(), false,enemigo3.getNombre()+": ¿Quien eres tú?\n Hace años que no veia a alguien como tu, como unos... 2000 años desde que aquel enviado de un tal Dios vino a derrotarnos.\n Bueno, como sea, Hades me diho que no dejase pasar a nadie a las puertas que vigila Cancerbero\n"+enemigo3.getNombre()+"* coge su maza y empieza a acercarse a por ti...*");
                    boolean c3 = combate3.isPierdeCombate1();
                    if (c3 == false) {//empieza c4 (preguntas)
                        boolean c4;
                        // Elegimos una pregunta al hace de cada adivinanza
                        adivinanza1.elegirPregunta1();
                        adivinanza2.elegirPregunta2();
                        adivinanza3.elegirPregunta3();
                        adivinanza4.elegirPregunta4();
                        adivinanza5.elegirPregunta5();
                        // Respuestas las cuales se les asignará un valor si las preguntas son falladas
                        // para poder imprimirlas en un fichero
                        String r1 = "";
                        String r2 = "";
                        String r3 = "";
                        String r4 = "";
                        String r5 = "";
                        // Empezamos las repguntas
                        System.out.println(
                                "Bienvenido a las puertas del infiero, esto no será una pelea, sino una prueba de cultura general, deberas responder bien a las siguientes 5 preguntas, basta con que falles una para caer en el pozo infinito del inframundo, asique preparate");
                        System.out.println(
                                "No se te dira cuantas preguntas has fallado. Se te creara un fichero con el numero de preguntas que has fallado y las respuestas a todas las preguntas que se te pusieron");
                        int contadorPreguntas = 0;
                        String limpiador;
                        // Bloque Pregunta 1. Copiar y pegar lo de abajo, sera siempre lo mismo. Cambiar
                        // los nombre claramente de adivinanza y respuesta
                        System.out.println("Pregunta 1: " + adivinanza1.getPregunta());
                        String respuesta1 = reader.next();
                        if (respuesta1.toLowerCase().equals(adivinanza1.getRespuesta())) {
                        } else {
                            r1 = adivinanza1.getRespuesta();
                            contadorPreguntas++;
                        }
                        limpiador = reader.nextLine();
                        // Bloque 2
                        System.out.println("Pregunta 2: " + adivinanza2.getPregunta());
                        String respuesta2 = reader.next();
                        if (respuesta2.toLowerCase().equals(adivinanza2.getRespuesta())) {
                        } else {
                            r2 = adivinanza2.getRespuesta();
                            contadorPreguntas++;
                        }
                        limpiador = reader.nextLine();
                        // Bloque 3
                        System.out.println("Pregunta 3: " + adivinanza3.getPregunta());
                        String respuesta3 = reader.next();
                        if (respuesta3.toLowerCase().equals(adivinanza3.getRespuesta())) {
                        } else {
                            r3 = adivinanza3.getRespuesta();
                            contadorPreguntas++;
                        }
                        limpiador = reader.nextLine();
                        // Bloque 4
                        System.out.println("Pregunta 4: " + adivinanza4.getPregunta());
                        String respuesta4 = reader.next();
                        if (respuesta4.toLowerCase().equals(adivinanza4.getRespuesta())) {
                        } else {
                            r4 = adivinanza4.getRespuesta();
                            contadorPreguntas++;
                        }
                        limpiador = reader.nextLine();
                        // Bloque 5
                        System.out.println("Pregunta 5: " + adivinanza5.getPregunta());
                        String respuesta5 = reader.next();
                        if (respuesta5.toLowerCase().equals(adivinanza5.getRespuesta())) {
                        } else {
                            r5 = adivinanza5.getRespuesta();
                            contadorPreguntas++;
                        }
                        limpiador = reader.nextLine();
                        if (contadorPreguntas >= 1) {
                            System.out.println("Has perdido");
                             c4=true; //true por que ha perdido
                            System.out.println("Creando fichero con las respuestas...");

                            String frase1 = "Preguntas falladas: " + contadorPreguntas;
                            String frase2 = "Respuestas a las preguntas falladas: " + r1 + "\n" + r2 + "\n" + r3 + "\n"
                                    + r4
                                    + "\n"
                                    + r5;
                            String archivo = "FicheroRepuestas.txt";
                            try {
                                FileWriter escritor = new FileWriter(archivo);

                                escritor.write(frase1);
                                escritor.write("\n");
                                escritor.write(frase2);

                                escritor.close();

                                System.out.println("Fichero creado");
                            } catch (IOException e) {
                                System.out.println("No se pudo escribir en el archibo " + e.getMessage());
                            }finally{
                                c4=true; //true por que ha perdido
                            }

                        } else {
                            System.out.println("¡Enhorabuena! Has logrado responder todas las preguntas de Cancerbero.");
                            c4=false;
                        }

                        System.out.println("Has recibido un ultimo 'power-up' y esta vez te ha subido el conocimiento y ahora comprendes mejor como usar tu ataque especial !!");
                        System.out.println("Tambien te han dado mejores pociones!!");
                        jugador1.setDaño(jugador1.getDaño()+2);
                        jugador1.setVida(jugador1.getVida()+3);
                        if(c4==false){//empieza combate final. Su else es "si pierdes preguntas".
                        boolean c5;
                         Combate combate5 = new Combate();
                         combate5.hacerCombate(jugador1.getNombre(), jugador1.getArma(), enemigo5.getNombre(), jugador1.getVida(),
                    jugador1.getDaño(), jugador1.getEspecial(), enemigo5.getVida(), enemigo5.getDaño(),
                    enemigo5.getEspecial(), false, "Tras contestar bien a las preguntas, Cancerbero te ha dejado pasar hacia el inframundo.\nTras dias caminando te encuentras un gran castillo oscuro. Te acercas a el con mucho cuidado...\n"+jugador1.getNombre()+": ¿Quien anda ahi? Eres tú, ¿Hades?\n"+enemigo5.getNombre()+": Si, soy yo...\n Me sorprende que llegases hasta aqui, no me esperaba que nadie pudiese llegar hasta aqui siendo un simple mortal...\nHas conseguido matar a todos mis subditos, eso es algo bastante honorable... Y por eso te concederé este ultimo baile!!\n Empieza el combate ");
                     c5 = combate.isPierdeCombate1();
            // Devuelve true o false. Treu si ha perdido, false si ha ganado
                        
                        if (c5==false) {
                            System.out.println("Has ganado!!!");
                            System.out.println("Escribiendo en un fichero tu puntuacion...");
                            System.out.println("¿Quieres volver a jugar?(y/n)");
                            String respuesta = reader.next();
                            if (respuesta.equals("y")) {
                                System.out.println("Empezando nuevo juego...");
                            }else{
                                System.out.println("Cerrando juego...");
                                whileGeneral=false;
                            }
                            String nombreFichero = "PuntuacionesFinales.txt";
                            try{
                                FileWriter escritor = new FileWriter(nombreFichero, true);

                                escritor.write("Ganadores del juego: ");
                                escritor.write("\nNombre= "+jugador1.getNombre()+" Clase= "+jugador1.getClase() +" Dificultad= "+ dificultad);


                                escritor.close();
                            } catch(IOException e){
                                System.out.println("No se ha podido escribir sobre ese fichero"+ e.getLocalizedMessage());
                            }


                        }else{
                                System.out.println("Has perdido contra el gran Hades...");
                                System.out.println("¿Quieres volver a jugar?");
                            String respuestaa4 = reader.next();
                            if (respuestaa4.toLowerCase().equals("y")) {
                                System.out.println("Empezando otra partida...");
        
                            } else {
                                System.out.println("Cerrando juego");
                                whileGeneral = false;
                            }
                        }


                        }else{//si pierdes preguntas
                            System.out.println("Has perdido. ¿Quieres volver a jugar?");
                        String respuestaa4 = reader.next();
                        if (respuestaa4.toLowerCase().equals("y")) {
                            System.out.println("Empezando otra partida...");
    
                        } else {
                            System.out.println("Cerrando juego");
                            whileGeneral = false;
                        }
                        }

                        

                    }else{//esto pasa si pierdes en c3
                        System.out.println("Has perdido. ¿Quieres volver a jugar?");
                        String respuesta1 = reader.next();
                        if (respuesta1.toLowerCase().equals("y")) {
                            System.out.println("Empezando otra partida...");
    
                        } else {
                            System.out.println("Cerrando juego");
                            whileGeneral = false;
                        }
                    }

                } else {// esto pasa si pierdes en c2
                    System.out.println("Has perdido. ¿Quieres volver a jugar?");
                    String respuesta1 = reader.next();
                    if (respuesta1.toLowerCase().equals("y")) {
                        System.out.println("Empezando otra partida...");

                    } else {
                        System.out.println("Cerrando juego");
                        whileGeneral = false;
                    }
                }

            } else {// pasa esto si se pierde en c1
                System.out.println("Has perdido. ¿Quieres volver a jugar?");
                String respuesta1 = reader.next();
                if (respuesta1.toLowerCase().equals("y")) {
                    System.out.println("Empezando otra partida...");

                } else {
                    System.out.println("Cerrando juego");
                    whileGeneral = false;
                }
            }

        }
        reader.close();
    }
}
