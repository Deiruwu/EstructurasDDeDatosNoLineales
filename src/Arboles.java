public class Arboles {
    protected NodoBinario raiz;

    Arboles() {
        raiz = null;
    }

    Arboles(int elemento) {
        this.raiz = new NodoBinario(elemento);
    }

    public boolean estaVacia() {
        return raiz == null;
    }

    public int tamaño() {
        // Implementación pendiente
        return 0;
    }

    public void insertar(int elemento) {
        NodoBinario nuevo = new NodoBinario(elemento);
        if (estaVacia()) {
            raiz = nuevo;
            return;
        }

        NodoBinario actual = raiz;
        while (true) {
            if (elemento < actual.getElemento() && actual.getNodoIzq() == null) {
                actual.setNodoIzq(nuevo);
                return;
            } else if (elemento >= actual.getElemento() && actual.getNodoDer() == null) {
                actual.setNodoDer(nuevo);
                return;
            } else {
                actual = (elemento < actual.getElemento()) ? actual.getNodoIzq() : actual.getNodoDer();
            }
        }
    }

    public void eliminar(int elemento) {
        if (raiz == null) {
            System.out.println("El árbol está vacío.");
            return;
        }

        eliminarRecursivo(raiz, elemento);

    }

    private NodoBinario eliminarRecursivo(NodoBinario padre, int elemento) {
        if (padre == null) {
            System.out.println("No se encontró el valor a eliminar.");
            return null;
        }

        if (elemento < padre.getElemento()) {
            padre.setNodoIzq(eliminarRecursivo(padre.getNodoIzq(), elemento));

        } else if (elemento > padre.getElemento()) {
            padre.setNodoDer(eliminarRecursivo(padre.getNodoDer(), elemento));

        }

        // Nodo encontrado
        else {

            // Caso 1: Nodo sin hijos
            if (padre.getNodoIzq() == null && padre.getNodoDer() == null) {
                return null;

            }
            // Caso 2: Nodo con un solo hijo (derecho)
            else if (padre.getNodoIzq() == null) {
                return padre.getNodoDer();

            }
            // Caso 2: Nodo con un solo hijo (izquierdo)
            else if (padre.getNodoDer() == null) {
                return padre.getNodoIzq();

            }
            // Caso 3: Nodo con dos hijos
            else {
                NodoBinario sucesor = padre.getNodoDer();

                while (sucesor.getNodoIzq() != null) {
                    sucesor = sucesor.getNodoIzq();
                }

                padre.setElemento(sucesor.getElemento());
                padre.setNodoDer(eliminarRecursivo(padre.getNodoDer(), sucesor.getElemento()));
            }
            System.out.println("Valor eliminado.");
        }

        return padre;
    }
/*
    public NodoBinario busqueda(NodoBinario actual, int elemento) {
        if (actual == null || actual.getElemento() == elemento) {
            return actual;
        }
        return (elemento < actual.getElemento())
                ? busqueda(actual.getNodoIzq(), elemento)
                : busqueda(actual.getNodoDer(), elemento);
    }
*/
    public void imprimirArbol(NodoBinario nodo) {
        if (nodo != null) {
            imprimirArbol(nodo.getNodoIzq());
            System.out.print(nodo.getElemento() + " ");
            imprimirArbol(nodo.getNodoDer());
        }
    }
}
