package vallegrande.edu.pe.demo;

//Aquí se está importando GetMapping, que es una anotación de Spring usada para definir rutas HTTP tipo GET.
import org.springframework.web.bind.annotation.GetMapping;
//Se está indicando que esta clase creada es un controlador, maneja peticiones web y devuelve datos directamente como texto o JSON.
import org.springframework.web.bind.annotation.RestController;


@RestController
//Esta clase es un controlador REST y debe gestionar peticiones HTTP. Combina @Controller y @ResponseBody, lo que el método retorne se enviará directamente como respuesta al navegador.
public class HolaController {

    @GetMapping("/hola")
    //Anotación que indica que este método responderá a peticiones HTTP GET en la ruta /hola. Es decir, cuando entremos por el navegador se ejecutará el método que estamos por definir.
    public String decirHola() { //Método que se ejecuta cuando alguien entra a /hola
        return "¡Hola Mundo desde Spring Boot!";
    }
}