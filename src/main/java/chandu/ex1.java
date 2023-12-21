package chandu;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class ex1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String db="jdbc:ucanaccess://Database8.accdb";
		   try {
			  Connection con = DriverManager.getConnection(db);
			  System.out.println("connected to database");
			  Statement stm=con.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE,ResultSet.CONCUR_UPDATABLE,ResultSet.TYPE_FORWARD_ONLY);
			  ResultSet rs=stm.executeQuery("select * from the Table1");
			  
			  rs.first();
			  System.out.println(rs.getString("Name")+""+rs.getInt("sem"));
			  
			  rs.next();
			  System.out.println(rs.getString("Name")+""+rs.getInt("sem"));
			  
			  rs.relative(+2);
			  System.out.println(rs.getString("Name")+""+rs.getInt("sem"));
			  
			  rs.absolute(2);
			  System.out.println(rs.getString("Name")+""+rs.getInt("sem"));
			  //System.out.println(""+rs.getRow());
			  rs.previous();
			  System.out.println(rs.getString("Name")+""+rs.getInt("sem"));
			  
			  rs.last();
			  System.out.println(rs.getString("Name")+""+rs.getInt("sem"));
		   }
		   catch(Exception e) {
			   System.out.println(e);
			   
		   
		   }
	   
	}

}
