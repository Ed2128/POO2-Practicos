## Justificación de elección de patrones.

## Escenario 1 – Sistema de Ensamblaje de Computadoras
**Patrones aplicados:** `Composite` y `Decorator`

- **Problemas que resuelven:**  
  Se necesitaba tratar de la misma forma a componentes individuales (CPU, RAM, SSD) y a conjuntos de componentes (Gabinete, Placa Madre), además de poder agregar extras opcionales sin modificar las clases originales.  

- **Justificación:**  
  El patrón **Composite** permite componer objetos en estructuras jerárquicas y tratarlos de manera uniforme, resolviendo la diferencia entre elementos simples y compuestos.  
  El patrón **Decorator** resulta adecuado porque permite añadir responsabilidades dinámicamente (como garantía o instalación) sin alterar las clases base, evitando herencias innecesarias y favoreciendo la extensión flexible.

---

## Escenario 2 – Generación de Reportes Fiscales
**Patrón aplicado:** `Facade`

- **Problema que resuelve:**  
  El cliente debía interactuar con varias clases (ConectorDB, ServicioWebAFIP, ProcesadorDeImpuestos, RenderizadorPDF), generando acoplamiento y complejidad excesiva.

- **Justificación:**  
  El patrón **Facade** simplifica el acceso a los subsistemas creando una única interfaz de alto nivel que centraliza las operaciones necesarias para generar el reporte.  
  Es la mejor elección frente a otras alternativas porque reduce el acoplamiento y mejora la mantenibilidad, sin modificar las clases internas.

---

## Escenario 3 – Integración con API de Logística
**Patrón aplicado:** `Adapter`

- **Problema que resuelve:**  
  La nueva API `ApiLogisticaVeloz` tiene métodos y tipos de datos distintos a los esperados por la interfaz interna `IServicioEnvio`, impidiendo su integración directa.

- **Justificación:**  
  El patrón **Adapter** traduce la interfaz externa a la interna del sistema, resolviendo las incompatibilidades sin modificar ninguno de los dos componentes.  
  Es la elección adecuada porque permite integrar el nuevo servicio manteniendo bajo acoplamiento y reutilizando la lógica existente, a diferencia de alternativas que implicarían reescritura o duplicación de código.
