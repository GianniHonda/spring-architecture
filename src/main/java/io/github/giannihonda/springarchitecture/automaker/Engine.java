package io.github.giannihonda.springarchitecture.automaker;

public class Engine {
    private String engine;
    private Integer horsePower;
    private Integer cylinders;
    private Double literage;
    private EngineType type;

    public String getEngine() {
        return engine;
    }

    public void setEngine(String engine) {
        this.engine = engine;
    }

    public Integer getHorsePower() {
        return horsePower;
    }

    public void setHorsePower(Integer horsePower) {
        this.horsePower = horsePower;
    }

    public Integer getCylinders() {
        return cylinders;
    }

    public void setCylinders(Integer cylinders) {
        this.cylinders = cylinders;
    }

    public Double getLiterage() {
        return literage;
    }

    public void setLiterage(Double literage) {
        this.literage = literage;
    }

    public EngineType getType() {
        return type;
    }

    public void setType(EngineType type) {
        this.type = type;
    }
}
