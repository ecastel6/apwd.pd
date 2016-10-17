package es.upm.miw.pd.state.connection.solution;

public class Conexion {
    private State state;

    private Estado estado;

    private Link link;

    public Conexion(Link link) {
        assert link != null;
        this.setLink(link);
        this.setEstado(Estado.CERRADO);
        this.setState(new Cerrado());
    }

    public Link getLink() {
        return link;
    }

    public void setLink(Link link) {
        this.link = link;
    }

    protected void setState(State state) {
        this.state = state;
    }

    protected State getState() {
        return this.state;
    }

    public Estado getEstado() {
        return estado;
    }

    public void setEstado(Estado estado) {
        this.estado = estado;
    }

    public void abrir() {
        state.abrir(this);
    }

    public void cerrar() {
        state.cerrar(this);
    }

    public void parar() {
        state.parar(this);
    }

    public void iniciar() {
        state.iniciar(this);
    }

    public void enviar(String msg) {
        state.enviar(this, msg);
    }

    public void recibir(int respuesta) {
        state.recibir(this, respuesta);
    }

    @Override
    public String toString() {
        return "Conexión[" + state.toString() + "]";
    }

}
