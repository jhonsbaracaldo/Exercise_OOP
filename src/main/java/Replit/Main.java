package Replit;

import java.util.Scanner;

class Main {


    public static void main(String[] args) {
        Scanner impresion = new Scanner(System.in);
        System.out.println(" seleccione su rol \n1.Estudiante \n2.Profesor\n3.Ver asignaturas calificada");
        int seleccion;
        seleccion = impresion.nextInt();
        switch(seleccion)
        {
            case 1:
                System.out.println(" Estudiante ");
                Student student = new Student("2070782","Santiago C");
                Course course = new Course("Algorithms", "ALGO", 100);
                Course course2 = new Course("Operating Systems", "OSP", 80);
                student.enrroll(course);
                student.enrroll(course2);
                System.out.println(student);

                break;


            case 2:
        Mentor mentor = new Mentor("0130","juan jose",10,true);
        mentor.notas(10,12);
        mentor.cursos();
        System.out.println(mentor);
         break;

         case 3 :
             Course cours = new Course("Algorithms", "ALGO", 100);
             cours.cursos();
          break;



        }
    }

}