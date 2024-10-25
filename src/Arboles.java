import javax.swing.*;

public class Arboles {
    protected NodoBinario raiz;

    Arboles(){
        raiz = null;
    }

    Arboles(int elemento) {
        this.raiz = new NodoBinario(elemento);
    }

    public boolean estaVacia() {
        return raiz == null;
    }

    public int tamaño(){

        return 0;
    }
    /**
     * Balance del árbol: Esta lógica funciona bien para la inserción, pero ten en cuenta que, con el tiempo, si el árbol no está balanceado,
     * podría degenerarse en una lista vinculada, causando que la inserción (y las búsquedas) tomen O(n). Si eso es una preocupación, puedes
     * considerar implementar una estructura balanceada como un árbol AVL o un árbol rojo-negro.
     */

    public void insertar(int elemento) {
        NodoBinario nuevo = new NodoBinario(elemento);
        if(raiz == null) {
            raiz = nuevo;
            return;
        }
        NodoBinario actual = raiz;
        while(true){
            if (elemento < actual.getElemento() && actual.getNodoIzq() == null) {
                actual.setNodoIzq(nuevo);
                return;
            } else if (actual.getNodoDer() == null) {
                actual.setNodoDer(nuevo);
                return;
            }
            actual = (elemento < actual.getElemento()) ? actual.getNodoIzq() : actual.getNodoDer();
        }
    }


    public void eliminar(int elemento) {
        if (raiz == null) {
            return;
        }
        NodoBinario actual = busqueda(raiz, elemento);
        if (actual == null) {
            return;
        }

        NodoBinario aux = (elemento < actual.getElemento()) ? actual.getNodoIzq() : actual.getNodoDer();

            // Caso 1: Nodo sin hijos
            if (aux.getNodoIzq() == null && aux.getNodoDer() == null) {
                actual.setNodoIzq(null);


            } // Caso 2: Nodo con un solo hijo
            else if ((aux.getNodoIzq() == null && aux.getNodoDer() != null) || (aux.getNodoIzq() != null && aux.getNodoDer() == null)) {

                if (null == aux.getNodoIzq()) {
                    actual.setNodoIzq(aux.getNodoIzq());
                } else {
                    actual.setNodoDer(aux.getNodoDer());
                }

            }// Caso 3: Nodo con dos hijos
            else {

            }
    }

    private NodoBinario encontrarSucesor(NodoBinario nodo) {
        while (nodo.getNodoIzq() != null) {
            nodo = nodo.getNodoIzq();
        }
        return nodo;
    }

    public NodoBinario busqueda(NodoBinario actual, int elemento) {
        if (actual == null) {
            return null;
        }
        if (actual.getNodoIzq().getElemento() == elemento || actual.getNodoDer().getElemento() == elemento) {
            return actual; // Devuelve el nodo actual si es igual al elemento buscado
        }
        // Continúa la búsqueda en el subárbol correspondiente
        return (elemento < actual.getElemento()) ? busqueda(actual.getNodoIzq(), elemento) : busqueda(actual.getNodoDer(), elemento);
    }


    public void imprimirArbol(NodoBinario nodo) {
        if (nodo != null) {
            imprimirArbol(nodo.getNodoIzq());
            System.out.print(nodo.getElemento() + " ");
            imprimirArbol(nodo.getNodoDer());
        }
    }

    /*  Atributos:
    *   Lado izquierdo deben ser menores a la raiz, a la derecha tienen que ser mayores o igual a la raiz.
    *
    *
    *   Metodos:
    *
    *   insertar
    *   eliminar
    *   recorrido
    *   
    *
    * */
}
