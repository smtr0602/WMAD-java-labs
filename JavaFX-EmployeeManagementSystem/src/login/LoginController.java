package login;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class LoginController implements Initializable {

	LoginModel loginModel = new LoginModel();

	@FXML
	private Label dbStatus;
	@FXML
	private TextField username;
	@FXML
	private TextField password;
	@FXML
	private Button loginBtn;
	@FXML
	private Label loginStatus;

	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		if (this.loginModel.isDatabaseConnected()) {
			this.dbStatus.setText("Connected");
		} else {
			this.dbStatus.setText("Not Connected");
		}
	}

	@FXML
	public void Login(ActionEvent event) {
		System.out.println(this.loginModel.login(this.username.getText(), this.password.getText()));

		if (this.loginModel.login(this.username.getText(), this.password.getText())) {
			this.loginStatus.setText("You have successfully logged in!");
		} else {
			this.loginStatus.setText("Wrong Credentials");
		}
	}

}