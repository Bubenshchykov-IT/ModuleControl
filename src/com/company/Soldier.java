package com.company;

public class Soldier extends Person
{
    private String education;
    private Commander myCap;
    private boolean available;

    public Soldier (String n, String s, int a, String education, Commander myCap, boolean available)
    {
        super(n, s, a);
        this.education = education;
        this.myCap = myCap;
        this.available = available;
    }

    public void toFight() throws ToFightException {
        if (myCap == null)
            throw new ToFightException("Cannot fight without Commander");
        if (available)
            System.out.println("Can fight");
        else
            System.out.println("Cannot fight");
    }

    public void toReport() throws ToReportException {
        if(myCap == null)
            throw new ToReportException("Cannot report without commander");
        System.out.println("I am Soldier: " +toString());
        System.out.println("My Commander: " + myCap.toString());
    }
}
