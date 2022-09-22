import javax.swing.*;

public class MatrizTranspuesta {

    private int matriz[][];

    private int fila;

    private int columna;

    private int valores;

    public MatrizTranspuesta()
    {
        fila = Integer.parseInt(JOptionPane.showInputDialog("Ingresar Fila"));

        columna = Integer.parseInt(JOptionPane.showInputDialog("Ingrese Columna"));

        this.matriz = new int[fila][columna];
    }

    public void agregarMatriz()
    {
        for (int fila=0; fila < this.matriz.length; fila++)
        {
            for (int columna=0; columna < this.matriz[fila].length; columna++)
            {
                this.valores = Integer.parseInt(JOptionPane.showInputDialog("Ingrese Valores"));

                this.matriz[fila][columna] = this.valores;
            }
        }
    }

    public void mostrarMatriz()
    {
        System.out.println("La matriz original es: ");
        for(int fila=0; fila < this.matriz.length; fila++)
        {
            for(int columna=0; columna < this.matriz[fila].length; columna++)
            {
                System.out.printf("%d ", this.matriz[fila][columna]);
            }

            System.out.println();
        }
    }

    public void transponerMatriz()
    {
        int[][] transpuesta = new int[matriz[0].length][matriz.length];
        System.out.println("La matriz Transpuesta es: ");
        for(int fila=0;fila<matriz.length;fila++){

            for(int columna=0;columna<this.matriz[fila].length;columna++){

                transpuesta[columna][fila] = matriz[fila][columna];

                System.out.printf("%d ", this.matriz[columna][fila]);

            }
            System.out.println();
        }
    }
    public static void main(String args[])
    {
        MatrizTranspuesta matrizT = new MatrizTranspuesta();

        matrizT.agregarMatriz();

        matrizT.mostrarMatriz();

        matrizT.transponerMatriz();
    }
}