public class Libro extends ItemBiblioteca {
    private String autor;

    public Libro(String id, String titulo, boolean estadoPrestado, String autor) {
        super(id, titulo, estadoPrestado);
        this.autor = autor;
    }

    @Override
    public double calcularMulta(int diasRetraso) {
        return diasRetraso * 0.50;
    }

    @Override
    public int getDiasMaximosPrestamo() {
        return 14;
    }

    @Override
    public String toString() {
        return "LIBRO -> " + super.toString() + " | Autor: " + autor;
    }
}