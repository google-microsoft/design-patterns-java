package refactoring_guru.abstract_factory.example.checkboxes.impl;

import refactoring_guru.abstract_factory.example.checkboxes.Checkbox;

/**
 * EN: All products families have the same varieties (MacOS/Windows).
 *
 * This is a variant of a checkbox.
 *
  *
 * Вариация чекбокса под MacOS.
 */
public class MacOSCheckbox implements Checkbox {

    @Override
    public void paint() {
        System.out.println("You have created MacOSCheckbox.");
    }
}
