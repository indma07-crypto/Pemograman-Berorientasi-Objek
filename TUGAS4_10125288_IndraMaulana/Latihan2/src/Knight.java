 public class Knight extends Job {

    public Knight() {
        namaJob = "Knight";
        weapon = "Sword";
        health = 200;
        magic = 10;
        power = 70;
        defend = 200;
    }

    @Override
    public void attack() {
        System.out.println("Hero menyerang musuh menggunakan Sword dengan Power " + power);
    }
}