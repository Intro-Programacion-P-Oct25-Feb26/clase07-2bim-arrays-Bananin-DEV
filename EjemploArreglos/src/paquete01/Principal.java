package paquete01;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
/**
 *
 * @author reroes
 */
import paquete02.Establecimiento;
import paquete03.Pedido;
import paquete03.Ubicacion;
import paquete04.Operacion;
import paquete05.Informe;
import paquete06.Reporte;

/*
Este programa gestiona y analiza la información de pedidos realizados en varias
cafeterías.A partir de los datos ingresados (cafeterías, sedes y pedidos semanales)
, calcula estadísticascomo el promedio semanal de pedidos, el total de pedidos de
un día específico, la suma totalde pedidos, la cafetería con mayor número de pedidos
y los pedidos mínimos y máximos porcafetería. Finalmente, toda esta información 
procesada se presenta de forma organizada mediante un reporte final.
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        String[] misCafeterias = Establecimiento.obtenerCafeterias();
        int[][] misPedidos = Pedido.obtenerPedidos();
        String[] misSedes = Ubicacion.obtenerUbicaciones();
        double[] promedioSemanal = Operacion.obtenerPromedioSemanal(misPedidos);
        int pedidosMiercoles = Informe.obtenerTotalDia(misPedidos, 3);
        int sumaPedidosTotal = Operacion.obtenerSumaTotal(misPedidos);
        String cafeteriaMasPedida = Informe.obtenerCafeteriaMasPedidos(misPedidos, misCafeterias);
        int[] pedidosMenores = Informe.obtenerMenorPedidoCafeteria(misPedidos);
        int[] pedidosMayores = Informe.obtenerMayorPedidoCafeteria(misPedidos);
        Reporte.imprimirReporte(misCafeterias, misSedes,
                promedioSemanal,
                pedidosMenores,
                pedidosMayores,
                pedidosMiercoles,
                cafeteriaMasPedida);
    }

}
