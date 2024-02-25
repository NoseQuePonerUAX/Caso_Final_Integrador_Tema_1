package org.example;

import java.util.Scanner;
import java.util.ArrayList;

public class RecursosYSuministros {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> consumoRecursos = new ArrayList<>();

        int dias = 0;
        while (true) {
            System.out.print("Ingrese el consumo diario de recursos (o ingrese -1 para terminar): ");
            int consumoDiario = scanner.nextInt();
            if (consumoDiario == -1) {
                break;
            }
            consumoRecursos.add(consumoDiario);
            dias++;
        }
        calcularYMostrarConsumo(consumoRecursos, dias);
        scanner.close();
    }
    private static void calcularYMostrarConsumo(ArrayList<Integer> consumoRecursos, int dias) {
        if (dias == 0) {
            System.out.println("No se ingresó ningún dato de consumo.");
            return;
        }

        int semanas = dias / 7;
        int meses = dias / 30;
        int consumoSemanal = calcularConsumoPeriodico(consumoRecursos, semanas * 7);
        int consumoMensual = calcularConsumoPeriodico(consumoRecursos, meses * 30);
        int consumoPromedio = calcularPromedio(consumoRecursos);
        int consumoMinimo = calcularMinimo(consumoRecursos);
        int consumoMaximo = calcularMaximo(consumoRecursos);

        System.out.println("\nConsumo semanal: " + consumoSemanal);
        System.out.println("Consumo mensual: " + consumoMensual);
        System.out.println("\nEstadisticas de consumo:");
        System.out.println("Promedio: " + consumoPromedio);
        System.out.println("Minimo: " + consumoMinimo);
        System.out.println("Maximo: " + consumoMaximo);
    }

    private static int calcularConsumoPeriodico(ArrayList<Integer> consumoRecursos, int periodo) {
        int consumoPeriodico = 0;
        for (int i = 0; i < periodo && i < consumoRecursos.size(); i++) {
            consumoPeriodico += consumoRecursos.get(i);
        }
        return consumoPeriodico;
    }
    private static int calcularPromedio(ArrayList<Integer> consumoRecursos) {
        if (consumoRecursos.isEmpty()) {
            return 0;
        }
        int suma = 0;
        for (int consumo : consumoRecursos) {
            suma += consumo;
        }
        return suma / consumoRecursos.size();
    }
    private static int calcularMinimo(ArrayList<Integer> consumoRecursos) {
        if (consumoRecursos.isEmpty()) {
            return 0;
        }
        int minimo = Integer.MAX_VALUE;
        for (int consumo : consumoRecursos) {
            minimo = Math.min(minimo, consumo);
        }
        return minimo;
    }
    private static int calcularMaximo(ArrayList<Integer> consumoRecursos) {
        if (consumoRecursos.isEmpty()) {
            return 0;
        }
        int maximo = Integer.MIN_VALUE;
        for (int consumo : consumoRecursos) {
            maximo = Math.max(maximo, consumo);
        }
        return maximo;
    }
}