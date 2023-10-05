package main.factory_method.buttons;

// Создание общего интерфейса для последующих подклассов Button.
public interface Button {
    void render();
    void onClick();
}
