package tarea_timestamp;

public class Tarea_Timestamp {

    public static void main(String[] args) {
        Timestamp tsDefault = new Timestamp();
        System.out.println("Timestamp por defecto: " + tsDefault);

        Timestamp tsFecha = new Timestamp(2024, 4, 25);
        System.out.println("Timestamp con fecha: " + tsFecha);

        Timestamp tsCompleto = new Timestamp(2024, 4, 25, 12, 9, 1);
        System.out.println("Timestamp completo: " + tsCompleto);

        tsCompleto.setMes(13);
        System.out.println("Intento de establecer mes inválido: " + tsCompleto);

        tsCompleto.setAño(2024); // Año bisiesto
        tsCompleto.setMes(2);
        tsCompleto.setDia(29); // Día válido en año bisiesto
        System.out.println("Timestamp en año bisiesto: " + tsCompleto);
    }
}
