package lesson_eight;

import java.util.ArrayList;

public class Student {
  public String name;
  public int age;
  public boolean single;
  public String city;
  public ArrayList<Student> friends;

  public Student(String name, int age, boolean single, String city) {
    this.name = name;
    this.age = age;
    this.single = single;
    this.city = city;
    this.friends = new ArrayList<>();
  }

  public void introduce() {
    System.out.println("---");
    System.out.println("My name is " + this.name);
    System.out.println("I'm " + this.age + " years old");
    if (this.single) {
      System.out.println("I'm single");
    } else {
      System.out.println("I'm in a relationship ^_^ ");
    }
    System.out.println("My friends are:");
    for (Student s : friends) {
      System.out.println(s.name);
    }
  }
}

