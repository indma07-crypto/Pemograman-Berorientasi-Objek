 public class Character {
    private String nama;
    private int level;
    private Job job;

    public Character(String nama, Job job) {
        this.nama = nama;
        this.level = 1;
        this.job = job;
    }

    public void tampilStatus() {
        System.out.println("\n===== TAMPIL STATUS HERO =====");
        System.out.println("Nama Character : " + nama);
        System.out.println("Level Character : " + level);
        System.out.println("Nama Job : " + job.getNamaJob());
        System.out.println("Weapon : " + job.getWeapon());
        System.out.println("Health Point : " + job.getHealth());
        System.out.println("Magic Point : " + job.getMagic());
        System.out.println("Power : " + job.getPower());
        System.out.println("Defend : " + job.getDefend());
        job.attack();
    }
}