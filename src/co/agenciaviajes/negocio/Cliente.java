package co.agenciaviajes.negocio;

import java.util.Date;

/**
 * Representa un cliente de la Agencia de viajes
 *
 * @author Libardo Pantoja, Ricardo Zambrano, Julio A. Hurtado
 */
public class Cliente {

    private String id;
    private String nombres;
    private String apellidos;
    private String genero;
    private String email;
    private Date fechaNac;

    // Completar constructor
    public Cliente(String id, String nombres, String apellidos, String genero, String email, Date fechaNac) {
        this.id = id;
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.genero = genero;
        this.email = email;
        this.fechaNac = fechaNac;
    }

    //Completar getters and setters
    public String getId() {
        return id;
    }

    public String getNombres() {
        return nombres;
    }

    public String getApellidos() {
        return apellidos;
    }

    public String getGenero() {
        return genero;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getEmail() {
        return email;
    }

    public Date getFechaNac() {
        return fechaNac;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setFechaNac(Date fechaNac) {
        this.fechaNac = fechaNac;
    }

    @Override
    public String toString() {
        return "Id: " + id + " Nombres: " + nombres + " Apellidos: " + apellidos;
    }

}
