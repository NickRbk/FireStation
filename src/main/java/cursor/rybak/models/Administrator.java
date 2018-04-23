package cursor.rybak.models;

import cursor.rybak.util.TimeOut;

public class Administrator implements Runnable {

    private FireStation fireStation;

    public Administrator(FireStation fireStation) {
        this.fireStation = fireStation;
    }

    public void run() {
        for(int i = 0; i < 4; i++) {
            TimeOut.set("\nADMINISTRATOR ---> Status OK", 2000);
            fireStation.setStatus(true);
        }

        TimeOut.set("\nADMINISTRATOR ---> Status ALARM!!!", 2000);
        fireStation.setStatus(false);
    }
}
