package rooms;

import people.Person;
import items.Item;

import java.util.Arrays;

public abstract class Room{

    private Person[] occupants;
    public boolean explored;
    private int x, y;

    public Room (boolean[] doors, Person[] occupants, int x, int y)
    {
    	this.x = x;
    	this.y = y;
        this.occupants = occupants;
        this.explored = false;
    }

    public  Person[] getOccupants() {
        return occupants;
    }

    public void setOccupants(Person[] occupants) {
        this.occupants = occupants;
    }

    
    public void addOccupant(Person p)
    {
        this.occupants = Arrays.copyOf(this.occupants,this.occupants.length+1);
        this.occupants[this.occupants.length-1] = p;
        p.setRoom(this);
    }
    
    public int getX()
    {
    	return x;
    }
    
    public int getY()
    {
    	return y;
    }
    public abstract void print();





}
