package main.factory_method.factory;

import main.factory_method.buttons.Button;
import main.factory_method.buttons.WindowsButton;

public class WindowsDialog extends Dialog {
    @Override
    public Button createButton() {
        return new WindowsButton();
    }
}
