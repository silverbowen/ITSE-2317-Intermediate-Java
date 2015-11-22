/**
 * William Bowen asg11 class
 */
package vehicles;

public class Aircraft {

    // member variables
    private String airMake, airModel, airColor, airReg;

    // constructor
    public Aircraft(String make, String model,
            String color, String reg) {
        setAirMake(make);
        setAirModel(model);
        setAirColor(color);
        setAirReg(reg);
    }

    // setters
    public void setAirMake(String make) {
        if (make.length() > 0)
            airMake = make;
        else
            airMake = "No Value Entered!";
    }

    public void setAirModel(String model) {
        if (model.length() > 0)
        airModel = model;
        else
            airModel = "No Value Entered!";
    }

    public void setAirColor(String color) {
        if (color.length() > 0)
        airColor = color;
        else
            airColor = "No Value Entered!";
    }

    public void setAirReg(String reg) {
        if (reg.length() > 0)
        airReg = reg;
        else
            airReg = "No Value Entered!";
    }

    // getters
    public String getAirMake() {
        return airMake;
    }

    public String getAirModel() {
        return airModel;
    }

    public String getAirColor() {
        return airColor;
    }

    public String getAirReg() {
        return airReg;
    }
} // end class