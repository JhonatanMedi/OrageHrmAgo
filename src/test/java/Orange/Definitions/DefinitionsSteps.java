package Orange.Definitions;

import org.openqa.selenium.WebDriver;

import Orange.Pages.AdminPage;
import Orange.Pages.LeavePage;
import Orange.Pages.LoginPage;
import Orange.Pages.PimPage;
import Orange.Steps.Conexion;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;

public class DefinitionsSteps {

	private WebDriver driver;
	private Conexion conexion = new Conexion();
	private LoginPage loginPage = new LoginPage(driver);
	private PimPage pimPage = new PimPage(driver);
	private LeavePage leavePage = new LeavePage(driver);
	private AdminPage adminPage = new AdminPage(driver);

	@Given("^abrir el navegador$")
	public void abrir_navegador() {
		this.conexion = new Conexion();
		this.driver = this.conexion.abrirNavegador();

	}

	@When("^diligencie el campo user (.*) y contraseña (.*)$")
	public void ingresarLogin(String user, String pass) {
		this.loginPage = new LoginPage(driver);
		this.loginPage.diligencieLogin(user, pass);
	}

	@When("^diligencie el nuevo empleado nombre$")
	public void agregarEmpleado() {
		this.pimPage = new PimPage(driver);
		this.pimPage.agregarEmpleado();
	}

	@When("^diligenciar nombre (.*) y apellido (.*)$")
	public void diligenciarAddEmployee(String name, String apellido) {
		this.pimPage = new PimPage(driver);
		this.pimPage.diligenciarAddEmployee(name, apellido);
	}

	@And("^llegar a la opcion leave y tipo de leave (.*)$")
	public void llegarLeaveList(String typesLeave) {
		this.leavePage = new LeavePage(driver);
		this.leavePage.llegarLeaveList(typesLeave);
	}

	@When("^busque al empleado (.*) y seleccione la accion (.*)$")
	public void buscarEmpleado(String nameEmployee, String actions) {
		this.leavePage = new LeavePage(driver);
		this.leavePage.buscarEmpleado(nameEmployee, actions);
	}

	@When("^busque al usuario (.*)$")
	public void eliminarUsuario(String nameUser) {
		this.adminPage = new AdminPage(driver);
		this.adminPage.eliminarUsuario(nameUser);

	}

}