package Database;
import java.sql.*;

// TODO: Auto-generated Javadoc
/**
 * The Class Insert.
 */
public class Insert {

	/**
	 * Adds the student.
	 *
	 * @param firstName the first name
	 * @param middleName the middle name
	 * @param lastName the last name
	 * @param emailAdd the email add
	 * @param phoneNum the phone num
	 * @param dob the dob
	 */
	public static void addStudent(String firstName, String middleName, String lastName, String emailAdd, String phoneNum, String dob){
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");

		}catch (ClassNotFoundException e){
			System.out.println("Driver not found");
			e.printStackTrace();
			return;
		}
		Connection conn;

		try{
			conn = DriverManager.getConnection("jdbc:mysql://localhost/oopproject?useTimezone=true&serverTimezone=UTC","root", null);
		}catch (SQLException e){
			System.out.println("Connection Failed");
			e.printStackTrace();
			return;
		}

		if (conn != null){
			PreparedStatement addStudent;
			try {
				addStudent = conn.prepareCall("INSERT INTO student(firstName, middleName, lastName, emailAdd, phoneNum, dob) VALUES(?, ?, ?, ?, ?, ?)");

				addStudent.setString(1, firstName);
				addStudent.setString(2, middleName);
				addStudent.setString(3, lastName);
				addStudent.setString(4, emailAdd);
				addStudent.setString(5, phoneNum);
				addStudent.setString(6, dob);

				int i = addStudent.executeUpdate();
				conn.close();
			} catch (SQLException e) {

				e.printStackTrace();
			}
		}
	}
	
	/**
	 * Adds the module.
	 *
	 * @param moduleName the module name
	 */
	public static void addModule(String moduleName){
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");

		}catch (ClassNotFoundException e){
			System.out.println("Driver not found");
			e.printStackTrace();
			return;
		}
		Connection conn;

		try{
			conn = DriverManager.getConnection("jdbc:mysql://localhost/oopproject?useTimezone=true&serverTimezone=UTC","root", null);
		}catch (SQLException e){
			System.out.println("Connection Failed");
			e.printStackTrace();
			return;
		}

		if (conn != null){
			PreparedStatement addModule;
			try {
				addModule = conn.prepareCall("INSERT INTO modules(moduleName) VALUES(?)");

				addModule.setString(1, moduleName);


				int i = addModule.executeUpdate();
				conn.close();
			} catch (SQLException e) {

				e.printStackTrace();
			}
		}
	}
	
	/**
	 * Removes the student.
	 *
	 * @param personID the person ID
	 */
	public static void removeStudent(int personID){
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");

		}catch (ClassNotFoundException e){
			System.out.println("Driver not found");
			e.printStackTrace();
			return;
		}
		Connection conn;
		try{
			conn = DriverManager.getConnection("jdbc:mysql://localhost/oopproject?useTimezone=true&serverTimezone=UTC","root", null);
		}catch (SQLException e){
			System.out.println("Connection Failed");
			e.printStackTrace();
			return;
		}
		if (conn != null){
			PreparedStatement removeStudent;
			try{
				removeStudent = conn.prepareCall("DELETE FROM student where personID = ?");	
				removeStudent.setInt(1,  personID);
				int i= removeStudent.executeUpdate();
				conn.close();
			}catch (SQLException e){
				e.printStackTrace();
			}
		}
	}
	
	/**
	 * Adds the teacher.
	 *
	 * @param firstName the first name
	 * @param middleName the middle name
	 * @param lastName the last name
	 * @param emailAdd the email add
	 * @param phoneNum the phone num
	 * @param degreeQual the degree qual
	 */
	public static void addTeacher(String firstName, String middleName, String lastName, String emailAdd, String phoneNum, String degreeQual){
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");

		}catch (ClassNotFoundException e){
			System.out.println("Driver not found");
			e.printStackTrace();
			return;
		}
		Connection conn;

		try{
			conn = DriverManager.getConnection("jdbc:mysql://localhost/oopproject?useTimezone=true&serverTimezone=UTC","root", null);
		}catch (SQLException e){
			System.out.println("Connection Failed");
			e.printStackTrace();
			return;
		}

		if (conn != null){
			PreparedStatement addTeacher;
			try {
				addTeacher = conn.prepareCall("INSERT INTO teacher(firstName, middleName, lastName, emailAdd, phoneNum, degreeQual) VALUES(?, ?, ?, ?, ?, ?)");

				addTeacher.setString(1, firstName);
				addTeacher.setString(2, middleName);
				addTeacher.setString(3, lastName);
				addTeacher.setString(4, emailAdd);
				addTeacher.setString(5, phoneNum);
				addTeacher.setString(6, degreeQual);

				int j = addTeacher.executeUpdate();
				conn.close();
			} catch (SQLException e) {

				e.printStackTrace();
			}
		}
	}
	
	/**
	 * Update teacher.
	 *
	 * @param degreeQual the degree qual
	 * @param personID the person ID
	 */
	public static void updateTeacher(String degreeQual, String personID) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");

		}catch (ClassNotFoundException e){
			System.out.println("Driver not found");
			e.printStackTrace();
			return;
		}
		Connection conn;
		try{
			conn = DriverManager.getConnection("jdbc:mysql://localhost/oopproject?useTimezone=true&serverTimezone=UTC","root", null);
		}catch (SQLException e){
			System.out.println("Connection Failed");
			e.printStackTrace();
			return;
		}
		if (conn != null){
			PreparedStatement updateTeacher;
		try {
			
			updateTeacher = conn.prepareCall(" Update teacher set degreeQual = ? where personID = ?");
			updateTeacher.setString(1, degreeQual);
			updateTeacher.setString(2, personID);
			int j = updateTeacher.executeUpdate();
			conn.close();
			
		}catch (Exception io) {
			System.out.println("Error" +io);
		}
	}
	}
	
	/**
	 * Adds the class.
	 *
	 * @param className the class name
	 */
	public static void addClass(String className){
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");

		}catch (ClassNotFoundException e){
			System.out.println("Driver not found");
			e.printStackTrace();
			return;
		}
		Connection conn;

		try{
			conn = DriverManager.getConnection("jdbc:mysql://localhost/oopproject?useTimezone=true&serverTimezone=UTC","root", null);
		}catch (SQLException e){
			System.out.println("Connection Failed");
			e.printStackTrace();
			return;
		}

		if (conn != null){
			PreparedStatement addClass;
			try {
				addClass = conn.prepareCall("INSERT INTO school(className) VALUES(?)");

				addClass.setString(1, className);
				

				int j = addClass.executeUpdate();
				conn.close();
			} catch (SQLException e) {

				e.printStackTrace();
			}
		}
	}
	
	/**
	 * Removes the class.
	 *
	 * @param classID the class ID
	 */
	public static void removeClass(int classID){
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");

		}catch (ClassNotFoundException e){
			System.out.println("Driver not found");
			e.printStackTrace();
			return;
		}
		Connection conn;
		try{
			conn = DriverManager.getConnection("jdbc:mysql://localhost/oopproject?useTimezone=true&serverTimezone=UTC","root", null);
		}catch (SQLException e){
			System.out.println("Connection Failed");
			e.printStackTrace();
			return;
		}
		if (conn != null){
			PreparedStatement removeClass;
			try{
				removeClass = conn.prepareCall("DELETE FROM school where classID = ?");	
				removeClass.setInt(1,  classID);
				int i= removeClass.executeUpdate();
				conn.close();
			}catch (SQLException e){
				e.printStackTrace();
			}
		}
	}
	
}
