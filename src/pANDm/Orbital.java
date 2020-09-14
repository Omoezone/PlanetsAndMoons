package pANDm;

public abstract class Orbital {
    private int RadiusSize;
    private String name;

    public Orbital(int radiusSize, String name) {
        RadiusSize = radiusSize;
        this.name = name;
    }

    public int getRadiusSize() {
        return RadiusSize;
    }

    public void setRadiusSize(int radiusSize) {
        RadiusSize = radiusSize;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
