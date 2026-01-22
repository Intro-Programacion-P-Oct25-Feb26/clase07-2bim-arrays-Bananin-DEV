package paquete01;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
/**
 *
 * @author reroes
 */
import java.util.ArrayList;
import paquete02.Establecimiento;
import paquete03.Pedido;
import paquete03.Ubicacion;
import paquete04.Operacion;
import paquete05.Informe;
import paquete06.Reporte;

/*
Este programa administra y analiza los pedidos semanales de varias cafeterías
utilizando ArrayList, que es una estructura de datos dinámica que permite
almacenar conjuntos de elementos y cuyo tamaño puede crecer o reducirse según 
sea necesario. En este sistema, los ArrayList se usan para guardar las cafeterías,
sus sedes y los pedidos realizados por cada día de la semana, facilitando el manejo, 
recorrido y procesamiento de la información. A partir de estos datos se calculan 
estadísticas como el promedio semanal de pedidos,el total de pedidos de un día 
específico, la suma total de pedidos, la cafetería con mayor cantidad de pedidos
y los pedidos mínimos y máximos por cafetería, mostrando finalmenteun reporte
general con los resultados obtenidos.
 */

public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        ArrayList<String> misCafeterias = Establecimiento.obtenerCafeterias();
        ArrayList<ArrayList<Integer>> misPedidos = Pedido.obtenerPedidos();
        ArrayList<String> misSedes = Ubicacion.obtenerUbicaciones();
        ArrayList<Double> promedioSemanal = Operacion.obtenerPromedioSemanal(misPedidos);
        int pedidosMiercoles = Informe.obtenerTotalDia(misPedidos, 3);
        int sumaPedidosTotal = Operacion.obtenerSumaTotal(misPedidos);
        String cafeteriaMasPedida = Informe.obtenerCafeteriaMasPedidos(misPedidos, misCafeterias);
        ArrayList<Integer> pedidosMenores = Informe.obtenerMenorPedidoCafeteria(misPedidos);
        ArrayList<Integer> pedidosMayores = Informe.obtenerMayorPedidoCafeteria(misPedidos);
        Reporte.imprimirReporte(misCafeterias, misSedes,
                promedioSemanal,
                pedidosMenores,
                pedidosMayores,
                pedidosMiercoles,
                cafeteriaMasPedida);
    }

}
