package pANDm;

public class Moon extends Orbital {
    private boolean isOrbital;

    public Moon(int radiusSize, String name, boolean isOrbital) {
        super(radiusSize, name);
        this.isOrbital = isOrbital;
    }

    public boolean isIsOrbital() {
        return isOrbital;
    }

    public void setIsOrbital(boolean isOrbital) {
        this.isOrbital = isOrbital;
    }

    @Override
    public String toString() {
        return "Radius of moon: " + getRadiusSize() + "  Name: " + getName();
    }
}
