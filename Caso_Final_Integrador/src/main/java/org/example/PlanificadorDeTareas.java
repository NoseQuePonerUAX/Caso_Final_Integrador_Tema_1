package org.example;

import java.util.ArrayList;
import java.util.List;

public class PlanificadorDeTareas {
    private List<String> miembrosTripulacion;
    private List<List<Integer>> tablaTareas;

    public PlanificadorDeTareas(List<String> miembrosTripulacion) {
        this.miembrosTripulacion = miembrosTripulacion;
        this.tablaTareas = generarTablaTareas();
    }
    private List<List<Integer>> generarTablaTareas() {
        List<List<Integer>> tabla = new ArrayList<>();
        for (int i = 1; i <= miembrosTripulacion.size(); i++) {
            List<Integer> fila = new ArrayList<>();
            for (int j = 1; j <= 7; j++) {
                fila.add(i * j);
            }
            tabla.add(fila);
        }
        return tabla;
    }
    public void visualizarTablasDeTareas() {
        System.out.println("=== Tablas de Tareas ===");
        for (int i = 0; i < miembrosTripulacion.size(); i++) {
            String miembro = miembrosTripulacion.get(i);
            List<Integer> fila = tablaTareas.get(i);
            System.out.println(miembro + ": " + fila);
        }
    }
    public void calcularCargaDeTrabajoOptima() {
        System.out.println("\n=== Carga de Trabajo Optima ===");
        for (int i = 0; i < miembrosTripulacion.size(); i++) {
            String miembro = miembrosTripulacion.get(i);
            List<Integer> fila = tablaTareas.get(i);
            int cargaOptima = calcularProductoEscalar(fila);
            System.out.println(miembro + ": " + cargaOptima);
        }
    }
    private int calcularProductoEscalar(List<Integer> vector) {
        int productoEscalar = 0;
        for (int valor : vector) {
            productoEscalar += valor;
        }
        return productoEscalar;
    }
    public static void main(String[] args) {
        List<String> tripulacion = new ArrayList<>();
        tripulacion.add("Miembro1");
        tripulacion.add("Miembro2");
        tripulacion.add("Miembro3");

        PlanificadorDeTareas planificador = new PlanificadorDeTareas(tripulacion);
        planificador.visualizarTablasDeTareas();
        planificador.calcularCargaDeTrabajoOptima();
    }
}