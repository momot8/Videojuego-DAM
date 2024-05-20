public class Jugador extends Entidad {

    private int clase;
    private String arma;

    private String nombreJugador = super.getNombre();
    private double vidaJugador = super.getVida();
    private double dañoJugador = super.getDaño();
    private double especialJugador = super.getEspecial();
    

    /**
     * 
     * @param nombre
     * @param clase
     */
    public Jugador(String nombre, int clase){
        super(nombre);
        this.nombreJugador = nombre;
         this.vidaJugador=10;
        this.dañoJugador=3;
        this.especialJugador=0;       

    }


    public String getClase() {
        if(clase==1){
            return "Mago";
        }else if(clase==2){
            return "Caballero";
        }else if(clase==3){
            return "Berserker";
        }else if(clase==4){
            return "Arquero";   
        }else{
            return "No valido";
        }
    }



    public void setClase(int clase) {
        this.clase = clase;
    }

    public String getArma() {
        if(clase==1){
            return "Vara blanca";
        }else if(clase==2){
            return "Mandoble";
        }else if(clase==3){
            return "Hacha Nórdica";
        }else if(clase==4){
            return "Arco élfico";   
        }else{
            return "No valido";
        }
    }


    
    String clasefinal;
    @Override
    public String toString() {
//se parte de 10 de vida , 3 de daño y 0 especial
        switch (clase) {
            //mago
            case 1:
            vidaJugador = vidaJugador-2;
            dañoJugador = dañoJugador*2;
            especialJugador = 0.75;
            nombreJugador = nombreJugador.concat(" el Gris");
                break;
            //Caballero
            case 2:
            vidaJugador=vidaJugador+2;
            dañoJugador = dañoJugador+1;
            especialJugador = 0.25;
            nombreJugador = "Caballero "+nombreJugador;
                break;
            //Berserker
            case 3:
            
            dañoJugador=dañoJugador*2.5;
            especialJugador = 0.5;
            nombreJugador = nombreJugador.concat(" el Barbaro");
                break;
            //arquero
            case 4:
            vidaJugador=vidaJugador-1;
            dañoJugador = dañoJugador*1.5;
            especialJugador = 0.90;
            nombreJugador = nombreJugador.concat(" el Preciso");
                break;
            default:
           

                break;
        }







        if(clase==1){
            clasefinal = "Mago";
        }else if(clase==2){
            clasefinal = "Caballero";
        }else if(clase==3){
            clasefinal = "Berserker";
        }else if(clase==4){
            clasefinal = "Arquero";
              
        }else{
            clasefinal="Humano";
        }

        
        //return "Nombre: "+nombreJugador + " Clase: "+ clasefinal + " Vida: "+vidaJugador+ " Daño: "+dañoJugador + " Especial: "+especialJugador;
        return nombreJugador +". Eres un: "+clasefinal+" Tu arma es: "+getArma()+"\nTus stats son las siguientes: \n-Vida: "+vidaJugador+"\n-Daño: "+dañoJugador  ;
    }
}
