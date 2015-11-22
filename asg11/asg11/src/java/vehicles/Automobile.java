/**
 * William Bowen asg11 class
 */
package vehicles;

public class Automobile {

    // member variables
    private String autoMake, autoModel, autoColor, autoReg;

    // constructor
    public Automobile(String make, String model,
            String color, String reg) {
        setAutoMake(make);
        setAutoModel(model);
        setAutoColor(color);
        setAutoReg(reg);
    }

    // setters
    public void setAutoMake(String make) {
        if (make.length() > 0)
            autoMake = make;
        else
            autoMake = "No Value Entered!";
    }

    public void setAutoModel(String model) {
        if (model.length() > 0)
            autoModel = model;
        else
            autoModel = "No Value Entered!";
    }

    public void setAutoColor(String color) {
        if (color.length() > 0)
            autoColor = color;
        else
            autoColor = "No Value Entered!";
    }

    public void setAutoReg(String reg) {
        if (reg.length() > 0)
            autoReg = reg;
        else
            autoReg = "No Value Entered!";
    }

    // getters
    public String getAutoMake() {
        return autoMake;
    }

    public String getAutoModel() {
        return autoModel;
    }

    public String getAutoColor() {
        return autoColor;
    }

    public String getAutoReg() {
        return autoReg;
    }
} // end class