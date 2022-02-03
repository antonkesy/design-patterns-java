package de.antonkesy.designpatterns.adapter.pattern;

public class Context {
    private ITarget target;

    public void setTarget(ITarget target) {
        this.target = target;
    }

    public void operation() {
        target.request();
    }
}
