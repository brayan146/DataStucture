package org.bjzz;


public class Main {

    public static void main(String[] args) {
        int numDiscos = 4; // Número de discos en la torre de Hanoi
        resolverTorreDeHanoi(numDiscos);
    }

    public static void resolverTorreDeHanoi(int numDiscos) {
        Stacks<Integer> torreOrigen = new Stacks<>();
        Stacks<Integer> torreDestino = new Stacks<>();
        Stacks<Integer> torreAuxiliar = new Stacks<>();

        // Llena la torre de origen con los discos
        for (int i = numDiscos; i >= 1; i--) {
            torreOrigen.push(i);
        }

        // Si el número de discos es par, intercambiar destino y auxiliar
        if (numDiscos % 2 == 1) {
            Stacks<Integer> temp = torreDestino;
            torreDestino = torreAuxiliar;
            torreAuxiliar = temp;
        }  else {
        // Si el número de discos es impar, intercambiar origen y auxiliar
        Stacks<Integer> temp = torreOrigen;
        torreOrigen = torreAuxiliar;
        torreAuxiliar = temp;
    }

        // Número total de movimientos
        int totalMovimientos = (int) (Math.pow(2, numDiscos) );

        // Itera sobre el número total de movimientos
        for (int i = 1; i <= totalMovimientos; i++) {
            if (i % 3 == 1) {
                moverDisco(torreOrigen, torreDestino, "origen", "destino");
            } else if (i % 3 == 2) {
                moverDisco(torreOrigen, torreAuxiliar, "origen", "auxiliar");
            } else if (i % 3 == 0) {
                moverDisco(torreAuxiliar, torreDestino, "auxiliar", "destino");
            }
        }
    }

    public static void moverDisco(Stacks<Integer> origen, Stacks<Integer> destino, String nombreOrigen, String nombreDestino) {
        if (!origen.isEmpty() && (destino.isEmpty() || origen.top() < destino.top())) {
            destino.push(origen.pop());
            imprimirTorres(nombreOrigen, nombreDestino, origen, destino);
        } else if (!destino.isEmpty() && (origen.isEmpty() || destino.top() < origen.top())) {
            origen.push(destino.pop());
            imprimirTorres(nombreDestino, nombreOrigen, destino, origen);
        }
    }

    public static void imprimirTorres(String origen, String destino, Stacks<Integer> torreOrigen, Stacks<Integer> torreDestino) {
        System.out.println("Moviendo disco de la torre " + origen + " a la torre " + destino);
        System.out.println("Torre " + origen + ": " + torreToString(torreOrigen));
        System.out.println("Torre " + destino + ": " + torreToString(torreDestino));
        System.out.println();
    }

    public static String torreToString(Stacks<Integer> torre) {
        if (torre.isEmpty()) {
            return "[]";
        } else {
            StringBuilder sb = new StringBuilder("[");
            for (int i = torre.size() - 1; i >= 0; i--) {
                sb.append(torre.get(i));
                if (i != 0) {
                    sb.append(", ");
                }
            }
            sb.append("]");
            return sb.toString();
        }
    }
}


