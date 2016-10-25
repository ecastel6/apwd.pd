package es.upm.miw.pd.state.connection.solution;

public class Parado extends State {

    @Override
    public void abrir(Conexion context) {
        throw new UnsupportedOperationException("Acción no permitida... ");
    }

    @Override
    public void cerrar(Conexion context) {
        throw new UnsupportedOperationException("Acción no permitida... ");

    }

    @Override
    public void parar(Conexion context) {

    }

    @Override
    public void iniciar(Conexion context) {
        context.setEstado(Estado.PREPARADO);
        context.setState(new Preparado());

    }

    @Override
    public void enviar(Conexion context, String msg) {
        throw new UnsupportedOperationException("Acción no permitida... ");

    }

    @Override
    public void recibir(Conexion context, int respuesta) {
        throw new UnsupportedOperationException("Acción no permitida... ");

    }

}
