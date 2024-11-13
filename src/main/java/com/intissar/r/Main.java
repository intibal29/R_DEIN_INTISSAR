package com.intissar.r;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

/**
 * Clase principal de la aplicación JavaFX que inicia la interfaz gráfica de usuario.
 * Esta clase carga el archivo FXML y configura la escena principal de la aplicación.
 *
 * Extiende la clase {@link javafx.application.Application} para utilizar el framework de JavaFX.
 *
 * La aplicación muestra un formulario con temporizador.
 *
 * @version 1.0
 */
public class Main extends Application {

    /**
     * Método principal de inicio de la aplicación JavaFX.
     * Carga el archivo FXML que define la interfaz y configura la escena para mostrarla.
     *
     * @param stage El escenario principal de la aplicación, proporcionado por JavaFX.
     * @throws Exception Si ocurre un error al cargar el archivo FXML.
     */
    @Override
    public void start(Stage stage) throws Exception {
        // Carga el archivo FXML desde la ruta especificada
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("/com/intissar/r/FormularioTemporizador.fxml"));

        // Crea una nueva escena con el contenido cargado desde el archivo FXML
        Scene scene = new Scene(fxmlLoader.load());

        // Configura el título de la ventana principal
        stage.setTitle("Formulario con Temporizador");

        // Asigna la escena al escenario principal
        stage.setScene(scene);

        // Muestra el escenario (ventana) principal de la aplicación
        stage.show();
    }

    /**
     * Método `main` que lanza la aplicación.
     *
     * Este método es el punto de entrada de la aplicación cuando se ejecuta como una aplicación estándar de Java.
     * Llama al método {@link javafx.application.Application} para iniciar la aplicación JavaFX.
     *
     * @param args Los argumentos de la línea de comandos (no utilizados en esta aplicación).
     */
    public static void main(String[] args) {
        launch(); // Lanza la aplicación JavaFX
    }
}
