public class L_38_Creating_java_class {
    static class Employee {
        int id;
        String name;
        int Salary;
        String Detail;
        public void PrintDetail(){     //class ka andar method banaya hai
            // Void me hum kuch return nhi karte
            System.out.println("My id is: "+id);
            System.out.println("My name is: "+name);

        }

        public int getSalary() { // idhar void nhi hai to return hoga
            return Salary;
        }
        public String getDetail(){
            System.out.println("Work Detail are: "+Detail);
            return null;
        }
    }

    public static void main(String[] args) {
//        L_38_Creating_java_class outer = new L_38_Creating_java_class();
//        Employee company = outer.new Employee();
        Employee sushant =new Employee();
        Employee Yash =new Employee();
        //Attributes for Sushant
        sushant.id = 208;
        sushant.name = "Kakashi The Boss";
        sushant.Salary=50000;
        sushant.Detail="Finance management";

        //Attributes for Yash
        Yash.id=231;
        Yash.name="Yash Giri The Coder";
        Yash.Salary=40000;
        Yash.Detail="Software Developer of the compney ";
        int YSalary=Yash.getSalary();
        System.out.println("Yash Salary is: "+YSalary);

//printing the attributes
//        System.out.println(company.name);
//        System.out.println(company.id);

        sushant.PrintDetail();  //PrintDetaile se direct attributes ko access ke shakte hai
        Yash.PrintDetail();

        int Salary=sushant.getSalary();
        System.out.println("Sushant Salary is: "+Salary);


        String Detail=sushant.getDetail();
        String YDetail=Yash.getDetail();
    }
}
