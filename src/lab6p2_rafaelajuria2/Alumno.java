/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab6p2_rafaelajuria2;

/**
 *
 * @author rajur
 */
public class Alumno extends Usuario{
    int edad;
    int ID;
    String Carrera;
    int AñoEnCurso;
    double Promedio;
    String Facultad;
 
    public Alumno(int edad, int ID, String Carrera, int AñoEnCurso, double Promedio, String Facultad, String Nombre, String Apellido, int NumeroDeRegistro, String Username, String Password) {
        super(Nombre, Apellido, NumeroDeRegistro, Username, Password);
        this.edad = edad;
        this.ID = ID;
        this.Carrera = Carrera;
        this.AñoEnCurso = AñoEnCurso;
        this.Promedio = Promedio;
        this.Facultad = Facultad;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getCarrera() {
        return Carrera;
    }

    public void setCarrera(String Carrera) {
        this.Carrera = Carrera;
    }

    public int getAñoEnCurso() {
        return AñoEnCurso;
    }

    public void setAñoEnCurso(int AñoEnCurso) {
        this.AñoEnCurso = AñoEnCurso;
    }

    public double getPromedio() {
        return Promedio;
    }

    public void setPromedio(double Promedio) {
        this.Promedio = Promedio;
    }

    public String getFacultad() {
        return Facultad;
    }

    public void setFacultad(String Facultad) {
        this.Facultad = Facultad;
    }
    
    
    
}
