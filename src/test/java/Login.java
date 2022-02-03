import BHDLAutomatizacionControladorComunSelenium.logicaNegocio.AccionControladorComunApp;
import BHDLAutomatizacionControladorComunSelenium.manejador.ManejadorDataFile;
import org.junit.Test;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.net.MalformedURLException;
import java.util.Map;

public class Login {

    @Test
    public void ejecutarLogin(){
        run();
    }

    public static void run(){

        try{
            String url = "https://opensource-demo.orangehrmlive.com";
            AccionControladorComunApp.cargarDatos("Orange HRM", "Login", url, "Login", "NA", "Braulio Matos");

            ChromeDriver driver = AccionControladorComunApp.obtenerWebDriverTestProject();
            driver.manage().window().maximize();
            driver.get(url);

            WebElement user = AccionControladorComunApp.creacionObjetoPorXpathLocal("//input[@id = 'txtUsername']");
            AccionControladorComunApp.escribirTexto(user, "Admin", "campo user");

            WebElement pass = AccionControladorComunApp.creacionObjetoPorXpathLocal("//input[@id = 'txtPassword']");
            AccionControladorComunApp.escribirTexto(pass, "admin123", "campo user");

            WebElement btnLogin = AccionControladorComunApp.creacionObjetoPorXpathLocal("//input[@id = 'btnLogin']");
            AccionControladorComunApp.click(btnLogin, "boton login");

            Thread.sleep(2000);

        }catch (Exception e){
            System.err.println("El sistema presenta la Excepcion: " +e.getMessage());
        }

    }

}
