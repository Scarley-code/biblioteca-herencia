public abstract class ItemBiblioteca {
    private String id;
    private String titulo;
    private boolean estadoPrestado;

    public ItemBiblioteca(String id, String titulo, boolean estadoPrestado) {
        this.id = id;
        this.titulo = titulo;
        this.estadoPrestado = false;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
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

    public void setEstadoPrestado(boolean estadoPrestado) {
        this.estadoPrestado = estadoPrestado;
    }

    public void prestar(boolean estadoPrestado) {
        estadoPrestado = true;
    }

    public void devolver(boolean estadoPrestado) {
        estadoPrestado = false;
    }

    public abstract double calcularMulta(int diasRetraso);
    public abstract int getDiasMaximosPrestamo();
}
