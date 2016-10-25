package es.upm.miw.pd.state.connection.solution;

public class Esperando extends State {

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
        throw new UnsupportedOperationException("Acción no permitida... ");
    }

    @Override
    public void iniciar(Conexion context) {
        throw new UnsupportedOperationException("Acción no permitida... ");
    }

    @Override
    public void enviar(Conexion context, String msg) {
        throw new UnsupportedOperationException("Acción no permitida... ");
    }

    @Override
    public void recibir(Conexion context, int respuesta) {
        if (respuesta == 0) {
            context.setEstado(Estado.PREPARADO);
        } else {
            context.setEstado(Estado.CERRADO);
        }
    }
}
