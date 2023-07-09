package Alumno;

public class Asignatura {

   private String nombreAsig;
   private float nota;


    public Asignatura(String nombreAsig, float nota) {
        this.nombreAsig = nombreAsig;
        this.nota = nota;
    }

    public String getNombreAsig() {
        return nombreAsig;
    }

    public void setNombreAsig(String nombreAsig) {
        this.nombreAsig = nombreAsig;
    }

    public float getNota() {
        return nota;
    }

    public void setNota(float nota) {
        this.nota = nota;
    }

    public String aprobado(){
        if (nota >= 3.5){
            return "Aprobado";
        }else{
            return "Reprobado";
        }
    }
}
