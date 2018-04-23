package cursor.rybak.models;

public class Firefighter implements Runnable {

    private FireStation fireStation;

    public Firefighter(FireStation fireStation) {
        this.fireStation = fireStation;
    }

    public void run() {
        String name = Thread.currentThread().getName();
        fireStation.alarmFightFighters(name);
        fireStation.alarmFightFighters(name);
    }
}
