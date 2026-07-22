package laptop;

public class MacBook implements Laptop {
    private int volume;
    private boolean is_power_on;

    public MacBook() {
        this.volume = 50;
    }

    @Override
    public void powerOn() {
        is_power_on = true;
        System.out.println("MacBook is On (Chime Sound...)");
        System.out.println("macOS Ready to Use");
    }

    @Override
    public void powerOff() {
        is_power_on = false;
        System.out.println("Shutting down macOS...");
    }

    @Override
    public void volumeUp() {
        if (is_power_on) {
            if (this.volume == MAX_VOL) {
                System.out.println("MacBook Volume is Maximum");
            } else {
                this.volume += 10;
                System.out.println("MacBook Volume: " + this.getVolume());
            }
        } else {
            System.out.println("Turn on your MacBook first!");
        }
    }

    @Override
    public void volumeDown() {
        if (is_power_on) {
            if (this.volume == MIN_VOL) {
                System.out.println("MacBook Volume is Muted");
            } else {
                this.volume -= 10;
                System.out.println("MacBook Volume: " + this.getVolume());
            }
        } else {
            System.out.println("Turn on your MacBook first!");
        }
    }

    public int getVolume() {
        return this.volume;
    }
}
