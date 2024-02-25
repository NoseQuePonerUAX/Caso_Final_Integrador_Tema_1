package org.example;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class SistemaDeAlertaYMonitoreo {
    private double nivelRadiacion;
    private double temperatura;
    private double presion;

    private List<Integer> eventosCriticos = new ArrayList<>();
    private Random random = new Random();

    public SistemaDeAlertaYMonitoreo(double nivelRadiacion, double temperatura, double presion) {
        this.nivelRadiacion = nivelRadiacion;
        this.temperatura = temperatura;
        this.presion = presion;
    }
    public void monitorearFactores() {
        // Simulación de lógica de monitoreo, ajusta según tus necesidades
        if (nivelRadiacion > 90.0 || temperatura > 40.0 || presion < 800.0) {
            alertarTripulacion();
        }
    }
    public void alertarTripulacion() {
        // Acciones de alerta y sugerencias de ajustes
        System.out.println("¡Alerta! Se detectaron valores extremos en los factores críticos.");
        System.out.println("Sugerencia: Verificar y ajustar los sistemas de radiación, temperatura y presión.");
    }
    public void identificarEventosRaros(int n) {
        // Identificar y listar los N primeros eventos raros (números primos)
        eventosCriticos.clear();

        int count = 0;
        int numero = 2;

        while (count < n) {
            if (esPrimo(numero)) {
                eventosCriticos.add(numero);
                count++;
            }
            numero++;
        }

        System.out.println("Los primeros " + n + " eventos raros son: " + eventosCriticos);
    }
    private boolean esPrimo(int num) {
        if (num < 2) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
    public void simularCambiosAleatorios() {
        nivelRadiacion += random.nextDouble() * 10.0;
        temperatura += random.nextDouble() * 5.0;
        presion -= random.nextDouble() * 20.0;
    }
    public static void main(String[] args) {
        SistemaDeAlertaYMonitoreo sistema = new SistemaDeAlertaYMonitoreo(95.0, 38.0, 820.0);

        for (int i = 0; i < 5; i++) {
            sistema.monitorearFactores();
            sistema.identificarEventosRaros(5);
            sistema.simularCambiosAleatorios();
        }
    }
}