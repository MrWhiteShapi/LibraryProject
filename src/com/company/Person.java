package com.company;

import java.util.ArrayList;
import java.util.UUID;

public class Person {
    protected String name, surname, gander;
    protected int age ;

    public String getName() {return name;}

    public void setName(String name) {this.name = name;}

    public String getSurname() {return surname;}

    public void setSurname(String surname) {this.surname = surname;}

    public String getGandre() {return gander;}

    public void setGandre(String gandre) {this.gander = gandre;}

    public int getAge() {return age;}

    public void setAge(int age) {this.age = age;}

    public Person(String name, String surname, String gandre, int age) {
        this.name = name;
        this.surname = surname;
        this.gander  = gandre;
        this.age = age;}
     public Person(){}
}





class Customer extends Person{
    private  final String uniqIdCustommer ;
    private String uniqIdAbonement;
    private ArrayList<Book> takedBooks = new ArrayList<>();
    private Abonement customerAbonement;
    private int balance;
    {
        uniqIdCustommer = "IdCustomer" + UUID.randomUUID().toString();
        customerAbonement.setOwnerId(uniqIdCustommer);
        customerAbonement.activeAbonement();
        uniqIdAbonement = customerAbonement.getUniqIdAbonement();
    }
    //Метод позволяет читателю взять книгу из библиотеки *доделать
    public void takeBook(Book book){
        takedBooks.add(book);
    }
    //Метод возвращает книгу которую взял читатель *перегрузить
    public void returnBook(String bookName){}
    //Вернуть все книги сразу
    public void returnAllBooks(){}
    //Попросить совета по книгам
    public void askForHelp(){}

    public Customer(String name, String surname, String gandre, int age, String uniqIdCustommer, String uniqIdAbonement, ArrayList<Book> takedBooks, Abonement customerAbonement, int balance) {
        super(name, surname, gandre, age);
        this.uniqIdAbonement = uniqIdAbonement;
        this.takedBooks = takedBooks;
        this.customerAbonement = customerAbonement;
        this.balance = balance;
    }



//Класс Консультант
class Consultant extends Person implements ConsultantListener{
    private final String uniqIdConsultant;
    private static String salary;
    public Consultant(String name, String surname, String gander, int age, int salary) {}

    {uniqIdConsultant = "IdConsultant" + UUID.randomUUID().toString();}

    @Override
    public String toString(){
        return "";
    }

    @Override//Найти определенную книгу по строке
    public Book findBook(String bookTitle) {
        return null;
    }

    @Override//Найти книгу по обьекту
    public Book findBook(Book book) {return null;}


    @Override
    public void takeOutTrash() {}

    @Override
    public void unloadBook() {}

    @Override
    public void generalCleaning() {}

    @Override//Предложить читателю книгу
    public Book offerBook() {return null;}

}



//Класс Библиотекарь
class Librarian extends Person implements LibrarianListener{
    private final String uniqIdLibrarian;
    private static String salary;
    private static Librarian libraryInstance;
    private Librarian(){};
    public static   Librarian getInstance(){
        if(libraryInstance==null){
            libraryInstance = new Librarian();
        }return  libraryInstance;
    }

    {uniqIdLibrarian = "IdLibrarian" + UUID.randomUUID().toString();}

    @Override
    public String toString(){
        return "";
    }

    @Override
    public Book findBook(String bookTitle) {
        return null;
    }

    @Override
    public Book findBook(Book book) {
        return null;
    }

    @Override
    public Book giveBook() {
        return null;
    }

    @Override
    public void cancelAbonement() {}

    @Override
    public void acceptBook(Book book) {}

}




//Класс ДИРЕКТОР
class Director extends Person implements DirectorListener {
    private static String salary;
    private final String uniqIdDirector;
    private static Director directorInstance;
    private Director(){}

    public static Director getInstance(){
        if(directorInstance==null){
            directorInstance = new Director();
        }return  directorInstance;
    }

    {uniqIdDirector = "IdDirector" + UUID.randomUUID().toString();}

    @Override
    public String toString(){return "";}

    @Override
    public void dismissEmployee() {}

    @Override
    public void increaseSalary(Person employee, int boost) {}

    @Override
    public void lowSalary(Person employee, int boost) {}
}

interface ConsultantListener{
    public Book findBook(String bookTitle);
    public Book findBook(Book book);
    public void takeOutTrash();
    public void unloadBook();
    public void generalCleaning();
    public Book offerBook();
}
interface LibrarianListener{
    public Book findBook(String bookTitle);
    public Book findBook(Book book);
    public Book giveBook();
    public void  cancelAbonement();
    public void acceptBook(Book book);
}
interface DirectorListener{
    public void dismissEmployee();
    public void increaseSalary(Person employee, int boost);
    public void lowSalary(Person employee, int boost);
}