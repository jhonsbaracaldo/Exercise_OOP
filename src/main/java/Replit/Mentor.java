package Replit;

import java.util.ArrayList;
import java.util.List;

import java.util.List;

class Mentor extends Notas{

     private String id;

     private String name;

     private float yearsOfExperience;

     private  boolean isActive;

     private List<Course> coursesToTeach;

    public Mentor(String id, String name,int yearsOfExperience,boolean isActive) {
        super("","");
        this.id = id;
        this.name = name;
        this.yearsOfExperience = yearsOfExperience;
        this.isActive =isActive;
        this.coursesToTeach= coursesToTeach;
    }

    @Override
    public void notas(double a, double b) {
        super.notas(a, b);
        double suma = (a+b)/2;

        if(suma < 15)
        {
            System.out.println(" reprobado");
        }
        else {
            System.out.println("aprobado");
        }
        System.out.println(" la nota definitava del estudiante es "+suma     );
    }

    @Override
    public void cursos() {
        System.out.println(" el maestro dicta los siguientes cursos");
        String [] curso  = new String[3];
        curso[0]="Operating Systems ";
        curso[1]=" Algorithms";
        curso [2]="Arreglos";
        for ( int i=0;i<curso.length;i++){
            System.out.println(" cursos "+curso[i]);
        }
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

    public float getYearsOfExperience() {
        return yearsOfExperience;
    }

    public void setYearsOfExperience(int yearsOfExperience) {
        this.yearsOfExperience = yearsOfExperience;
    }

    public boolean isActive() {
        return isActive;
    }

    public void setActive(boolean active) {
        isActive = active;
    }

    public List<Course> getCoursesToTeach() {
        return coursesToTeach;
    }

    public void setCoursesToTeach(List<Course> coursesToTeach) {
        this.coursesToTeach = coursesToTeach;
    }

    @Override
    public String toString() {
        return "Mentor" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", yearsOfExperience=" + yearsOfExperience +
                ", isActive=" + isActive +
                ", coursesToTeach=" + coursesToTeach ;
    }


}



