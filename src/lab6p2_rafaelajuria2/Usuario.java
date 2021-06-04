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
public class Usuario {
    String Nombre;
    String Apellido;
    int NumeroDeRegistro;
    String Username;
    String Password;

    public Usuario() {
    }
     

    public Usuario(String Nombre, String Apellido, int NumeroDeRegistro, String Username, String Password) {
        this.Nombre = Nombre;
        this.Apellido = Apellido;
        this.NumeroDeRegistro = NumeroDeRegistro;
        this.Username = Username;
        this.Password = Password;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getApellido() {
        return Apellido;
    }

    public void setApellido(String Apellido) {
        this.Apellido = Apellido;
    }

    public int getNumeroDeRegistro() {
        return NumeroDeRegistro;
    }

    public void setNumeroDeRegistro(int NumeroDeRegistro) {
        this.NumeroDeRegistro = NumeroDeRegistro;
    }

    public String getUsername() {
        return Username;
    }

    public void setUsername(String Username) {
        this.Username = Username;
    }

    public String getPassword() {
        return Password;
    }

    public void setPassword(String Password) {
        this.Password = Password;
    }
    
    
}
