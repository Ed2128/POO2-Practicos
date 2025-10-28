## Documento de justificación de las elecciones de patrones creacionales empleados para cada caso.

## Requerimieneto 1: Motor de Renderizado.
### Patrón de diseño creacional elegido: **Factory Method**
### Justificación: 

El problema consiste en crear instancias de distintos motores de renderizado (`RenderizadorPDF`, `RenderizadorExcel`, `RenderizadorCSV`) sin que el código cliente conozca ni dependa de las clases concretas.

El patrón **Factory Method** permite **encapsular la lógica de creación de objetos** en una jerarquía de clases creadoras. De esta manera, el cliente solo solicita un renderizador indicando el tipo de formato requerido (por ejemplo, `"PDF"`), y la fábrica se encarga de devolver la instancia correspondiente.
