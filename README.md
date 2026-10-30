Aquí tienes la estructura en formato Markdown lista para el `README.md` de este código de **Simulación de Control de Aforo y Gestión de Asistentes (Encapsulamiento y Control de Capacidad en Java)**, manteniendo el enfoque exclusivo de **Programación Orientada a Objetos en memoria** (sin bases de datos):

---

# 🎟️ Simulación de Control de Aforo y Capacidad (Encapsulamiento y Restricciones en Java)

Este proyecto es una aplicación en Java que modela un sistema de control de acceso para eventos o establecimientos, permitiendo gestionar ingresos y salidas bajo estrictas restricciones de capacidad máxima. Pone en práctica conceptos clave de la **Programación Orientada a Objetos (POO)** como el **encapsulamiento de atributos privados**, la gestión de contadores de estado y la validación de límites numéricos en memoria.

---

## 🧩 Clases y Estructura del Sistema

El diseño del software se organiza a través de una clase de dominio encapsulada y un punto de ejecución:

* **`ControlAforo`**: Modela el sistema de supervisión de asistencia y protege la integridad del cupo máximo y la concurrencia actual.
* **Atributos privados (`private`)**: `capacidadMaxima` y `asistentesActuales`, impidiendo modificaciones directas o manipulación arbitraria desde el exterior.
* **Constructor**: Inicializa el control de aforo asignando la capacidad máxima permitida para el evento y estableciendo el número inicial de asistentes en cero (`0`).
* **Métodos operativos de negocio**:
* `registrarIngreso()`: Comprueba si el número de asistentes actuales es menor a la capacidad máxima. Si hay lugar, incrementa el contador e informa el éxito de la operación retornando `true`; de lo contrario, rechaza el acceso retornando `false`.
* `registrarSalida()`: Verifica que existan asistentes dentro del recinto antes de decrementar el contador de concurrencia, evitando valores negativos.
* `mostrarEstado()`: Imprime de forma consolidada la capacidad máxima del establecimiento y la cantidad de asistentes presentes en tiempo real.




* **`Main`**: Punto de entrada del programa. Instancia un objeto de tipo `ControlAforo` con un límite estricto de 5 asistentes, simula un bucle de 7 intentos de ingresos consecutivos (evidenciando el rechazo al superar el cupo), registra una salida, y muestra por consola el estado final resultante.

---

## ⚙️ Reglas de Negocio y Control de Validación

1. **Restricción de Capacidad Máxima:** El método de ingreso evalúa de forma estricta que la concurrencia actual no rebase el tope permitido (`asistentesActuales < capacidadMaxima`), bloqueando el acceso cuando el evento se encuentra completo.
2. **Protección contra Concurrencias Negativas:** El método de salida valida que el contador de asistentes sea mayor a cero (`asistentesActuales > 0`), asegurando que el sistema mantenga consistencia lógica en memoria.
3. **Encapsulamiento Estricto del Estado:** Oculta los contadores internos, garantizando que el aforo solo pueda ser alterado mediante las operaciones controladas de ingreso y salida.

---

## 💻 Salida por Consola

Al ejecutar la clase `Main`, el programa genera el siguiente resultado:

```text
Intento de ingreso número 1
Ingreso permitido. Asistentes: 1

Intento de ingreso número 2
Ingreso permitido. Asistentes: 2

Intento de ingreso número 3
Ingreso permitido. Asistentes: 3

Intento de ingreso número 4
Ingreso permitido. Asistentes: 4

Intento de ingreso número 5
Ingreso permitido. Asistentes: 5

Intento de ingreso número 6
Ingreso rechazado. El evento está completo.

Intento de ingreso número 7
Ingreso rechazado. El evento está completo.

--- REGISTRAR SALIDA ---
Salida registrada. Asistentes: 4

--- ESTADO FINAL ---
Capacidad máxima: 5
Asistentes actuales: 4

```

---

## 🚀 Conceptos de Programación Aplicados

* **Encapsulamiento de Contadores Dinámicos:** Ocultamiento de las variables de estado numéricas para proteger la coherencia del aforo frente a modificaciones directas no autorizadas.
* **Validación de Invariantes Operativas:** Aseguramiento de que el sistema mantenga límites físicos lógicos (respetando tanto los techos máximos como los pisos mínimos de concurrencia).
* **Diseño Modular:** Clara separación entre la lógica del dominio de control (`ControlAforo`) y la ejecución de casos de prueba simulados (`Main`).
