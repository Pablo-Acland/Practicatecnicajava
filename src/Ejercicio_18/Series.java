package Ejercicio_18;

public class Series implements Entregable{
    private String titulo;
    private int NT=3;
    private boolean entregado=false;
    private String genero;
    private String creador;

    Series(){

    }

    Series(String titulo, String creador){
        this.titulo = titulo;
        this.creador = creador;
    }

    public Series(String titulo, int NT, String genero, String creador) {
        this.titulo = titulo;
        this.NT = NT;
        this.genero = genero;
        this.creador = creador;
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

    @Override
    public int compareTo(Object a) {
        Series S = (Series)a;

        if(NT > S.getNT()){
            return 1;
        }else if(NT == S.getNT()){
            return 0;
        }
        return -1;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getNT() {
        return NT;
    }

    public void setNT(int NT) {
        this.NT = NT;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getCreador() {
        return creador;
    }

    public void setCreador(String creador) {
        this.creador = creador;
    }

    @Override
    public String toString() {
        return "Serie{" +
                "titulo='" + titulo + '\'' +
                ", numeroDeTemporadas=" + NT +
                ", entregado=" + entregado +
                ", genero='" + genero + '\'' +
                ", creador='" + creador + '\'' +
                '}';
    }
}
