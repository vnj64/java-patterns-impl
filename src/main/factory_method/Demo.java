package main.factory_method;

import main.factory_method.factory.Dialog;
import main.factory_method.factory.HtmlDialog;
import main.factory_method.factory.WindowsDialog;

public class Demo {
    private static Dialog dialog;
    public static void main(String[] args) {
        configure();
        runBusinessLogic();
    }

    /*
    * Создание отдельной фабрики в зависимости от окружения.
     */
    static void configure() {
        if (System.getProperty("os.name").equals("Windows 10")) {
            dialog = new WindowsDialog();
        } else {
            dialog = new HtmlDialog();
        }
    }

    /*
     * Код работы с фабрикой через общий интерфейс без(!) привязки к чему-то конкретному.
     */
    static void runBusinessLogic() {
        dialog.renderWindow();
    }
}
