import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class DemoDB {

	public static void main(String[] args) {
		try {
			Class.forName("org.postgresql.Driver");
			Connection c = DriverManager.getConnection("jdbc:postgresql://localhost:5432/postgres", "postgres", "123456");
			PreparedStatement ps = c.prepareStatement("insert into public.\"teste\" (num, nome) values (1, 'nome');");
			ps.executeUpdate();
			PreparedStatement ps1 = c.prepareStatement("select * from public.teste");
			ResultSet rs1 = ps1.executeQuery();
			while (rs1.next()) 
				System.out.println(rs1.getInt(1) + " " + rs1.getString(2));
		} catch(Exception e) {
			System.err.println(e.getMessage());
		}

	}

}
