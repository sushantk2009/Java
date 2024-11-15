class MyMainEmployee {     //Ek Class bana diya
    private int id;
    private String name;
    private int salary;

    public MyMainEmployee() { //class name ka hi constructor banega
        id = 25;
        name = "My Name is Sushant ";
    }
    public int getId(){ //Method Define kar diye
        return id;
    }
    public String getName(){// Getter method to access the private variable 'name' from outside the class
        return name;
    }
    //PROBLEM JO LAST ME THA:
    public MyMainEmployee(int ssalary,int mid,String mname){
        salary=ssalary;
        id=mid;
        name=mname;
    }

}

public class L_42_Constructor {
    public static void main(String[] args) {

        MyMainEmployee sushant= new MyMainEmployee();
        System.out.println(sushant.getId());
        System.out.println(sushant.getName());
//------------------------------------------------------------------------
        //solution of problem
        MyMainEmployee kakashi =new MyMainEmployee(10000 ,548,"Pakistan");
        System.out.println(kakashi.getId());
        System.out.println(kakashi.getName());
    }
}
//CHAT GPT SE CONSTRUCTOR H
//class MyMainEmployee {
//    private int id;
//    private String name;
//
//    // Default constructor (no parameters)
//    public MyMainEmployee() {
//        id = 0;
//        name = "No Name";
//    }
//
//    // Constructor with only 'id' as a parameter
//    public MyMainEmployee(int id) {
//        this.id = id;
//        name = "No Name";
//    }
//
//    // Constructor with only 'name' as a parameter
//    public MyMainEmployee(String name) {
//        id = 0;
//        this.name = name;
//    }
//
//    // Constructor with both 'id' and 'name' as parameters
//    public MyMainEmployee(int id, String name) {
//        this.id = id;
//        this.name = name;
//    }
//
//    // Getter for 'id'
//    public int getId() {
//        return id;
//    }
//
//    // Getter for 'name'
//    public String getName() {
//        return name;
//    }
//}
//
//public class ConstructorOverloadingExample {
//    public static void main(String[] args) {
//        // Using default constructor
//        MyMainEmployee emp1 = new MyMainEmployee();
//        System.out.println("Employee 1 -> ID: " + emp1.getId() + ", Name: " + emp1.getName());
//
//        // Using constructor with only 'id'
//        MyMainEmployee emp2 = new MyMainEmployee(101);
//        System.out.println("Employee 2 -> ID: " + emp2.getId() + ", Name: " + emp2.getName());
//
//        // Using constructor with only 'name'
//        MyMainEmployee emp3 = new MyMainEmployee("Sushant");
//        System.out.println("Employee 3 -> ID: " + emp3.getId() + ", Name: " + emp3.getName());
//
//        // Using constructor with both 'id' and 'name'
//        MyMainEmployee emp4 = new MyMainEmployee(102, "John Doe");
//        System.out.println("Employee 4 -> ID: " + emp4.getId() + ", Name: " + emp4.getName());
//    }
//}
