package main.factory_method.buttons;

import main.factory_method.buttons.Button;

// Реализация конкретной HTML кнопки.
public class HtmlButton implements Button {
    public void render() {
        System.out.println("<button>Кнопка 1</button>");
        onClick();
    }
    public void onClick() {
        System.out.println("Клик, и кнопка 1 работает!");
    }
}
