package tarea_timestamp;

public class Timestamp {

    private int año;
    private int mes;
    private int dia;
    private int hora;
    private int minuto;
    private int segundo;

    public Timestamp() {
        this.año = 1970;
        this.mes = 1;
        this.dia = 1;
        this.hora = 0;
        this.minuto = 0;
        this.segundo = 0;
    }

    // Constructor con atributos de fecha
    public Timestamp(int año, int mes, int dia) {
        this();
        if (esFechaValida(año, mes, dia)) {
            this.año = año;
            this.mes = mes;
            this.dia = dia;
        }
    }

    public Timestamp(int año, int mes, int dia, int hora, int minuto, int segundo) {
        this(año, mes, dia);
        if (esHoraValida(hora, minuto, segundo)) {
            this.hora = hora;
            this.minuto = minuto;
            this.segundo = segundo;
        }
    }

    public void setAño(int año) {
        if (año > 0) {
            this.año = año;
        }
    }

    public void setMes(int mes) {
        if (mes >= 1 && mes <= 12) {
            this.mes = mes;
        }
    }

    public void setDia(int dia) {
        if (dia >= 1 && dia <= getDiasDelMes(this.mes, this.año)) {
            this.dia = dia;
        }
    }

    public int getAño() {
        return año;
    }

    public int getMes() {
        return mes;
    }

    public int getDia() {
        return dia;
    }

    public int getHora() {
        return hora;
    }

    public int getMinuto() {
        return minuto;
    }

    public int getSegundo() {
        return segundo;
    }

    // Sobrecarga de toString
    @Override
    public String toString() {
        return String.format("%04d-%02d-%02d %02d:%02d:%02d", año, mes, dia, hora, minuto, segundo);
    }

    private boolean esAñoBisiesto(int año) {
        if (año % 4 != 0) {
            return false;
        } else if (año % 100 != 0) {
            return true;
        } else if (año % 400 != 0) {
            return false;
        } else {
            return true;
        }
    }

    private int getDiasDelMes(int mes, int año) {
        if (mes == 2) {
            if (esAñoBisiesto(año)) {
                return 29;
            } else {
                return 28;
            }
        } else if (mes == 4 || mes == 6 || mes == 9 || mes == 11) {
            return 30;
        } else {
            return 31;
        }
    }

    private boolean esFechaValida(int año, int mes, int dia) {
        if (año < 1 || mes < 1 || mes > 12 || dia < 1 || dia > getDiasDelMes(mes, año)) {
            return false;
        }
        return true;
    }

    private boolean esHoraValida(int hora, int minuto, int segundo) {
        if (hora < 0 || hora > 23 || minuto < 0 || minuto > 59 || segundo < 0 || segundo > 59) {
            return false;
        }
        return true;
    }
}
