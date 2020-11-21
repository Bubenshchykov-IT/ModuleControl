package com.company;

public class Main
{
    public static void main(String[] args)
    {
        Person [] staff = new Person[9];
        //
        staff[0] = new General ("Taras", "Shevchenko", 60, true, 2);
        //
        staff[1] = new Commander ("Andriy", "Voronin", 45, 3, (General) staff[0], true);
        staff[2] = new Commander ("Petro", "Fomenko", 40, 10, (General) staff[0], true);
        //
        staff[3] = new Soldier ("Alexander", "Petrov", 25, "high", (Commander)staff[1], true);
        staff[4] = new Soldier ("Alexander", "Soroka", 26, "high", (Commander)staff[1], true);
        staff[5] = new Soldier ("Andriy", "Petrov", 20, "none", (Commander)staff[1], false);
        //
        staff[6] = new Soldier ("Evgen", "Franko", 23, "high", (Commander)staff[2], true);
        staff[7] = new Soldier ("Oleg", "Trepko", 22, "high", (Commander)staff[2], true);
        staff[8] = new Soldier ("Danyil", "Petrov", 20, "none", (Commander)staff[2], false);

        System.out.println("\nAbility To Fight\n");
        for (int i = 0; i != staff.length; i++)
        {
            System.out.println("ToFight person "+ (i+1)+": ");
            try {
                staff[i].toFight();
            } catch (ToFightException e) {
                System.out.println(e.getMessage());
            }
        }
        System.out.println("\nReport Procedure\n");
        for (int i = 0; i != staff.length; i++)
        {
            System.out.println("ToReport person "+ (i+1)+": ");
            try {
                staff[i].toReport();
            } catch (ToReportException e) {
                System.out.println(e.getMessage());
            }
            System.out.println();
        }
    }
}
