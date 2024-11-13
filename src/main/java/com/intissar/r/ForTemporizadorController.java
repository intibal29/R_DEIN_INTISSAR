package com.intissar.r;

import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.util.Duration;

/**
 * Controlador para la interfaz de formulario con temporizador.
 * Gestiona el temporizador y el estado de los botones de envío en la interfaz.
 *
 * Esta clase es el controlador de la interfaz en JavaFX, y está vinculada a un archivo FXML.
 *
 * @version 1.0
 */
public class ForTemporizadorController {

    /**
     * Etiqueta de texto que muestra el tiempo restante del temporizador.
     */
    @FXML
    private Label temporizadorLabel;

    /**
     * Botones de envío para el formulario en cada pestaña.
     */
    @FXML
    private Button btnEnviar1, btnEnviar2;

    /**
     * Objeto Timeline que gestiona el temporizador.
     */
    private Timeline timeline;

    /**
     * Tiempo restante en segundos. Inicializado a 90 segundos (1 minuto y 30 segundos).
     */
    private int timeSeconds = 90;

    /**
     * Método de inicialización que se llama automáticamente después de que se cargue el FXML.
     * Configura el temporizador y habilita los botones de envío.
     */
    @FXML
    public void initialize() {
        // Activa los botones de envío al inicio
        btnEnviar1.setDisable(false);
        btnEnviar2.setDisable(false);

        // Configura el temporizador para que disminuya cada segundo
        timeline = new Timeline(new KeyFrame(Duration.seconds(1), e -> {
            timeSeconds--;

            // Calcula minutos y segundos restantes
            int minutes = timeSeconds / 60;
            int seconds = timeSeconds % 60;

            // Actualiza el texto de la etiqueta con el formato mm:ss
            temporizadorLabel.setText(String.format("%02d:%02d", minutes, seconds));

            // Desactiva los botones de envío si el tiempo se acaba
            if (timeSeconds <= 0) {
                timeline.stop();
                btnEnviar1.setDisable(true);
                btnEnviar2.setDisable(true);
            }
        }));

        // El temporizador continúa indefinidamente hasta que se acabe el tiempo o se detenga manualmente
        timeline.setCycleCount(Timeline.INDEFINITE);

        // Inicia el temporizador
        timeline.play();
    }

    /**
     * Método que se ejecuta cuando se presiona el botón de envío.
     * Imprime un mensaje en la consola confirmando el envío del formulario.
     */
    @FXML
    public void enviar() {
        // Acción del botón enviar
        System.out.println("Formulario enviado");
    }
}
