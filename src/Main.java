public class Main {

    public static void main(String[] args) {

        ControlAforo evento = new ControlAforo(5);

        // Simular 7 ingresos
        for (int i = 1; i <= 7; i++) {

            System.out.println("\nIntento de ingreso número " + i);

            evento.registrarIngreso();
        }

        // Registrar una salida
        System.out.println("\n--- REGISTRAR SALIDA ---");
        evento.registrarSalida();

        // Mostrar estado final
        System.out.println("\n--- ESTADO FINAL ---");
        evento.mostrarEstado();
    }
}
