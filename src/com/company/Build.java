package com.company;

import java.util.ArrayList;
import java.util.UUID;

abstract class Build {
    private String address, uniqIdBuild, title, architectureName;
    private int floors, yearFounded;

    {uniqIdBuild = "IdBuild" + UUID.randomUUID().toString();}
    protected Build(){}
    protected Build(String address, String uniqIdBuild, String title, String architectureName, int floors, int yearFounded) {
        this.address = address;
        this.uniqIdBuild = uniqIdBuild;
        this.title = title;
        this.architectureName = architectureName;
        this.floors = floors;
        this.yearFounded = yearFounded;
    }

    public String getAddress() {return address;}

    public void setAddress(String address) {this.address = address;}

    public String getTitle() {return title;}

    public void setTitle(String title) {this.title = title;}

    public String getArchitectureName() {return architectureName;}

    public void setArchitectureName(String architectureName) {this.architectureName = architectureName;}

    public int getFloors() {return floors;}

    public void setFloors(int floors) {this.floors = floors;}

    public int getYearFounded() {return yearFounded;}

    public void setYearFounded(int yearFounded) {this.yearFounded = yearFounded;}
}
class  Library extends Build{
    private static Library libraryInstance;
    private static ArrayList<Book> booksArchive = new ArrayList<>();
    private static ArrayList<Person> employees = new ArrayList<>();
    private static ArrayList<Customer> customers = new ArrayList<>();

    public static ArrayList<Customer> getCustomers() {return customers;}

    public static ArrayList<Book> getBooksArchive() {return booksArchive;}

    public static ArrayList<Person> getEmployees() {return employees;}

    @Override
    public String toString(){
        return "";
    }

    private Library(){}
    public static Library getInstance(){
        if(libraryInstance==null){
            libraryInstance = new Library();
        }return libraryInstance;
    }
}
