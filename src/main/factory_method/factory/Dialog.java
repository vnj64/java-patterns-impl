package main.factory_method.factory;

import main.factory_method.buttons.Button;

/*
 Базовый класс "фабрики"
 */
public abstract class Dialog {
    public void renderWindow() {
        /*
         * СВОЙ КОД БИЗНЕС-ЛОГИКИ
         */
        Button okButton = createButton();

        okButton.render();
    }

    /*
     * Для каждой фабрики будет отдельный объект продукта.
     */
    public abstract Button createButton();
}
