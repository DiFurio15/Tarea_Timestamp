package tarea_timestamp;

public class Tarea_Timestamp {

    public static void main(String[] args) {

        Timestamp timestampPredeterminado = new Timestamp();
        System.out.println("Timestamp por defecto: " + timestampPredeterminado);

        Timestamp timestampFecha = new Timestamp(2024, 4, 25);
        System.out.println("Timestamp con fecha: " + timestampFecha);

        Timestamp timestampCompleto = new Timestamp(2024, 4, 25, 12, 9, 1);
        System.out.println("Timestamp completo: " + timestampCompleto);

        timestampCompleto.setMes(13);
        System.out.println("Intento de establecer mes inválido: " + timestampCompleto);

        timestampCompleto.setAño(2024); // Año bisiesto
        timestampCompleto.setMes(2);
        timestampCompleto.setDia(29); // Día válido en año bisiesto
        System.out.println("Timestamp en año bisiesto: " + timestampCompleto);
    }
}
