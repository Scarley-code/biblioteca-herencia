public class Revista extends ItemBiblioteca {
    private int numeroEdicion;

    public Revista(String id, String titulo, boolean estadoPrestado, int numeroEdicion) {
        super(id, titulo, estadoPrestado);
        this.numeroEdicion = numeroEdicion;
    }

    @Override
    public double calcularMulta(int diasRetraso) {
        return diasRetraso * 1.00;
    }

    @Override
    public int getDiasMaximosPrestamo() {
        return 7;
    }

    @Override
    public String toString() {
        return "REVISTA -> " + super.toString() + " | Edición: " + numeroEdicion;
    }
}