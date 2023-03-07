package unam.fes.poo.tarea6;

public class MxtxNovels {
    private String novela;
    private int año;
    private String autor;
    private double precio;
    private int numvolumenes;
    
    //constructor vacio
    public MxtxNovels() {    
    }

    //constructor
    public MxtxNovels(String novela, int año, String autor, double precio, int numvolumenes) {
        this.novela = novela;
        this.año = año;
        this.autor = autor;
        this.precio = precio;
        this.numvolumenes = numvolumenes;
    }
    
    //Getters y setters
    public String getNovela() {
        return novela;
    }

    public void setNovela(String novela) {
        this.novela = novela;
    }

    public int getAño() {
        return año;
    }

    public void setAño(int año) {
        this.año = año;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public int getNumvolumenes() {
        return numvolumenes;
    }

    public void setNumvolumenes(int numvolumenes) {
        this.numvolumenes = numvolumenes;
    } 

    @Override
    public String toString() {
        return "MxtxNovels{" + "novela=" + novela + ", a\u00f1o=" + año + ", autor=" + autor + ", precio=" + precio + ", numvolumenes=" + numvolumenes + '}';
    }
    
}
