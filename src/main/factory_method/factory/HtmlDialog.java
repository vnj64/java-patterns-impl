package main.factory_method.factory;

import main.factory_method.buttons.Button;
import main.factory_method.buttons.HtmlButton;

/*
* Уникальный класс диалога.
 */
public class HtmlDialog extends Dialog {
    @Override
    public Button createButton() {
        return new HtmlButton();
    }
}
