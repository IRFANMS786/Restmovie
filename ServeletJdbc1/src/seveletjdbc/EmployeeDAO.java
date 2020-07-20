package seveletjdbc;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.ArrayList;
import java.util.List;

public class EmployeeDAO {

	// Singleton Design Pattern Implementation for Connection Object
	public static Connection getConnection() throws Exception {
		Connection con = null;
		Class.forName("com.mysql.cj.jdbc.Driver");
		if (con == null)
			return con = DriverManager.getConnection("jdbc:mysql://localhost:3306/employee", "root", "Irfan@007");
		else
			return con;
	}

	public static int saveEmployee(Employee mEmp) throws Exception {
		int status = 0;
		Connection con = EmployeeDAO.getConnection();
		PreparedStatement ps = con
				.prepareStatement("insert into empdb(name,email,password,country) values(?,?,?,?)");
		ps.setString(1, mEmp.getName());
		ps.setString(2, mEmp.getEmail());
		ps.setString(3, mEmp.getPassword());
		ps.setString(4, mEmp.getCountry());
		status = ps.executeUpdate();
		ps.close();
		return status;
	}
	
	public static int editEmployee(Employee mEmp) throws Exception {
		int status = 0;
		Connection con = EmployeeDAO.getConnection();
		
		return status;
	}
	
	public static int DeleteEmployee(int id) throws Exception
	{
		int status = 0;
		Connection con = EmployeeDAO.getConnection();
		PreparedStatement ps=con.prepareStatement("delete from empdb where id=?");
		ps.setInt(1, id);
		status = ps.executeUpdate();
		return status;
	}
	
	public static Employee getEmployeebyID(int id) throws Exception {
		Employee mEmployee = new Employee();
		Connection con = EmployeeDAO.getConnection();
		
		return mEmployee;
	}
	
	public static List<Employee> getAllEmployees() throws Exception {
		List<Employee> mList = new ArrayList<Employee>();
		Connection con = EmployeeDAO.getConnection();
		
		return mList;
	}
}
