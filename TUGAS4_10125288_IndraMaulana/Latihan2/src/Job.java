 abstract class Job {
    protected String namaJob;
    protected String weapon;
    protected int health;
    protected int magic;
    protected int power;
    protected int defend;

    public String getNamaJob() { return namaJob; }
    public String getWeapon() { return weapon; }
    public int getHealth() { return health; }
    public int getMagic() { return magic; }
    public int getPower() { return power; }
    public int getDefend() { return defend; }

    // polymorphism
    public abstract void attack();
}