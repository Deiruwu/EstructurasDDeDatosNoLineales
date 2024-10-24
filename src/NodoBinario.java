public class NodoBinario{
    private String elemento;
    private NodoBinario nodoIzq;
    private NodoBinario nodoDer;

    public NodoBinario(String valor){
        this(valor,null,null);
    }

    public NodoBinario(String valor, NodoBinario izq, NodoBinario der) {
        elemento = valor;
        nodoIzq = izq;
        nodoDer = der;
    }

    public String getElemento() {
        return elemento;
    }

    public void setElemento(String elemento) {
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