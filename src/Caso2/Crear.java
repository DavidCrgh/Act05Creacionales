package Caso2;

public class Crear {

    private GUIBuilder guiBuilder;

    public void setGUIBuilder (GUIBuilder pb){
        guiBuilder = pb;
    }

    public GUI getGUI(){
        return guiBuilder.getGUI();
    }

    public void contructPizza(){
        guiBuilder.createNewGUI();
        guiBuilder.buildColor();
        guiBuilder.buildTamanno();
    }
}
