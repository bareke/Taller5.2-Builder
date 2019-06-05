package co.agenciaviajes.negocio;

/**
 * Director Director que controla la creación paso a paso, solo cuando el
 * Builder ha terminado de construir el objeto lo recupera el Director
 *
 * @author Libardo Pantoja, Julio Hurtado, Ricardo Zambrano
 */
public class DirectorPlan {

    private PlanBuilder planBuilder;

    // Completar métodos
    public Plan getPlan() {
        return planBuilder.getPlan();
    }

    public void setPlanBuilder(PlanBuilder planBuilder) {
        this.planBuilder = planBuilder;
    }

    public void construirPlan() {
        this.planBuilder.crearNuevoPlan();
        this.planBuilder.buildCliente();
        this.planBuilder.buildTransportes();
        this.planBuilder.buildAlojamiento();
        this.planBuilder.buildAlimentacion();
        this.planBuilder.buildSeguroHotelero();
        this.planBuilder.buildImpuestoTiquete();
        this.planBuilder.buildTours();
    }

}
