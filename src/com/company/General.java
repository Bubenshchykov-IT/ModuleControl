package com.company;

public class General extends Person
{
    private int myCommanders;
    private boolean available;

    public General (String n, String s, int a, boolean available, int myCommanders)
    {
        super (n, s, a);
        this.available = available;
        this.myCommanders = myCommanders;
    }

    public void toFight() throws ToFightException {
        if(myCommanders == 0)
            throw new ToFightException("Cannot fight without commanders");

        if(available) {
            System.out.println("Can fight");
        } else {
            System.out.println("Cannot fight");
        }
    }

    public void toReport() throws ToReportException {
        if(myCommanders == 0)
            throw new ToReportException("Cannot report without commanders");
        System.out.println("I am General: "+toString());
    }
}
