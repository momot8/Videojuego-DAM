
public abstract class Entidad {
private String nombre;
private double vida;
private double daño;
private double especial;

public String getNombre() {
    return nombre;
}

/**
 * 
 * @param nombre
 * @param vida
 * @param daño
 * @param especial
 */
public Entidad(String nombre, double vida, double daño, double especial) {
    this.nombre = nombre;
    this.vida = vida;
    this.daño = daño;
    this.especial = especial;
   
}





public Entidad(String nombre) {
   
}

public String getNombre(String nombre){
    return nombre;
}
public void setNombre(String nombre) {
    this.nombre = nombre;
}
public double getVida() {
    return vida;
}
public void setVida(double vida) {
    this.vida = vida;
}
public double getDaño() {
    return daño;
}
public void setDaño(double daño) {
    this.daño = daño;
}
public double getEspecial() {
    return especial;
}
public void setEspecial(double especial) {
    this.especial = especial;
}




@Override
public String toString() {
    return "Entidad [nombre=" + nombre + ", vida=" + vida + ", daño=" + daño + ", especial=" + especial + "]";
}


    
}