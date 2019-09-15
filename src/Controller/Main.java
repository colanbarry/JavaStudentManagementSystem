package Controller;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import View.mainView;
import javafx.application.Application;
import javafx.stage.Stage;
import java.sql.*;
// TODO: Auto-generated Javadoc

/**
 * The Class Main.
 */
public class Main extends Application{
	
	/* (non-Javadoc)
	 * @see javafx.application.Application#start(javafx.stage.Stage)
	 */
	@Override
	public void start(Stage primaryStage) throws Exception {
	mainView.conPane(primaryStage);
	primaryStage.show();
		
	}

	/**
	 * The main method.
	 *
	 * @param args the arguments
	 */
	public static void main(String[] args) {
		// Was using this to test connection. Had issues with time zone
		/*try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			
		}catch (ClassNotFoundException e){
			System.out.println("Driver not found");
			e.printStackTrace();
			return;
		}
		Connection conn;
		
		try{
			conn = DriverManager.getConnection("jdbc:mysql://localhost/oopproject?useTimezone=true&serverTimezone=UTC","root", null);
					System.out.println("Connection successful");
		}catch (SQLException e){
			System.out.println("Connection Failed");
			e.printStackTrace();
			return;
		}
		Query qry = new Query();
	       qry.Query(conn);
	*/
		launch(args);
	}

	

}
