public class Burung extends Hewan {
    public Burung(String name) {
        super(name);
    }

    public void bersuara() {
        System.out.println(getName() + " si burung berkicau.");
    }

    public void terbang() {
        System.out.println(getName() + " terbang.");
    }
}
