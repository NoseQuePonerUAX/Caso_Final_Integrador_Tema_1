package org.example;

public class NavegadorEstelar {
    private int[][] terreno;
    private int[][] construcciones;

    public NavegadorEstelar(int[][] terreno, int[][] construcciones) {
        this.terreno = terreno;
        this.construcciones = construcciones;
    }
    public void visualizarTerreno() {
        System.out.println("=== Terreno ===");
        for (int[] fila : terreno) {
            for (int valor : fila) {
                System.out.print(valor + " ");
            }
            System.out.println();
        }
    }
    public void visualizarConstrucciones() {
        System.out.println("\n=== Construcciones ===");
        for (int[] fila : construcciones) {
            for (int valor : fila) {
                System.out.print(valor + " ");
            }
            System.out.println();
        }
    }
    public void planificarExpansion() {
        System.out.println("\n=== Planificación de Expansión ===");
        int[][] expansion = multiplicarMatrices(terreno, construcciones);
        for (int[] fila : expansion) {
            for (int valor : fila) {
                System.out.print(valor + " ");
            }
            System.out.println();
        }
    }
    private int[][] multiplicarMatrices(int[][] matrizA, int[][] matrizB) {
        int filasA = matrizA.length;
        int columnasA = matrizA[0].length;
        int filasB = matrizB.length;
        int columnasB = matrizB[0].length;

        if (columnasA != filasB) {
            throw new IllegalArgumentException("No se pueden multiplicar matrices con estas dimensiones.");
        }

        int[][] resultado = new int[filasA][columnasB];

        for (int i = 0; i < filasA; i++) {
            for (int j = 0; j < columnasB; j++) {
                for (int k = 0; k < columnasA; k++) {
                    resultado[i][j] += matrizA[i][k] * matrizB[k][j];
                }
            }
        }

        return resultado;
    }
    public static void main(String[] args) {
        int[][] terreno = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };
        int[][] construcciones = {
                {2, 0, 1},
                {1, 3, 2},
                {0, 1, 2}
        };

        NavegadorEstelar navegador = new NavegadorEstelar(terreno, construcciones);
        navegador.visualizarTerreno();
        navegador.visualizarConstrucciones();
        navegador.planificarExpansion();
    }
}