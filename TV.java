/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package MisClases;

/**
 *
 * @author eduar
 */
public class TV {
    private int canal;
    private int volumen;
    private boolean power;
    
    public int getCanal(){
        return canal;
    }
    public void setCanal(int valor){
        canal = valor;
    }
    public int getVolumen(){
        return volumen;
    }
    public void setVolumen(int valor){
        volumen = valor;
    }
    public boolean power(){
        return power;
    }
    public void setPower(boolean valor){
        power = valor;
    }
    public void imprimirDatos(){
    System.out.println("El canal es: "+canal);
    System.out.println("El volumen es:"+volumen);
    System.out.println("ENCENDIDO/APAGADO:"+power);
    }
}
