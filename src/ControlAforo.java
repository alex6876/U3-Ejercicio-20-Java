public class ControlAforo {

    private int capacidadMaxima;
    private int asistentesActuales;

    public ControlAforo(int capacidadMaxima) {
        this.capacidadMaxima = capacidadMaxima;
        this.asistentesActuales = 0;
    }

    public boolean registrarIngreso() {

        if (asistentesActuales < capacidadMaxima) {

            asistentesActuales++;

            System.out.println("Ingreso permitido. Asistentes: " + asistentesActuales);
            return true;

        } else {

            System.out.println("Ingreso rechazado. El evento está completo.");
            return false;
        }
    }

    public void registrarSalida() {

        if (asistentesActuales > 0) {

            asistentesActuales--;

            System.out.println("Salida registrada. Asistentes: " + asistentesActuales);

        } else {

            System.out.println("No hay asistentes para registrar una salida.");
        }
    }

    public void mostrarEstado() {
        System.out.println("Capacidad máxima: " + capacidadMaxima);
        System.out.println("Asistentes actuales: " + asistentesActuales);
    }
}
