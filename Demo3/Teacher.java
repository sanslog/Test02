package Demo3;

public class Teacher {
    //成员变量：
    private String id;
    private String name;
    private int age;

    //空参构造
    public Teacher() {
    }

    //有参构造
    public Teacher(String id, String name, int age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }

    //get and set
    public void setId(String id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
}
