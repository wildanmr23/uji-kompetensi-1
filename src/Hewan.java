public class Hewan {
    private String name;

    public Hewan() {

        }

    public Hewan(String name) {
            this.name = name;
        }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void bersuara() {
        System.out.println("Beberapa Jenis Nama dan Suara Hewan: ");
    }
}
