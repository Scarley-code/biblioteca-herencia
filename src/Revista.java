public class Revista extends ItemBiblioteca{
    private int numeroEdicion;

    public Revista(String id, String titulo, boolean estadoPrestado, int numeroEdicion) {
        super(id, titulo, estadoPrestado);
        this.numeroEdicion = numeroEdicion;
    }

    public int getNumeroEdicion() {
        return numeroEdicion;
    }

    public void setNumeroEdicion(int numeroEdicion) {
        this.numeroEdicion = numeroEdicion;
    }

    @Override
    public double calcularMulta(int diasRetraso) {
        return 1.00;
    }

    @Override
    public int getDiasMaximosPrestamo() {
        return 7;
    }
}
