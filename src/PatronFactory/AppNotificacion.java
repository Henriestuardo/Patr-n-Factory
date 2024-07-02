package PatronFactory;

public class AppNotificacion implements AppNitificacion{
    @Override
    public void enviarMensaje(String mensaje) {
        System.out.println("Enviando mensaje por medio de la App");
    }
}
