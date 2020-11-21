package com.company;

public class Commander extends Person
{
    private int countOfSoldiers;
    private General general;
    private boolean available;

    public Commander (String n, String s, int a, int countOfSoldiers, General general, boolean available)
    {
        super (n, s, a);
        this.countOfSoldiers = countOfSoldiers;
        this.general = general;
        this.available = available;
    }

    public void toFight() throws ToFightException {
        if(countOfSoldiers == 0) {
            throw new ToFightException("Cannot fight without soldiers");
        } else if(general == null)
            throw new ToFightException("Cannot fight without general");
        if(available) {
            System.out.println("Can fight");
        } else {
            System.out.println("Cannot fight");
        }
    }

    public void toReport() throws ToReportException {
        if(countOfSoldiers == 0) {
            throw new ToReportException("Cannot report without soldiers");
        } else if(general == null)
            throw new ToReportException("Cannot report without general");
        System.out.println("I am Commander: " +toString());
        System.out.println("My General: " + general.toString());
    }
}
