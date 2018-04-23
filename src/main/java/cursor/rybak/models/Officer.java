package cursor.rybak.models;

public class Officer implements Runnable {

    private FireStation fireStation;

    public Officer(FireStation fireStation) {
        this.fireStation = fireStation;
    }

    public void run() {
        fireStation.getStatus();
        fireStation.getStatus();
    }
}
