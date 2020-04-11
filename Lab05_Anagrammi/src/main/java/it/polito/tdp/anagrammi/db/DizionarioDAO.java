package it.polito.tdp.anagrammi.db;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class DizionarioDAO {
	
	public List<String> Creadizionario() {
		
		List<String> dizionario= new ArrayList<>();
		
		String sql = "SELECT nome FROM parola "; 
		
		try {
			Connection conn = ConnectDB.getConnection();
			PreparedStatement st = conn.prepareStatement(sql); 
			
			ResultSet rs = st.executeQuery();
			
			while(rs.next()) {
				String parola = rs.getString("nome"); 
				
				dizionario.add(parola); 
				
			}
			
			conn.close();
			
		}catch(SQLException e) {
			throw new RuntimeException(e); 
		}
		
		return dizionario; 
	

}
}
