/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package domain;

import java.util.Date;

/**
 *
 * @author raulm
 */
public class Cliente extends Persona {
    private int idCliente;
    private Date fechaRegistro;
    private boolean vip;
    private static int contadorCliente;
  
    
    
    public Cliente(Date fechaRegistro, boolean vip, String nombre, char genero, int edad, String direccion){
        super(nombre,genero,edad,direccion); //siempre super tiene que estar en la primera linea en nuestro constructor para llamar a la clase padre. Ctl click para ver en super
        this.vip=vip;
        this.idCliente= ++ Cliente.contadorCliente;//usamos el nombre de la clase Cliente para llamar al atributo ESTATICO contadorCliente;
        this.fechaRegistro=fechaRegistro;
    } 

    public int getIdCliente() {
        return idCliente;
    }


    public Date getFechaRegistro() {
        return fechaRegistro;
    }

    public void setFechaRegistro(Date fechaRegistro) {
        this.fechaRegistro = fechaRegistro;
    }

    public boolean isVip() {
        return vip;
    }

    public void setVip(boolean vip) {
        this.vip = vip;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Cliente{");
        sb.append("idCliente=").append(idCliente);
        sb.append(", fechaRegistro=").append(fechaRegistro);
        sb.append(", vip=").append(vip);
        if(this.vip==true){
       
             sb.append(",").append(super.toString()); //para acceder de manera directa a la clase padre  al metodo toString
        }else{
        
           sb.append(", El Cliente ").append(super.nombre).append(" No es VIP");
        }
       
        sb.append('}');
        return sb.toString();
    }
    
    
}
