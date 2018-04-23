package cursor.rybak;

import cursor.rybak.models.Administrator;
import cursor.rybak.models.FireStation;
import cursor.rybak.models.Firefighter;
import cursor.rybak.models.Officer;

public class Main {
    public static void main(String ... args) {
        FireStation fireStation = new FireStation();
        setUpStationThreads(fireStation);
    }

    private static void setUpStationThreads(FireStation fireStation) {

        Thread administrator = new Thread(new Administrator(fireStation));
        Thread officer = new Thread(new Officer(fireStation));
        Thread firefighter1 = new Thread(new Firefighter(fireStation), "firefighter #1");
        Thread firefighter2 = new Thread(new Firefighter(fireStation), "firefighter #2");
        Thread firefighter3 = new Thread(new Firefighter(fireStation), "firefighter #3");

        administrator.start();
        officer.start();
        firefighter1.start();
        firefighter2.start();
        firefighter3.start();
    }
}
