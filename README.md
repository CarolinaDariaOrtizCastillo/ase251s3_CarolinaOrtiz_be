# 📌 Implementación de un Endpoint “¡Hola Mundo!” con Spring Boot

## 🎯 Objetivo
Implementar un endpoint que muestre el mensaje **“¡Hola Mundo!”** utilizando Spring Boot.

---

## 🛠 Pasos realizados

### 1️⃣ Configuración del proyecto en Spring Initializr

Primero ingresé a Spring Initializr y configuré las siguientes características del proyecto:

- **Project:** Maven  
- **Language:** Java  
- **Spring Boot:** Versión estable  
- **Packaging:** Jar  
- **Java:** 17  
- **Dependencia agregada:** Spring Web  

Luego generé el proyecto y descargué el archivo `.zip`.

---

### 2️⃣ Descargar y abrir el proyecto en IntelliJ IDEA

- Descomprimí el archivo `.zip`.
- Abrí el proyecto en IntelliJ IDEA.
- Esperé a que Maven descargara todas las dependencias necesarias.

---

### 3️⃣ Crear el controlador

Se creó una clase llamada:

HolaController

Dentro de esta clase se implementó un endpoint utilizando la anotación `@GetMapping("/hola")`, el cual retorna el mensaje:

Hola Mundo!

Código utilizado:

```java
@RestController
public class HolaController {

    @GetMapping("/hola")
    public String hola() {
        return "Hola Mundo!";
    }
}
```

---

### 4️⃣ Ejecutar la aplicación

Se ejecutó la clase principal del proyecto (la clase que contiene `@SpringBootApplication`) para iniciar el servidor embebido de Spring Boot.

---

### 5️⃣ Probar en el navegador

Finalmente, se ingresó al siguiente enlace en el navegador:

http://localhost:8080/hola

Spring Boot utiliza por defecto el **puerto 8080**, por lo que al acceder a esta ruta se mostró correctamente el mensaje:

Hola Mundo!

---

## ✅ Resultado

Se logró implementar correctamente un endpoint funcional que muestra el mensaje **“Hola Mundo!”** utilizando Spring Boot.
