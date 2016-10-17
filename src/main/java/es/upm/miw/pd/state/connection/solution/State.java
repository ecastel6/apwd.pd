package es.upm.miw.pd.state.connection.solution;

public abstract class State {
    public abstract void abrir(Conexion context);

    public abstract void cerrar(Conexion context);

    public abstract void parar(Conexion context);

    public abstract void iniciar(Conexion context);

    public abstract void enviar(Conexion context, String msg);

    public abstract void recibir(Conexion context, int respuesta);

}
