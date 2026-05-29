 public class Archer extends Job {

    public Archer() {
        namaJob = "Archer";
        weapon = "Bow";
        health = 120;
        magic = 80;
        power = 120;
        defend = 100;
    }

    @Override
    public void attack() {
        System.out.println("Hero menyerang musuh menggunakan Bow dengan Power " + power);
    }
}