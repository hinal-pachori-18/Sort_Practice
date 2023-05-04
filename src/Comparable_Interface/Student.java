package Comparable_Interface;

class Student implements Comparable<Student>{
    int id;
    String name;
    int age;
    Student(int id,String name,int age){
        this.id = id;
        this.name = name;
        this.age = age;
    }

    @Override
    public int compareTo(Student o) {
        if (this.age <o.age){
            return 1;
        } else if (this.age>o.age) {
            return -1;
        }
        else
        {
            return 0;
        }
    }
}

