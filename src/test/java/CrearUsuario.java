import BHDLAutomatizacionControladorComunSelenium.logicaNegocio.AccionControladorComunApp;
import org.junit.Test;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CrearUsuario {

    @Test
    public void ejecutarCreacionUsuario(){
        run();
    }

    public static void run(){

        try{
            String url = "https://opensource-demo.orangehrmlive.com";
            AccionControladorComunApp.cargarDatos("Orange HRM", "CrearUsuario", url, "Crear nuevo usuario", "NA", "Braulio Matos");

            ChromeDriver driver = AccionControladorComunApp.obtenerWebDriverTestProject();
            driver.manage().window().maximize();
            driver.get(url);

            WebElement user = AccionControladorComunApp.creacionObjetoPorXpathLocal("//input[@id = 'txtUsername']");
            AccionControladorComunApp.escribirTexto(user, "Admin", "campo user");

            WebElement pass = AccionControladorComunApp.creacionObjetoPorXpathLocal("//input[@id = 'txtPassword']");
            AccionControladorComunApp.escribirTexto(pass, "admin123", "campo user");

            WebElement btnLogin = AccionControladorComunApp.creacionObjetoPorXpathLocal("//input[@id = 'btnLogin']");
            AccionControladorComunApp.click(btnLogin, "boton login");

            WebElement menuAdmin = AccionControladorComunApp.creacionObjetoPorXpathLocal("//a[@id='menu_admin_viewAdminModule']");
            AccionControladorComunApp.click(menuAdmin, "Menu Admin");

            WebElement btnAdd = AccionControladorComunApp.creacionObjetoPorXpathLocal("//input[@id='btnAdd']");
            AccionControladorComunApp.click(btnAdd, "Boton Add");

            WebElement nombreEmpleado = AccionControladorComunApp.creacionObjetoPorXpathLocal("//input[@id='systemUser_employeeName_empName']");
            AccionControladorComunApp.escribirTexto(nombreEmpleado, "Cecil Bonaparte", "campo nombre empleado");

            WebElement username = AccionControladorComunApp.creacionObjetoPorXpathLocal("//*[@id='systemUser_userName']");
            AccionControladorComunApp.escribirTexto(username, "abc123", "campo username");

            WebElement password = AccionControladorComunApp.creacionObjetoPorXpathLocal("//*[@id='systemUser_password']");
            AccionControladorComunApp.escribirTexto(password, "pass1234", "campo password");

            WebElement confirmPassword = AccionControladorComunApp.creacionObjetoPorXpathLocal("//*[@id='systemUser_confirmPassword']");
            AccionControladorComunApp.escribirTexto(confirmPassword, "pass1234", "campo confirmar password");

            WebElement btnSave = AccionControladorComunApp.creacionObjetoPorXpathLocal("//*[@id='btnSave']");
            AccionControladorComunApp.click(btnSave, "Boton Save");

            Thread.sleep(2000);

        }catch (Exception e){
            System.err.println("El sistema presenta la Excepcion: " +e.getMessage());
        }

    }

}
