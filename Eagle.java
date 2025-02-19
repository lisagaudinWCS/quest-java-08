public class Eagle extends Bird implements Fly {

    private boolean flying;
    private int altitude;

    public Eagle(String name) {
        super(name);
        this.flying = false;
        this.altitude = 0;
    }

    public int getAltitude() {
        return altitude;
    }

    public boolean isFlying() {
        return flying;
    }

    @Override
    public String sing() {
        return "Screech!";
    }

    @Override
    public void takeOff() {
        if (!this.flying && this.altitude == 0) {
            this.flying = true;
            System.out.printf("%s takes off in the sky.%n", this.getName());
        }
    }

    @Override
    public void land() {
      if (getAltitude() <= 1) {
        this.flying = false;
        System.out.printf("%s lands on the ground.%n", this.getName());
      } else {
        System.out.println(getName() + " is too high to land !");
      }
    }

    @Override
    public void glide() {
            System.out.printf("%s glides in the air. %n", this.getName());
        }

    @Override
    public int descend(int meters) {
        if (this.flying) {
            this.altitude = Math.max(this.altitude - meters, 0);
            System.out.printf("%s flies downward, altitude : %d%n", this.getName(), this.altitude);
        }
        return this.altitude;
    }

    @Override
    public int ascend(int meters) {
        if (this.flying) {
            this.altitude = Math.min(this.altitude + meters, 300);
            System.out.printf("%s flies upward, altitude : %d%n", this.getName(), this.altitude);
        }
        return this.altitude;
    }




}
