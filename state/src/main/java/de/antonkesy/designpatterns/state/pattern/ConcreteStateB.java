package de.antonkesy.designpatterns.state.pattern;

public class ConcreteStateB implements IState {
    @Override
    public void stateSpecificBehaviour(Context context) {
        System.out.println("State B specific behaviour");
    }
}
