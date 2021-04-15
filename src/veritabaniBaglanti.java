import com.mysql.jdbc.ConnectionGroup;
import java.sql.Connection;
import java.sql.DriverManager;


public class veritabaniBaglanti {
    
    public static Connection getConnection(){
    Connection  connection = null;
        try {
            Class.forName("com.mysq.jbdc.Driver");
            connection=DriverManager.getConnection("jbdc:mysql://localhost/kutuphane", "root" ,"");
            System.out.println("baglandi");
        } catch (Exception e) {
            System.err.println(e.getMessage());
        }
    
    return connection;
    }
    
}
