package refactoring_guru.abstract_factory.example.buttons.impl;

import refactoring_guru.abstract_factory.example.buttons.Button;

/**
 * EN: All products families have the same varieties (MacOS/Windows).
 *
 * This is another variant of a button.
 *
  *
 * Это вариант кнопки под Windows.
 */
public class WindowsButton implements Button {

    @Override
    public void paint() {
        System.out.println("You have created WindowsButton.");
    }
}
