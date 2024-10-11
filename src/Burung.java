public class Burung extends Hewan {
    public Burung(String name) {
        super(name);
    }

    public void bersuara() { // Method Overriding
        System.out.println(getName() + " si burung berkicau.");
    }
}
