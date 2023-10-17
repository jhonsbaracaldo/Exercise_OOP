package Replit;

import java.util.Scanner;

public abstract class Notas implements Acciones {

   private  String id,name;
   private float averageGrade;

    public Notas(String id, String name) {
        this.id = id;
        this.name = name;


    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getAverageGrade() {
        return averageGrade;
    }

    public void setAverageGrade(float averageGrade) {
        this.averageGrade = averageGrade;
    }



    @Override
    public void notas( double a, double b ) {
     double suma = (a+b)/2;
        System.out.println("total de la operacion  "+suma);



    }



}
