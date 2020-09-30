package Practico6;

import java.util.ArrayList;

public class Matriz {
       
    public void armar(){
        int arreglo[][] = new int[4][];
        arreglo[0] = new int[4];
        arreglo[1] = new int[3];
        arreglo[2] = new int[5];
        arreglo[3] = new int[2];
        
        ArrayList<Integer> fila1 = new ArrayList<>();
        ArrayList<Integer> fila2 = new ArrayList<>();
        ArrayList<Integer> fila3 = new ArrayList<>();
        ArrayList<Integer> fila4 = new ArrayList<>();
        

        int num = 3;
        for (int f = 0; f < arreglo.length; f++){
            
            for (int c = 0; c <  arreglo[f].length; c++){
                arreglo[f][c] = num;
                if (arreglo[f][c]%2 == 0){
                   switch (f) {
                   case 0: fila1.add(num);
                   break;
                   case 1: fila2.add(num);
                   break;
                   case 2: fila3.add(num);
                   break;
                   case 3: fila4.add(num);
                   break;
                   }
                }
                num+=3; 
                System.out.print(arreglo[f][c]+" ");
                
            }
            System.out.println();
        }
        System.out.println("Fila 1: "+fila1);
        System.out.println("Fila 1: "+fila2);
        System.out.println("Fila 1: "+fila3);
        System.out.println("Fila 1: "+fila4);
    }


}