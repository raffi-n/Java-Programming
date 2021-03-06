package Section07.Interfaces.Section02.InterfacesPt2;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Raffi
 */
public class Player implements Saveable {

    /*Fields*/
    private String name;
    private int hitPoints;
    private int strength;
    private String weapon;

    /*Constructor*/
    public Player(String name, int hitPoints, int strength) {
        this.name = name;
        this.strength = strength;
        this.hitPoints = hitPoints;
        this.weapon = "Sword";
    }

    /*Getters and Setters*/
    public String getName() {
        return name;
    }

    public int getHitPoints() {
        return hitPoints;
    }

    public int getStrength() {
        return strength;
    }

    public String getWeapon() {
        return weapon;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setHitPoints(int hitPoints) {
        this.hitPoints = hitPoints;
    }

    public void setStrength(int strength) {
        this.strength = strength;
    }

    public void setWeapon(String weapon) {
        this.weapon = weapon;
    }

    /*This write method creates an ArrayList called values and sets the name,
    * hitPoints, strength, and weapon with positions 0-3 in the ArrayLists and adds them to the list.*/
    @Override
    public List<String> write() {

        List<String> values = new ArrayList<>();
        values.add(0, this.name);
        values.add(1,"" + this.hitPoints);
        values.add(2,"" + this.strength);
        values.add(3,"" + this.weapon);
        return values;
    }

    /*This read method checks to see if the passed in list parameter is not null and has
    * more than 0 items in it. Once the check is complete, it sets the contents of the list
    * into the fields in this class.*/
    @Override
    public void read(List<String> savedValues) {

        if(savedValues != null && savedValues.size() > 0) {
            this.name = savedValues.get(0);
            this.hitPoints = Integer.parseInt(savedValues.get(1));
            this.strength = Integer.parseInt(savedValues.get(2));
            this.weapon = savedValues.get(3);
        }

    }


    @Override
    public String toString() {
        return "Player{" +
                "name='" + name + '\'' +
                ", hitPoints=" + hitPoints +
                ", strength=" + strength +
                ", weapon='" + weapon + '\'' +
                '}';
    }
}
