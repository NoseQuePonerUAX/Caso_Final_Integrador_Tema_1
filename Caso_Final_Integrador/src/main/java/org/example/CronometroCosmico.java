package org.example;

import java.util.Scanner;

public class CronometroCosmico {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese el tiempo en segundos en la Tierra: ");
        long tiempoEnLaTierra = scanner.nextLong();
        calcularYMostrarTiempoEnLaTierra(tiempoEnLaTierra);
        System.out.print("Ingrese el factor de conversion para el nuevo planeta: ");
        double factorConversion = scanner.nextDouble();

        calcularYMostrarTiempoEnNuevoPlaneta(tiempoEnLaTierra, factorConversion);
        mostrarMayoresValoresRepresentables();
        scanner.close();
    }
    private static void calcularYMostrarTiempoEnLaTierra(long tiempoEnLaTierra) {
        long segundos = tiempoEnLaTierra % 60;
        long minutos = (tiempoEnLaTierra / 60) % 60;
        long horas = (tiempoEnLaTierra / (60 * 60)) % 24;
        long dias = (tiempoEnLaTierra / (60 * 60 * 24)) % 365;
        long anos = tiempoEnLaTierra / (60 * 60 * 24 * 365);

        System.out.println("Tiempo en la Tierra:");
        System.out.println("Años: " + anos);
        System.out.println("Dias: " + dias);
        System.out.println("Horas: " + horas);
        System.out.println("Minutos: " + minutos);
        System.out.println("Segundos: " + segundos);
        System.out.println();
    }
    private static void calcularYMostrarTiempoEnNuevoPlaneta(long tiempoEnLaTierra, double factorConversion) {
        long tiempoEnNuevoPlaneta = (long) (tiempoEnLaTierra * factorConversion);

        long segundos = tiempoEnNuevoPlaneta % 60;
        long minutos = (tiempoEnNuevoPlaneta / 60) % 60;
        long horas = (tiempoEnNuevoPlaneta / (60 * 60)) % 24;
        long dias = (tiempoEnNuevoPlaneta / (60 * 60 * 24)) % 365;
        long anos = tiempoEnNuevoPlaneta / (60 * 60 * 24 * 365);

        System.out.println("Tiempo en el nuevo planeta:");
        System.out.println("Años: " + anos);
        System.out.println("Dias: " + dias);
        System.out.println("Horas: " + horas);
        System.out.println("Minutos: " + minutos);
        System.out.println("Segundos: " + segundos);
        System.out.println();
    }
    private static void mostrarMayoresValoresRepresentables() {
        System.out.println("Mayores valores representables para diferentes tipos de datos:");
        System.out.println("Byte: " + Byte.MAX_VALUE);
        System.out.println("Short: " + Short.MAX_VALUE);
        System.out.println("Int: " + Integer.MAX_VALUE);
        System.out.println("Long: " + Long.MAX_VALUE);
        System.out.println("Float: " + Float.MAX_VALUE);
        System.out.println("Double: " + Double.MAX_VALUE);
    }
}