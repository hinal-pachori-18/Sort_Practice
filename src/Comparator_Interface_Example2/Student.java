package Comparator_Interface_Example2;

public class Student {
    Integer id;
    String name;

    Student(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public Integer getId()
    {
        return  id;
    }
    public void setId()
    {
        this.id = id;
    }
    public String getName()
    {
        return name;
    }
    public void setName()
    {
        this.name = name;
    }
}
