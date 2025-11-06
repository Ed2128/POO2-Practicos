package escenario2reportes;

public class ProcesadorDeImpuestos {

    public float calcularSaldo(DatosFiscales datos) {
        System.out.println("Calculando saldo de impuestos...");
        float tasa = 0.21f;
        float impuestoCalculado = datos.getIngresos() * tasa;
        return impuestoCalculado - datos.getImpuestosPagados();
    }
}
