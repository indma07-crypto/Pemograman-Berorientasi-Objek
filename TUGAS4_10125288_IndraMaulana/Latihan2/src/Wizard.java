 public class Wizard extends Job {

    public Wizard() {
        namaJob = "Wizard";
        weapon = "Wand";
        health = 100;
        magic = 200;
        power = 200;
        defend = 50;
    }

    @Override
    public void attack() {
        System.out.println("Hero menyerang musuh menggunakan Wand dengan Power " + power);
    }
}