public class Car {
//HW5/6:rkin
private String model;
  
public Car(String model) {
    setModel(model);
}

public String getModel() {
    return model;
}

public void setModel(String model) {
    if(model.equals("  BMW   ") || model.equals("  Fiat  ") || model.equals("Mercedes"))
    this.model = model;
}

public String print() {
    return model;
}
}

