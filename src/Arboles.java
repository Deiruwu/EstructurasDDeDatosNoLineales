public class Arboles {
    protected NodoBinario raiz;

    Arboles(){
        raiz = null;
    }

    Arboles(String elemento) {
        this.raiz = new NodoBinario(elemento);
    }

    public boolean estaVacia() {
        return raiz == null;
    }


}
