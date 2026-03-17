public abstract class ItemBiblioteca {
    private String id;
    private String titulo;
    private boolean estadoPrestado;

    public ItemBiblioteca(String id, String titulo, boolean estadoPrestado) {
        this.id = id;
        this.titulo = titulo;
        this.estadoPrestado = estadoPrestado;
    }

    public String getId() {
        return id;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public boolean isEstadoPrestado() {
        return estadoPrestado;
    }

    public void prestar() {
        this.estadoPrestado = true;
    }

    public void devolver() {
        this.estadoPrestado = false;
    }

    public abstract double calcularMulta(int diasRetraso);
    public abstract int getDiasMaximosPrestamo();

    @Override
    public String toString() {
        return "ID: " + id + " | Título: " + titulo + " | Prestado: " + (estadoPrestado ? "Sí" : "No");
    }
}