package liveSession;

public abstract class FoodOrder {
    public abstract void order();
}

/*
-> abstract classes do not contain any implementations, abstract classes contains only signatures
-> if any class wants to extend abstract class, it should (forces you to) override abstract methods
    else you should make that class also abstract if you cannot provide concrete implementations
->
*/