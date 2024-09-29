package geometry3d;

import exceptions.*;
import geometry2d.Figure;

public class Cylinder {
    private final double height;
    private final Figure base;
    public Cylinder(Figure base, double height) throws InvalidArgumentException {
        if (height < 0) {
            throw new InvalidArgumentException("Height must be greater than 0");
        }

        this.base = base;
        this.height = height;
    }
    public double Volume() throws ZeroVolumeException {
        double volume = base.area() * height;
        if (volume == 0) {
            throw new ZeroVolumeException("Volume must be greater then 0");
        }
        return volume;
    }
    @Override
    public String toString() {
        return "Cylinder with height = " + height + " and figure = " + base;
    }
}
