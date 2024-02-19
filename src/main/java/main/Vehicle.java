package main;


public class Vehicle {
    protected String type;
    protected String manufacturer;
    protected String model;
    protected int maxSpeed;
    private Engine engine;
    

    public Vehicle(String type,String manufacturer, String model, int maxSpeed){
        this.type=type;
        this.manufacturer=manufacturer;
        this.model=model;
        this.maxSpeed=maxSpeed;

    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }
    public Engine getEngine() {
        return engine;
    }
    public String getManufacturer() {
        return manufacturer;
    }
    public String getModel() {
        return model;
    }
    public int getMaxSpeed() {
        return maxSpeed;
    }
    
    public String getType() {
        return type;
    }

}
