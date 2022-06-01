package simple_demo.db_client;

import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.*;
import java.sql.Connection;

import java.net.URL;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ResourceBundle;

public class HelloController implements Initializable {
    @FXML
    private TableColumn<Employee, String> lastname;

    @FXML
    private TableColumn<Employee, String> firstname;

    @FXML
    private TableColumn<Employee, Double> salary;

    @FXML
    private TableColumn<Employee, Integer> id;

    @FXML
    private TextArea myTextarea;

    @FXML
    private Button buttonGo;

    @FXML
    private TableView<Employee> empTable;

    String result = myTextarea.getText().toString();

    @FXML
    private void handleButtonClick(ActionEvent event){
        DatabaseConnection connectNow = new DatabaseConnection();
        Conection connectDB = connectNow.getConnection();

        String connectQueary = result;

        try{

            Statement statement = connectDB.createStatement();
            ResultSet queryD = statement.executeQuery(connectQueary);

            while (queryD.next()){
                empTable.setItems((ObservableList<Employee>) queryD.getObject("Firstname"));
                empTable.setItems((ObservableList<Employee>) queryD.getObject("Lastname"));
                empTable.setItems((ObservableList<Employee>) queryD.getObject("Employee ID"));
                empTable.setItems((ObservableList<Employee>) queryD.getObject("Salary"));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

    }








    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {






    }
}
