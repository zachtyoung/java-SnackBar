package snackbar;

public class Snack {
    //fields
    private int maxId;
    private int id;
    private String name;
    private int quantity;
    private double cost;
    private int vmachineId;

    //methods
    //set and get name
    public void setName(String name){
        this.name = name;
    }
    public String getName(){
        return name;
    }
    //set and get cost
    public void setCost(double cost){
        this.cost = cost;
    }
    public double getCost(){
        return cost;
    }
    //set and get vending machine id
    public void setVMachineId(int vmachineId){
        this.vmachineId = vmachineId;
    }
    public int getVMachineId(){
        return vmachineId;
    }
    //get quantity
    public int getQuantity(){
        return quantity;
    }
    //add quantity when given how many to add
    public void addQuantity(int amount){
        this.quantity = this.quantity + amount;

    }

    //buy snack when given how many to buy

    //get total cost given a quantity

}