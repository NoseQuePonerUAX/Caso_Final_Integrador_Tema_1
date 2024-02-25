package org.example;

public class ComunicadorInterplanetario {
    private String mensaje;

    public ComunicadorInterplanetario(String mensaje) {
        this.mensaje = mensaje;
    }
    public void analizarMensaje() {
        System.out.println("=== Analisis del Mensaje ===");
        System.out.println("Mensaje Original: " + mensaje);
        contarVocales();
        invertirMensaje();
        verificarPalindromo();
    }
    private void contarVocales() {
        int conteoVocales = 0;
        for (char c : mensaje.toLowerCase().toCharArray()) {
            if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
                conteoVocales++;
            }
        }
        System.out.println("Numero de Vocales: " + conteoVocales);
    }
    private void invertirMensaje() {
        StringBuilder mensajeInvertido = new StringBuilder(mensaje).reverse();
        System.out.println("Mensaje Invertido: " + mensajeInvertido);
    }
    private void verificarPalindromo() {
        String mensajeSinEspacios = mensaje.replaceAll("\\s+", "").toLowerCase();
        String mensajeInvertidoSinEspacios = new StringBuilder(mensajeSinEspacios).reverse().toString();

        if (mensajeSinEspacios.equals(mensajeInvertidoSinEspacios)) {
            System.out.println("El mensaje es un palindromo.");
        } else {
            System.out.println("El mensaje no es un palindromo.");
        }
    }
    public static void main(String[] args) {
        ComunicadorInterplanetario comunicador = new ComunicadorInterplanetario("Anita lava la tina");
        comunicador.analizarMensaje();
    }
}