public class Main {
    public static void main(String[] args) {
        Hewan hewan = new Hewan("Hewan");
        Ayam ayam = new Ayam("Ayam Kampung");
        Sapi sapi = new Sapi("Sapi Perah"); 
        Burung burung = new Burung("Kenari");
        
        hewan.bersuara(); 
        ayam.bersuara(); 
        sapi.bersuara(); 
        burung.bersuara();
    }
}
