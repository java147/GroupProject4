package com.company;

public class employee implements Person {

    private String Fname, Lname, ID, gender, position;
    private double rate;

    public employee(String firstname, String Lastname, String Gender, int count)
    {

        this.Fname = firstname;
        this.Lname = Lastname;
        this.gender = Gender;
        if(this.Fname.length() > 1 || this.Lname.length() > 1 || this.gender.length() > 1)
        {
            this.ID = this.Fname.charAt(0) + this.Lname.charAt(0) + "umbc" + this.gender.toUpperCase().charAt(0) + count;
            System.out.println(this.Fname + " " + this.Lname + " ID number is " + this.ID);
        }
        else
            {
            System.out.println("Missing name or gender, ID set to default 0");
            this.ID = "0";
            }
    }
    public employee ()
    {

        this.Fname = "blank";
        this.Lname = "blank";
        this.gender = "blank";
        int ID = 00000;
    }
    public double returnRate(){
        return rate;
    }
    public boolean hasBenefit(){
        return false;
    }
    public boolean haspension() {
        return false;
    }

    @Override
    public String getFirstName() {
        return Fname;
    }

    @Override
    public String getLastName() {
        return Lname;
    }

    @Override
    public String getGender() {
        return gender;
    }
    //  public String getName() {return Fname;}
 //   public String getGender() {return gender;}





}
