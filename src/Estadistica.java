public class Estadistica implements Comparable<Estadistica> {
    private int puntos;
    private int diferenciaDeGol;

    public Estadistica(int puntos, int diferenciaDeGol) {
        this.puntos = puntos;
        this.diferenciaDeGol = diferenciaDeGol;
    }

    public int getPuntos() {
        return puntos;
    }

    public int getDiferenciaDeGol() {
        return diferenciaDeGol;
    }

    @Override
    public int compareTo(Estadistica otra) {
        if (this.puntos != otra.puntos) {
            return Integer.compare(this.puntos, otra.puntos);
        } else {
            return Integer.compare(this.diferenciaDeGol, otra.diferenciaDeGol);
        }
    }

    @Override
    public String toString() {
        return "Estadistica{" +
                "puntos=" + puntos +
                ", diferenciaDeGol=" + diferenciaDeGol +
                '}';
    }
}

