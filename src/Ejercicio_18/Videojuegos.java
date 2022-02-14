package Ejercicio_18;

public class Videojuegos implements Entregable{
    private String titulo;
    private int HE=10;
    private boolean entregado=false;
    private String genero;
    private String compania;

    Videojuegos(){

    }

    public Videojuegos(String titulo, int HE) {
        this.titulo = titulo;
        this.HE = HE;
    }

    public Videojuegos(String titulo, int HE, String genero, String compania) {
        this.titulo = titulo;
        this.HE = HE;
        this.genero = genero;
        this.compania = compania;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getHE() {
        return HE;
    }

    public void setHE(int HE) {
        this.HE = HE;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getCompania() {
        return compania;
    }

    public void setCompania(String compania) {
        this.compania = compania;
    }

    @Override
    public boolean entregado()
    {
        return true;
    }

    @Override
    public boolean devolver()
    {
        return false;
    }

    @Override
    public boolean isEntregado() {
        if(entregado()){
            return true;
        }
        return false;
    }
    public int compareTo(Object a) {
        Videojuegos VJ= (Videojuegos)a;

        if(HE > VJ.getHE()){
            return 1;
        }else if(HE== VJ.getHE()){
            return 0;
        }
        return -1;
    }

    @Override
    public String toString() {
        return "Videojuego{" +
                "titulo='" + titulo + '\'' +
                ", horasEstimadas=" + HE +
                ", entregado=" + entregado +
                ", genero='" + genero + '\'' +
                ", compania='" + compania + '\'' +
                '}';
    }
}
