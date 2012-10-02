package belajar.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class App 
{
    public static void main( String[] args )
    {
        try{
			//parameter yang dikirim adalah host, port, dbname, dbuser, dbpaswd
			Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/belajar","root","");
			String query ="insert into mahasiswa (nim, nama) values(?,?)";
			PreparedStatement st = conn.prepareStatement(query);
			st.setString(1, "4510210003");
			st.setString(2, "Irvan Abdurrahman");
			st.executeUpdate();
		}catch (SQLException ex){
			Logger.getLogger(App.class.getName()).log(Level.SEVERE,null, ex);
		}
    }
}
