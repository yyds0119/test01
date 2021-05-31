package entity;

public class Pet {
    private Integer id;
    public String name;
    public Integer type;
    private Integer love;
    private Integer age;
    public Pet() {
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Pet{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", type=" + type +
                ", love=" + love +
                ", age=" + age +
                '}';
    }

    public Pet(Integer id, String name, Integer type, Integer love, Integer age) {
        this.id = id;
        this.name = name;
        this.type = type;
        this.love = love;
        this.age = age;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    public Integer getLove() {
        return love;
    }

    public void setLove(Integer love) {
        this.love = love;
    }

    public Pet(Integer id, String name, Integer type, Integer love) {
        this.id = id;
        this.name = name;
        this.type = type;
        this.love = love;
    }
}
