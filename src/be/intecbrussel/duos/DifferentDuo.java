package be.intecbrussel.duos;

public class DifferentDuo <T,V>{
    private T element1;
    private V element2;

    public DifferentDuo(T element1, V element2) {
        this.element1 = element1;
        this.element2 = element2;
    }

    public T getElement1() {
        return element1;
    }

    public void setElement1(T element1) {
        this.element1 = element1;
    }

    public V getElement2() {
        return element2;
    }

    public void setElement2(V element2) {
        this.element2 = element2;
    }
}
