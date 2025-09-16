package Arrays.Generics;

//generic class
public class Box<T> {
    private T value;

    public void setValue(T newValue) {
        this.value = newValue;
    }

    public T getValue() {
        return this.value;
    }

    public void printValue() {
        System.out.println(this.value);
    }
}
