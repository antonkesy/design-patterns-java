package de.antonkesy.designpatterns.state.pattern;

public class ConcreteStateA implements IState {
    @Override
    public void stateSpecificBehaviour(Context context) {
        System.out.println("State A specific behaviour");
    }
}
