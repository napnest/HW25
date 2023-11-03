public class Human {
    private String name;
    private Integer age;
    private Double height;
    public String getName(){
        return name;
    }
    public Integer getAge(){
        return age;
    }
    public Double getHeight(){
        return height;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public void setHeight(Double height) {
        this.height = height;
    }

    public void setName(String name) {
        this.name = name;
    }
    public Human(){}
    public Human (String name, Integer age, Double height){
        this.name=name;
        this.age=age;
        this.height=height;
    }
}
