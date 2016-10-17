package es.upm.miw.pd.state.connection.solution;

public class Preparado extends State {

    @Override
    public void abrir(Conexion context) {

    }

    @Override
    public void cerrar(Conexion context) {
        context.setEstado(Estado.CERRADO);
        context.setState(new Cerrado());
    }

    @Override
    public void parar(Conexion context) {
        context.setEstado(Estado.PARADO);
        context.setState(new Parado());

    }

    @Override
    public void iniciar(Conexion context) {
    }

    @Override
    public void enviar(Conexion context, String msg) {
        context.getLink().enviar(msg);
        context.setEstado(Estado.ESPERANDO);
        context.setState(new Esperando());
    }

    @Override
    public void recibir(Conexion context, int respuesta) {
        throw new UnsupportedOperationException("Acción no permitida... ");
    }

}
