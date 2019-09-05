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
        String sql = "SELECT * FROM  usuarios WHERE  usuario =? and contraseña=?";
        try {
            con = cn.conexion();
            ps = con.prepareStatement(sql);
            ps.setString(1, User);
            ps.setString(2, contra);
            rs = ps.executeQuery();
            while (rs.next()) {
                u.setId(rs.getInt("id"));
                u.setUsuario(rs.getString("usuario"));
                u.setContraseña(rs.getString("contraseña"));
                u.setContraseña(rs.getString("nombre"));
                u.setContraseña(rs.getString("apellido"));

            }

        } catch (Exception e) {
        } 
        return u ;

    }
   
}
