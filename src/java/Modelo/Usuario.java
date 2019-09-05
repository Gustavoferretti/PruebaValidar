/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;


public class Usuario {
    int id;
    String nombre;
    String apellido;
    int dni;
    int telefono;
    int edad;
    String sexo;
    String contraseña;
    String usuario;
    String mail;
    String ProfesoroAlumno;

    public Usuario() {
    }

    public Usuario(int id, String nombre, String apellido, int dni, int telefono, int edad, String sexo, String contraseña, String usuario, String mail, String ProfesoroAlumno) {
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
        this.dni = dni;
        this.telefono = telefono;
        this.edad = edad;
        this.sexo = sexo;
        this.contraseña = contraseña;
        this.usuario = usuario;
        this.mail = mail;
        this.ProfesoroAlumno = ProfesoroAlumno;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getDni() {
        return dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getContraseña() {
        return contraseña;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public String getProfesoroAlumno() {
        return ProfesoroAlumno;
    }

    public void setProfesoroAlumno(String ProfesoroAlumno) {
        this.ProfesoroAlumno = ProfesoroAlumno;
    }
    
    
}
