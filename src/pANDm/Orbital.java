package pANDm;

public abstract class Orbital {
    private double RadiusSize;
    private String name;

    public Orbital(double radiusSize, String name) {
        RadiusSize = radiusSize;
        this.name = name;
    }

    public double getRadiusSize() {
        return RadiusSize;
    }

    public void setRadiusSize(double radiusSize) {
        RadiusSize = radiusSize;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
