package refactoring_guru.abstract_factory.example.factories.impl;

import refactoring_guru.abstract_factory.example.buttons.Button;
import refactoring_guru.abstract_factory.example.buttons.impl.MacOSButton;
import refactoring_guru.abstract_factory.example.checkboxes.Checkbox;
import refactoring_guru.abstract_factory.example.checkboxes.impl.MacOSCheckbox;
import refactoring_guru.abstract_factory.example.factories.GUIFactory;

/**
 * EN: Each concrete factory extends basic factory and responsible for creating
 * products of a single variety.
 *
  */
public class MacOSFactory implements GUIFactory {

    @Override
    public Button createButton() {
        return new MacOSButton();
    }

    @Override
    public Checkbox createCheckbox() {
        return new MacOSCheckbox();
    }
}
