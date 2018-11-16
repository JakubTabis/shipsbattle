package sample;

import javafx.scene.control.Button;

import java.util.List;

public class Ship {
    private List<Button> buttons;
    private List<Button> removedButtons;
    private int size;

    public List<Button> getRemovedButtons() {
        return removedButtons;
    }

    public void setRemovedButtons(List<Button> removedButtons) {
        this.removedButtons = removedButtons;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public List<Button> getButtons() {
        return buttons;
    }

    public void setButtons(List<Button> buttons) {
        this.buttons = buttons;
    }

    public Ship(List<Button> buttons, int size, List<Button> removedButtons) {
        this.buttons = buttons;
        this.size = size;
        this.removedButtons = removedButtons;
    }
}
