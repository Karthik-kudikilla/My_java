import java.sql.*;


public class second {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/mycompany","root","root");
		//Statement st=con.createStatement();
		Statement st=con.createStatement();
		ResultSet rs=st.executeQuery("select *from practice");
	while(rs.next()) {
		System.out.println(rs.getInt("id")+" :"+rs.getString("name"));
	}
	
	
	PreparedStatement ps=con.prepareStatement("insert into practice values(?,?)");
	ps.setInt(1, 104);
	ps.setString(2, "kavery");
	ps.executeUpdate();
		
	rs=st.executeQuery("select *from practice");
	while(rs.next()) {
		System.out.println(rs.getInt("id")+" :"+rs.getString("name"));
	}
	
		st.close();
		con.close();
	}

}
