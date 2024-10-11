public class Reptile extends Hewan {
    public Reptile(String name) {
        super(name); 
    }

    public void bersuara() { 
        System.out.println(getName() + " reptil itu mendesis.");
    }

    public void mencakar() {
        System.out.println(getName() + " reptil mencakar.");
    }
}
