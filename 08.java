// Name it as SimulatedDataSetGenerator.java

import java.util.HashSet;
import java.util.Set;

class Person{
    private static int nextId=1;

    private int id;
    private String name;

    public Person(String name)
    {
        this.id=nextId++;
        this.name=name;
    }
    public int getId()
    {
        return id;
    }
    public String getName()
    {
        return name;
    }
    @Override
    public String toString()
    {
        return "Person{" +
        "id=" + id +
        ", name='" + name + '\'' +
        '}';
    }
}
public class SimulatedDataSetGenerator {
    public static void main(String[] args){
        Set<Person> dataSet= generateDataSet(10);
        for(Person person: dataSet){
            System.out.println(person);
        }
    }
    private static Set <Person> generateDataSet(int size){
        Set<Person> dataSet=new HashSet<Person>();

        for (int i=0;i<size;i++){
            String name="Person"+(i+1);

            Person person=new Person(name);

            dataSet.add(person);
        }
        return dataSet;
    }
}