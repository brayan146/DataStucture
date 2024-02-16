package org.example.Sorts;

import org.example.Main;
import org.example.interfaces.IRunner;

import java.util.Scanner;

import static org.example.Sorts.QuickSort.quickSort;

public class QuickSortRunner implements IRunner {

    @Override
    public void run() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Cantidad de elementos a ordenar: ");
        int n = scanner.nextInt();
        int[] arr = new int[n];
        System.out.println("Ingrese los elementos: ");
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }
        System.out.println("Array desordenado: ");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        quickSort(arr, 0, arr.length - 1);
        System.out.println("Array ordenado: ");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        Main.main(null);
    }
}
