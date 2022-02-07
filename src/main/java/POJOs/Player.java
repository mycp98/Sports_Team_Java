package POJOs;

import java.util.Objects;

public class Player {
    // Properties
    private String name;
    private String position;
    private int number;
    private int contractLength;

    //Constructor
    public Player(String name, String position, int number, int contractLength){
        this.name = name;
        this.position = position;
        this.number = number;
        this.contractLength = contractLength;
    }
    //default constructor
    public Player(){

    }
    //Encapsulation - to access the information we will need to call the method
    //Getters:
    public String getName(){
        return name;
    }
    public String getPosition(){
        return position;
    }
    public int getNumber(){
        return number;
    }
    public int getContractLength(){
        return contractLength;
    }
    //Setters:
    public void setName(String name){    //void because we don't want anything back
        this.name = name;
    }
    public void setPosition(String position){
        this.position = position;
    }
    public void setNumber(int number){
        this.number = number;
    }
    public void setContractLength(int contractLength){
        this.contractLength = contractLength;
    }

    @Override
    public String toString() {
        return "Player{" +
                "name='" + name + '\'' +
                ", position='" + position + '\'' +
                ", number=" + number +
                ", contractLength=" + contractLength +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Player player = (Player) o;
        return number == player.number && contractLength == player.contractLength && Objects.equals(name, player.name) && Objects.equals(position, player.position);
    }

    @Override    //generates number
    public int hashCode() {
        return Objects.hash(name, position, number, contractLength);
    }
}
