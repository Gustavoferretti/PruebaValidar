package Modelo;

import Config.Conexion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class UsuarioDAO {

    Conexion cn = new Conexion();
    Connection con;
    PreparedStatement ps;
    ResultSet rs;

    public Usuario Validar(String User, String contra) {

        Usuario u = new Usuario();
        String sql = "select * from usuarios where usuario ='"+User+"' and contraseña='"+contra+"'";
        try {
            con = cn.conexion();
            ps = con.prepareStatement(sql);
         
          rs = ps.executeQuery();
            while (rs.next()) {
                u.setId(rs.getInt(1));
                u.setUsuario(rs.getString(11));
                u.setContraseña(rs.getString(10));
                u.setNombre(rs.getString(2));
                u.setApellido(rs.getString(3));
                
            }

        } catch (Exception e) {
        } 
        return u ;

    }
   
}
