public class NodoBinario{
    private int elemento;
    private NodoBinario nodoIzq;
    private NodoBinario nodoDer;

    public NodoBinario(int valor){
        this(valor,null,null);
    }

    public NodoBinario(int valor, NodoBinario izq, NodoBinario der) {
        elemento = valor;
        nodoIzq = izq;
        nodoDer = der;
    }

    public int getElemento() {
        return elemento;
    }

    public void setElemento(int elemento) {
        this.elemento = elemento;
    }

    public NodoBinario getNodoIzq() {
        return nodoIzq;
    }

    public void setNodoIzq(NodoBinario nodoIzq) {
        this.nodoIzq = nodoIzq;
    }

    public NodoBinario getNodoDer() {
        return nodoDer;
    }

    public void setNodoDer(NodoBinario nodoDer) {
        this.nodoDer = nodoDer;
    }
}