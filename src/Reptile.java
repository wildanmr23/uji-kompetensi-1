public class Reptile extends Hewan {
    public Reptile(String name) {
        super(name); 
    }

    @Override
    public void bersuara() { 
        System.out.println(getName() + " reptil itu mendesis.");
    }

    // Method tambahan untuk Reptile
    public void crawl() {
        System.out.println(getName() + " reptil mencakar.");
    }
}
