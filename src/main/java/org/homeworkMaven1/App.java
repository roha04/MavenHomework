package org.homeworkMaven1;

/**
 * Hello world!
 *
 */
import com.google.gson.Gson;
public class App 
{
    public static void main( String[] args )
    {
        Person person = new Person("Rostyslav", "Voloshchak");
        Gson gson = new Gson();
        String json = gson.toJson(person);
        System.out.println(json);
    }
}

class Person {
    String name;
    String lastName;

    Person(String name, String lastName) {
        this.name = name;
        this.lastName = lastName;
    }
}

