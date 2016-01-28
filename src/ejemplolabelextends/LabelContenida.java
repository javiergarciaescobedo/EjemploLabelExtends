package ejemplolabelextends;

import javafx.scene.control.Label;

public class LabelContenida {

    private Label labelContenido = new Label("Label contenido");
    
    public Label getLabelContenido() {
        return labelContenido;
    }
    
    public void setLabelText(String text) {
        labelContenido.setText(text);
    }
    
}
