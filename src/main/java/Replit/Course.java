package Replit;

class Course implements Acciones {

    private String name;

    private String code;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public int getCredits() {
        return credits;
    }

    public void setCredits(int credits) {
        this.credits = credits;
    }

    private int credits;


    public Course(String name, String code, int credits) {

        this.name = name;
        this.code = code;
        this.credits = credits;
    }

    @Override
    public String toString() {
        return "Course{" +
                "name='" + name + '\'' +
                ", code='" + code + '\'' +
                ", credits=" + credits +
                '}';
    }

    @Override
    public void notas(double nota1, double nota2) {
        System.out.println(" recuerde que la nota minima debe supera el numero 15");

    }

    @Override
    public void cursos() {
          String [] curso  = new String[3];

          curso[0]="Operating Systems ";
          curso[1]=" Algorithms";
          curso [2]="Arreglos";

          for ( int i=0;i<curso.length;i++){
              System.out.println(" cursos "+curso[i]);
          }
    }
}