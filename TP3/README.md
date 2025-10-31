## Documento de justificación de las elecciones de patrones creacionales empleados para cada caso.

## Requerimieneto 1: Motor de Renderizado.
### Patrón de diseño creacional elegido: **Factory Method**
### Justificación: 

El problema consiste en crear instancias de distintos motores de renderizado (`RenderizadorPDF`, `RenderizadorExcel`, `RenderizadorCSV`) sin que el código cliente conozca ni dependa de las clases concretas.

El patrón **Factory Method** permite **encapsular la lógica de creación de objetos** en una jerarquía de clases creadoras. De esta manera, el cliente solo solicita un renderizador indicando el tipo de formato requerido (por ejemplo, `"PDF"`), y la fábrica se encarga de devolver la instancia correspondiente.

### Los problemas que evita utilizar este patrón: 
- **Evita el acoplamiento**  entre el cliente y las clases concretas de renderizado.  
- **Cumple con el Principio Abierto/Cerrado (OCP):** es posible agregar nuevos formatos (por ejemplo, `RenderizadorXML`) sin modificar el código existente.  
- **Centraliza la creación de objetos**, facilitando la extensión y mantenimiento del sistema.

---
##  Requerimiento 2: Construcción de Reportes
### Patrón de diseño creacional elegido: **Builder**
###  Justificación:
El objeto `Reporte` requiere múltiples atributos, algunos obligatorios (`titulo`, `cuerpoPrincipal`) y otros opcionales (`encabezado`, `pieDePagina`, `fecha`, `autor`, `orientacion`).  

El patrón **Builder** permite **construir objetos complejos paso a paso**, proporcionando un método claro y flexible para inicializar los atributos opcionales sin recurrir a un constructor con demasiados parámetros o valores `null`.

### Los problemas que evita utilizar este patrón: 
- **Elimina el uso de constructores telescópicos**, evitando confusión y errores.  
- Que el código sea **difícil** de leer.

---
##  Requerimiento 3: Gestor de Configuración
### Patrón de diseño creacional elegido: **Singleton**
###  Justificación:
El sistema necesita un único punto de acceso a las configuraciones globales (por ejemplo, `urlBd`,`userBd`,`pathReportes`) que será utilizado por toda la aplicación.
El patrón **Singleton** garantiza que **sólo exista una instancia** de la clase `GestorConfiguracion` en toda la aplicación, asegurando coherencia en los valores configuración y evitando el uso innecesario de múltiples objetos en memoria.

### Los problemas que evita utilizar este patrón: 
- Evita la **creación de múltiples instancias* de configuración que podrían generar valores distintos en distintos módulos del sistema.
- Evita **inconsistencias de datos** entre configuraciones cargadas en memoria.
- Evita **duplicación innecesaria de recursos**, como múltiples conexiones o lecturas de configuración.
- Evita **falta de control en el acceso global** a la configuración del sistema.

### La unicidad de la instancia fue garantizada mediante:
- Un **atributo estático privado** (`private static GestorConfiguracion instancia;`) que almacena la única instancia de la clase.  
- Un **constructor privado**, que impide crear objetos desde fuera de la clase.  
- Un **método público estático** (`public static GestorConfiguracion getInstancia()`) que crea la instancia **solo si no existe** y devuelve siempre la misma referencia al resto del sistema.
  
