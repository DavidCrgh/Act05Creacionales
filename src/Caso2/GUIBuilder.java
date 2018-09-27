package Caso2;

abstract class GUIBuilder {

    protected GUI gui;

    public GUI getGUI(){
        return gui;
    }

    public void createNewGUI(){
        gui =new GUI();
    }

    public abstract void buildColor();
    public abstract void buildTamanno();
}
