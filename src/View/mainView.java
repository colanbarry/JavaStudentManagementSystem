package View;

import Model.Student;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Tab;
import javafx.scene.control.TabPane;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import java.sql.*;

// TODO: Auto-generated Javadoc
/**
 * The Class mainView.
 */
public class mainView {

	/**
	 * Con pane.
	 * constructs the gui
	 * @param primaryStage the primary stage
	 */
	public static void conPane(Stage primaryStage){

		TabPane main = new TabPane();
		Tab tabs = new Tab("Sudents");
		TextArea tas = new TextArea();
		tas.setEditable(false);
		TextField sFName = new TextField();
		sFName.setMaxWidth(200);
		sFName.setPromptText("Student First Name");
		TextField sMName = new TextField();
		sMName.setMaxWidth(200);
		sMName.setPromptText("Student Middle Name");
		TextField sLName = new TextField();
		sLName.setMaxWidth(200);
		sLName.setPromptText("Student Last Name");
		TextField email = new TextField();
		email.setMaxWidth(200);
		email.setPromptText("Student Email Address");
		TextField pNum = new TextField();
		pNum.setMaxWidth(200);
		pNum.setPromptText("Student Phone Number");
		TextField sdob = new TextField();
		sdob.setMaxWidth(200);
		sdob.setPromptText("Student Date of Birth");
		Button addStu = new Button("Add Student");  
		addStu.setMinWidth(200);
		Button disStu = new Button("Display Students");                     
		disStu.setMinWidth(200);
		Button exits = new Button("Exit");                                    
		exits.setMinWidth(50);
		Button delS = new Button("Delete Student");
		delS.setMinWidth(50);
		TextField delSt = new TextField();
		delSt.setPromptText("Student ID");

		Tab tabt = new Tab("Teachers");
		TextArea tat = new TextArea();
		tat.setEditable(false);
		TextField tFName = new TextField();
		tFName.setMaxWidth(200);
		tFName.setPromptText("Teacher First Name");
		TextField tMName = new TextField();
		tMName.setMaxWidth(200);
		tMName.setPromptText("Teacher Middle Name");
		TextField tLName = new TextField();
		tLName.setMaxWidth(200);
		tLName.setPromptText("Teacher Last Name");
		TextField emailT = new TextField();
		emailT.setMaxWidth(200);
		emailT.setPromptText("Teacher Email Address");
		TextField tpNum = new TextField();
		tpNum.setMaxWidth(200);
		tpNum.setPromptText("Teacher Phone Number");
		TextField degQual = new TextField();
		degQual.setMaxWidth(200);
		degQual.setPromptText("Degree Qualification"); 
		Button addTea = new Button("Add Teacher");                     
		addTea.setMinWidth(200);  
		Button disTea = new Button("Display Teacher");                     
		disTea.setMinWidth(200);
		Button exitt = new Button("Exit");                                    
		exitt.setMinWidth(50);
		TextField tID = new TextField();
		tID.setPromptText("Teacher ID");
		TextField degType = new TextField();
		degType.setPromptText("Degree Type");
		Button upT = new Button("Update Degree");
		upT.setMinWidth(50);


		Tab tabm = new Tab("Modules");
		TextArea tam = new TextArea();
		tam.setEditable(false);
		Button disM = new Button("Display Modules");
		disM.setMinWidth(200);
		Button addM = new Button ("Add Module");
		addM.setMinWidth(200);
		TextField mName = new TextField();
		mName.setMaxWidth(200);
		mName.setPromptText("Module Name");
		Button exitM = new Button("Exit");
		exitM.setMinWidth(50);
		
		Tab tabc = new Tab("Classes");
		TextArea tac = new TextArea();
		tac.setEditable(false);
		Button addC = new Button("Add Class");
		addC.setMaxWidth(200);
		TextField cName = new TextField();
		cName.setPromptText("Class name");
		cName.setMaxWidth(200);
		Button exitC = new Button("Exit");
		exitC.setMaxWidth(200);
		Button disC = new Button("Display Classes");
		disC.setMaxWidth(200);
		Button delC = new Button("Delete Class");
		delC.setMinWidth(50);
		TextField delCl = new TextField();
		delCl.setPromptText("Class ID");
		
		


		HBox hbox1 = new HBox();
		HBox hbox2 = new HBox();
		HBox hbox3 = new HBox();
		
		main.getTabs().addAll(tabs, tabt, tabm, tabc);
		
		VBox vbox1 = new VBox();
		VBox vbox2 = new VBox();
		VBox vbox3 = new VBox();
		VBox vbox4 = new VBox();
		
		Scene mainPage = new Scene(main, 1280, 720);
		hbox1.getChildren().addAll(delS, delSt);
		hbox1.setAlignment(Pos.BOTTOM_CENTER);
		hbox2.getChildren().addAll(upT, tID, degType);
		hbox2.setAlignment(Pos.BOTTOM_CENTER);
		hbox3.getChildren().addAll(delC, delCl);
		hbox3.setAlignment(Pos.BOTTOM_CENTER);
		
		vbox1.getChildren().addAll(tas, sFName, sMName, sLName, email, pNum, sdob,  addStu, disStu, hbox1,  exits);
		vbox1.setAlignment(Pos.TOP_CENTER);
		vbox2.getChildren().addAll(tat, tFName, tMName, tLName, emailT, tpNum, degQual, addTea, disTea, hbox2, exitt);
		vbox2.setAlignment(Pos.TOP_CENTER);
		vbox3.getChildren().addAll(tam, mName, addM, disM, exitM);
		vbox3.setAlignment(Pos.TOP_CENTER);
		vbox4.getChildren().addAll(tac, cName, addC, disC, hbox3, exitC);
		vbox4.setAlignment(Pos.TOP_CENTER);
		
		tabs.setContent(vbox1);
		tabt.setContent(vbox2);
		tabm.setContent(vbox3);
		tabc.setContent(vbox4);



		primaryStage.setTitle("Project");                                          
		primaryStage.setScene(mainPage);                                                    
		primaryStage.show();  
		tas.requestFocus();
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
			System.out.println("Connection successful");
		}catch (SQLException e){
			System.out.println("Connection Failed");
			e.printStackTrace();
			return;
		}


		addStu.setOnAction(e-> {

			String firstName = sFName.getText();
			String middleName = sMName.getText();
			String lastName = sLName.getText();
			String emailAdd = email.getText();
			String phoneNum = pNum.getText();
			String dob = sdob.getText();
			Database.Insert.addStudent(firstName, middleName, lastName, emailAdd, phoneNum, dob);
			sFName.clear();
			sMName.clear();
			sLName.clear();
			email.clear();
			pNum.clear();
			sdob.clear();
			tas.clear();
		});
		
		disStu.setOnAction(e-> {
			try {

				Statement st = conn.createStatement();
				String qy = "Select * from student";
				ResultSet rs = st.executeQuery(qy);	

				while( rs.next()){ 
					tas.appendText( rs.getString(1)+" : "+rs.getString(2)+" "
							+rs.getString(3)+"  "+rs.getString(4)+" , "+rs.getString(5)+" , "
							+rs.getString(6)+" , "+rs.getString(7)+"\n"); 

					//just for testing
					/*System.out.print( rs.getString(1));     
	                System.out.print("    " + rs.getString(2));          
	                System.out.print("    " + rs.getString(3));
	                System.out.print("    " + rs.getString(4));
	                System.out.print("    " + rs.getString(5));
	                System.out.println("    " + rs.getString(6));
	                System.out.println(""); */
				}				


			}catch(Exception io) {

				System.out.println("Error" +io);
			}	    
		});

		addTea.setOnAction(e-> {
			String firstName = tFName.getText();
			String middleName = tMName.getText();
			String lastName = tLName.getText();
			String emailAdd = emailT.getText();
			String phoneNum = tpNum.getText();
			String degreeQual = degQual.getText();
			Database.Insert.addTeacher(firstName, middleName, lastName, emailAdd, phoneNum, degreeQual);
			tFName.clear();
			tMName.clear();
			tLName.clear();
			emailT.clear();
			tpNum.clear();
			degQual.clear();
			tat.clear();
		});

		disTea.setOnAction(e-> {
			try {

				Statement st = conn.createStatement();
				String qy = "Select * from teacher";
				ResultSet rs = st.executeQuery(qy);	
				while(rs.next()){  
					tat.appendText( rs.getString(1)+" : "+rs.getString(2)+" "
							+rs.getString(3)+" "+rs.getString(4)+" , "+rs.getString(5)+" , "
							+rs.getString(6)+" "+rs.getString(7)+"\n"); 
				}	
				st.close();
			}catch(Exception io) {
				System.out.println("Error" +io);
			}
		});

		exits.setOnAction(e->{
			primaryStage.close();                                              
		});

		exitt.setOnAction(e->{
			primaryStage.close();                                              
		});

		exitM.setOnAction(e->{
			primaryStage.close();                                              
		});

		disM.setOnAction(e->{
			tam.clear();
			try {

				Statement st = conn.createStatement();
				String qy = "Select * from modules";
				ResultSet rs = st.executeQuery(qy);	
				while(rs.next()){  
					tam.appendText( rs.getString(1)+" : "+rs.getString(2)+" \n"); 
				}	
				st.close();
			}catch(Exception io) {
				System.out.println("Error" +io);
			}                                              
		});

		addM.setOnAction(e->{
			String moduleName = mName.getText();
			Database.Insert.addModule(moduleName);
			mName.clear();
		});

		delS.setOnAction(e->{
			String personID = delSt.getText();
			Database.Insert.removeStudent(Integer.parseInt(personID));
			delSt.clear();
			tas.clear();
		});

		upT.setOnAction(e->{
			String degreeQual = degType.getText();
			String personID = tID.getText();
			Database.Insert.updateTeacher(degreeQual, personID);
			degType.clear();
			tID.clear();
		});
		
		addC.setOnAction(e->{
			String className = cName.getText();
			Database.Insert.addClass(className);
			cName.clear();
		});
		
		exitC.setOnAction(e->{
			primaryStage.close();
		});
		
		disC.setOnAction(e->{
			tac.clear();
			try {

				Statement st = conn.createStatement();
				String qy = "Select * from school";
				ResultSet rs = st.executeQuery(qy);	
				while(rs.next()){  
					tac.appendText( rs.getString(1)+" : "+rs.getString(2)+" \n"); 
				}	
				st.close();
			}catch(Exception io) {
				System.out.println("Error" +io);
			}
		});
		
		delC.setOnAction(e->{
			String classID = delCl.getText();
			Database.Insert.removeClass(Integer.parseInt(classID));
			delCl.clear();
			tac.clear();
			
		});

	}
}
