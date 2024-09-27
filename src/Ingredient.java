public class Ingredient {
public double amount;
public String unit;
public String name;

public Ingredient(){
}

public Ingredient(double amount, String unit, String name){
    this.amount = amount;
    this.unit = unit;
    this.name = name;
}

public double getAmount(){
    return this.amount;
}
public void setAmount(double amount){
    this.amount = amount;
}

public String getUnit(){
    return this.unit;
}

public void setUnit(String unit){
    this.unit = unit;
}

public String getName(){
    return this.name;
}

public void setName(String name){
    this.name = name;
}
}
