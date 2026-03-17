public class DVD extends ItemBiblioteca {
    private String director;

    public DVD(String id, String titulo, boolean estadoPrestado, String director) {
        super(id, titulo, estadoPrestado);
        this.director = director;
    }

    @Override
    public double calcularMulta(int diasRetraso) {
        return diasRetraso * 2.00;
    }

    @Override
    public int getDiasMaximosPrestamo() {
        return 3;
    }

    @Override
    public String toString() {
        return "DVD -> " + super.toString() + " | Director: " + director;
    }
}