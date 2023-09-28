package ra.entity;

public class Employee {
    private int id;
    private String name;
    private int age;

    public Employee() {
    }

    public Employee(int id, String name, int age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }
     public void chamCong(){
         System.out.println("Đã chấm công");
     }
    public void work(){
        System.out.println("Đang làm việc");
    }


}
