package pANDm;

public class Planet extends Orbital{
    private int moons;

    public Planet(double radiusSize, String name, int moons) {
        super(radiusSize, name);
        this.moons = moons;
    }

    public int getMoons() {
        return moons;
    }

    public void setMoons(int moons) {
        this.moons = moons;
    }

    @Override
    public String toString() {
        return getName() + " is " + getRadiusSize() + " km in radius and has " + moons + " moon(s)";
    }
}
