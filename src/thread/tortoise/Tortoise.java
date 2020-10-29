package thread.tortoise;

public class Tortoise extends Thread {

    private static final int MILESTONES = 5;

    public Tortoise() {
        super("tortoise");
    }

    @Override
    public void run() {
        for (int index = 0; index < MILESTONES; index++) {
            switch (index) {

            }
        }
    }

}
