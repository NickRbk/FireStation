package cursor.rybak.models;

import cursor.rybak.util.TimeOut;

public class Administrator implements Runnable {


    private FireStation fireStation;

    public Administrator(FireStation fireStation) {
        this.fireStation = fireStation;
    }

    public void run() {
        int delay = 2000;

        for(int i = 0; i < 4; i++) {
            TimeOut.set("\nADMINISTRATOR ---> Status OK", delay);
            fireStation.setStatus(true);
        }

        TimeOut.set("\nADMINISTRATOR ---> Status ALARM!!!", delay);
        fireStation.setStatus(false);
    }
}
