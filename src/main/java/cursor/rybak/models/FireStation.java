package cursor.rybak.models;

public class FireStation {
    private boolean isCalm = true;

    public synchronized void getStatus() {
        if (isCalm) {
            try {
                notify();
                System.out.println("OFFICER ---> Nice quite day)");
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        } else System.out.println("OFFICER: alarm accepted, raised");
    }

    public synchronized void setStatus(boolean isCalm) {
        String status = isCalm ? "OK" : "ALARM!!!";
        System.out.println("FIRE STATION ---> Administrator set status: " + status);
        this.isCalm = isCalm;

        if(!isCalm) notifyAll();
    }

    public synchronized void alarmFightFighters(String threadName) {
        if (isCalm) {
            try {
                System.out.println(threadName + " waiting...");
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        } else System.out.println(threadName + ": prepared to fight with fire!");
    }
}
