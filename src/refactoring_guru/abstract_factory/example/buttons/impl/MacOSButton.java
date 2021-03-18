package refactoring_guru.abstract_factory.example.buttons.impl;

import refactoring_guru.abstract_factory.example.buttons.Button;

/**
 * EN: All products families have the same varieties (MacOS/Windows).
 *
 * This is a MacOS variant of a button.
 *
  *
 * Это вариант кнопки под MacOS.
 */
public class MacOSButton implements Button {

    @Override
    public void paint() {
        System.out.println("You have created MacOSButton.");
    }
}
