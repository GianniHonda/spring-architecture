package io.github.giannihonda.springarchitecture.automaker;

import java.awt.*;

public class HondaHRV extends Car{
    public HondaHRV(Engine engine) {
        super(engine);
        setModel("HRV");
        setColor(Color.black);
        setAutomaker(Automaker.HONDA);
    }
}
