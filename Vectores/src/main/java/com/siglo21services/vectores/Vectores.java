

package com.siglo21services.vectores;


public class Vectores {

    public static void main(String[] args) {
        //Tener un vector que guarde una serie de 8 nombres
        
        String vector[] = new String [8];
        //Asignacion manual de nombres
        vector[0] = "Beisbol";
        vector[1] = "Futbol";
        vector[2] = "Basketbol";
        vector[3] = "Volleyball";
        vector[4] = "Hockey";
        vector[5] = "Esgrima";
        vector[6] = "Karate";
        vector[7] = "Aikido";
        
        //Recorrido
        for(int i = 0; i<vector.length; i++){
            System.out.println("En la posicion " + i + " esta el numero: "+vector[i]);
        }
        
    }
}
