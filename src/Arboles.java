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

    public void insertar(int elemento) {
        NodoBinario actual = raiz;
        while(actual.getNodoIzq() != null && actual.getNodoIzq() != null{
            actual = (elemento < actual.getElemento()) ? actual.getNodoIzq() : actual.getNodoDer();
        }

        if (elemento < raiz {
            actual.setNodoIzq(elemento);
        } else {
            actual.setNodoDer(elemento);
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
