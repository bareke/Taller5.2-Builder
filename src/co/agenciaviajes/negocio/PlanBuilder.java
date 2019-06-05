package co.agenciaviajes.negocio;

/**
 * Abstract Builder
 *
 * @author Libardo Pantoja, Julio Hurtado, Ricardo Zambrano
 */
public abstract class PlanBuilder {

    protected Plan plan;

    public void crearNuevoPlan() {
        plan = new Plan();
    }

    // Completar métodos
    public Plan getPlan() {
        return plan;
    }

    public void setPlan(Plan plan) {
        this.plan = plan;
    }

    public void buildCliente() {
    }

    public void buildTransportes() {
    }

    public void buildAlojamiento() {
    }

    public void buildAlimentacion() {
    }

    public void buildSeguroHotelero() {
    }

    public void buildImpuestoTiquete() {
    }

    public void buildTours() {
    }
}
