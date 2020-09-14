package pANDm;

import java.util.ArrayList;
import java.util.Scanner;

public class Planet extends Orbital{
    private int moons;
    private ArrayList<Moon> listMoon;

    public Planet(int radiusSize, String name, int moons) {
        super(radiusSize, name);
        this.moons = moons;
        listMoon = new ArrayList<Moon>();
        createMoons(moons);
    }

    public ArrayList<Moon> getListMoon() {
        return listMoon;
    }

    public void setListMoon(ArrayList<Moon> listMoon) {
        this.listMoon = listMoon;
    }

    public int getMoons() {
        return moons;
    }

    public void setMoons(int moons) {
        this.moons = moons;
    }

    public void createMoons(int moons){
//        Scanner console = new Scanner(System.in);
//        int radius = 0;
//        String name = "";
        for (int i = 0; i < moons ; i++) {
//            System.out.println("What is the radius of the moon?");
//            radius = console.nextInt();
//            System.out.println("What is its name?");
//            name = console.next();

            Moon moon = new Moon(123,"asf",true);
            listMoon.add(moon);
        }
    }
    public int amountOfMoons(){
        return listMoon.size();
    }
    public int calculateDistance(Planet p1, Planet p2){
        int value = p1.getRadiusSize()*2 + p2.getRadiusSize()*2;
        return value;
    }
    @Override
    public String toString() {
        return getName() + " is " + getRadiusSize() + " km in radius and has " + moons + " moon(s) called " + getListMoon();
    }
}
