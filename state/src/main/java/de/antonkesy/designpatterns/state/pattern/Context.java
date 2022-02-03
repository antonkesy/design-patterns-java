package de.antonkesy.designpatterns.state.pattern;

public class Context {
    private IState state;

    public void request() {
        state.stateSpecificBehaviour(this);
    }

    public void setState(IState state) {
        this.state = state;
    }
}
