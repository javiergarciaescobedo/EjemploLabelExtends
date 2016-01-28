package ejemplolabelextends;

import java.util.Random;
import javafx.scene.control.Label;

public class LabelExtendida extends Label {
    
    public void setRandomText(int size) {
        Random random = new Random();
        String resultado = "";
        for(int i=0; i<size; i++) {
            char charAleatorio = (char)(random.nextInt(26) + 'A');
            resultado += charAleatorio;
        }
        this.setText(resultado);
    }
    
}
