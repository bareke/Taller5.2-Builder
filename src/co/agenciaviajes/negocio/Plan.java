package co.agenciaviajes.negocio;

import java.util.Arrays;
import java.util.Date;

/**
 *
 * @author Libardo Pantoja, Julio Hurtado, Ricardo Zambrano
 */
public class Plan {

    private Cliente cliente;
    private Date fechaSalida;
    private Date fechaLlegada;
    private String transporte;
    private String alojamiento;
    private String alimentacion;
    private boolean seguroHotelero;
    private boolean impuestoTiqute;
    private String[] tours;
    private int totalAdultos;
    private int totalNinos;
    /**
     * Valor total a pagar
     */
    private int valor;

    // Completar constructor
    public Plan() {

    }

    // Completar métodos
    /**
     * Incrementa o suma el valor actual del plan
     *
     * @param incremento incremento a sumar
     */
    public void sumarValor(int incremento) {
        this.valor += incremento;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public Date getFechaSalida() {
        return fechaSalida;
    }

    public Date getFechaLlegada() {
        return fechaLlegada;
    }

    public String getTransporte() {
        return transporte;
    }

    public String getAlojamiento() {
        return alojamiento;
    }

    public String getAlimentacion() {
        return alimentacion;
    }
    
    public boolean getImpuestoTiqute() {
        return impuestoTiqute;
    }
    
    public boolean getSeguroHotelero() {
        return seguroHotelero;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public void setFechaSalida(Date fechaSalida) {
        this.fechaSalida = fechaSalida;
    }

    public void setFechaLlegada(Date fechaLlegada) {
        this.fechaLlegada = fechaLlegada;
    }

    public void setTransporte(String transporte) {
        this.transporte = transporte;
    }

    public void setAlojamiento(String alojamiento) {
        this.alojamiento = alojamiento;
    }

    public void setAlimentacion(String alimentacion) {
        this.alimentacion = alimentacion;
    }

    public boolean isSeguroHotelero() {
        return seguroHotelero;
    }

    public void setSeguroHotelero(boolean seguroHotelero) {
        this.seguroHotelero = seguroHotelero;
    }

    public boolean isImpuestoTiqute() {
        return impuestoTiqute;
    }

    public void setImpuestoTiqute(boolean impuestoTiqute) {
        this.impuestoTiqute = impuestoTiqute;
    }

    public String[] getTours() {
        return tours;
    }

    public void setTours(String[] tours) {
        this.tours = tours;
    }

    public int getTotalAdultos() {
        return totalAdultos;
    }

    public void setTotalAdultos(int totalAdultos) {
        this.totalAdultos = totalAdultos;
    }

    public int getTotalNinos() {
        return totalNinos;
    }

    public void setTotalNinos(int totalNinos) {
        this.totalNinos = totalNinos;
    }

    public int getValor() {
        return valor;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }

    @Override
    public String toString() {
        return "Cliente: " + cliente.toString() + " Transporte:" + transporte + " Alojamiento:" + alojamiento + " Alimentación: " + alimentacion + " Impuesto tiquete: " + impuestoTiqute + " Tours: " + Arrays.toString(tours) + " Valor $: " + valor;
    }
}
