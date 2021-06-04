/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab6p2_rafaelajuria2;

import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author rajur
 */
public class AdministradorAlumnos { 
    ArrayList<Alumno> AlumnosGuardados = new ArrayList();
    File Archivo = null;

    public AdministradorAlumnos(String path) {
        Archivo = new File(path);
    }

    public ArrayList<Alumno> getAlumnosGuardados() {
        return AlumnosGuardados;
    }

    public void setAlumnosGuardados(ArrayList<Alumno> AlumnosGuardados) {
        this.AlumnosGuardados = AlumnosGuardados;
    }

    public File getArchivo() {
        return Archivo;
    }

    public void setArchivo(File Archivo) {
        this.Archivo = Archivo;
    }
    
    public void WriteFile() throws IOException {
        FileWriter FileWrite = null;
        BufferedWriter BufferWrite = null;
        try {
            FileWrite = new FileWriter(Archivo, false);
            BufferWrite = new BufferedWriter(FileWrite);
            for (Alumno t : AlumnosGuardados) {
                BufferWrite.write(t.getEdad() + ";");
                BufferWrite.write(t.getID() + ";");
                BufferWrite.write(t.getCarrera() + ";");
                BufferWrite.write(t.getAñoEnCurso() + ";");
                BufferWrite.write(t.getPromedio() + ";");
                BufferWrite.write(t.getFacultad() + ";");
                BufferWrite.write(t.getNombre() + ";");
                BufferWrite.write(t.getApellido() + ";");
                BufferWrite.write(t.getNumeroDeRegistro() + ";");
                BufferWrite.write(t.getUsername() + ";");
                BufferWrite.write(t.getPassword() + ";");
            }
            BufferWrite.flush();
        } catch (Exception ex) {
        }
        BufferWrite.close();
        FileWrite.close();
    }
    
    public void LoadFile() {
        Scanner read = null;
        AlumnosGuardados = new ArrayList();
        if (Archivo.exists()) {
            try {
                read = new Scanner(Archivo);
                read.useDelimiter(";");
                while (read.hasNext()) {
                    AlumnosGuardados.add(new Alumno(read.nextInt(),read.nextInt(),read.next(),read.nextInt(),read.nextDouble(),read.next(),read.next(),read.next(),read.nextInt(),read.next(),read.next()));
                }
            } catch (Exception ex) {
            }
            read.close();
        }//FIN IF
    }
    
    
    
}
