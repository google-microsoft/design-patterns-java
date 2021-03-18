package refactoring_guru.mediator.example.components;

import refactoring_guru.mediator.example.mediator.Mediator;

/**
 * EN: Common component interface.
 *
  */
public interface Component {
    void setMediator(Mediator mediator);
    String getName();
}
