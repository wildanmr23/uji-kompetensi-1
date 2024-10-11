public class Sapi extends Hewan {
    public Sapi(String name) {
        super(name); // Memanggil constructor dari kelas induk
    }

    @Override
    public void bersuara() { // Overriding method dari parent class
        System.out.println(getName() + " si sapi melenguh.");
    }
}
