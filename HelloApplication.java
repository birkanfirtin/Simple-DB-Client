package simple_demo.db_client;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.stage.Stage;
import javafx.scene.Parent;

import java.io.IOException;

public class HelloApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        Parent parent = FXMLLoader.load(getClass().getResource("hello-view.fxml"));


        TableView tableView = new TableView<Employee>();
        TableColumn firstnamecolumn = new TableColumn<Employee, String>("First Name");
        firstnamecolumn.setCellFactory(new PropertyValueFactory<Employee, String>("firstname"));

        TableColumn lastnamecolumn = new TableColumn<Employee, String>("Last Name");
        lastnamecolumn.setCellFactory(new PropertyValueFactory<Employee, String>("lastname"));

        TableColumn employeeidcolumn = new TableColumn<Employee, Integer>("Employee ID");
        employeeidcolumn.setCellFactory(new PropertyValueFactory<Employee, String>("id"));

        TableColumn salarycolumn = new TableColumn<Employee, Double>("Salary");
        salarycolumn.setCellFactory(new PropertyValueFactory<Employee, String>("salary"));

        tableView.getColumns().add(firstnamecolumn);
        tableView.getColumns().add(lastnamecolumn);
        tableView.getColumns().add(employeeidcolumn);
        tableView.getColumns().add(salarycolumn);
        


        Scene scene = new Scene(parent);
        stage.setScene(scene);
        stage.show();

    }

    public static void main(String[] args) {
        launch();
    }
}