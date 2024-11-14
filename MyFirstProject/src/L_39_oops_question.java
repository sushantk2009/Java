public class L_39_oops_question {
    static class Employee {  // Make Employee static
        int Salary;
        String Name;

        public int getSalary() {
            return Salary;
        }

        public String getName() {
            return Name;
        }

        public void setName(String n) {
            Name = n;
        }

        static class CellPone {
            public void Ringing() {
                System.out.println("Ringing...");
            }
            public void Vibrating() {
                System.out.println("Vibrating....");
            }
        }
        static class square{
        int side;
        public int area(){

            return side*side;
        }
        public int parimeter(){
            return 4*side;
        }
        }
        static class rectangle{
            int length;
            int width;
            public int area(){
                return length*width;
            }
            public int parimeter(){

                return 2*(length+width);
            }
        }



        public static void main(String[] args) {
            //PROBLEM:1
            Employee Sushant = new Employee();  // Directly create Employee instance
            Sushant.setName("My name is Sushant");
            Sushant.Salary = 3565;  // Directly assign Salary (public access)
            System.out.println(Sushant.getSalary());
            System.out.println(Sushant.getName());


            //PROBLEM:2
            CellPone phone = new CellPone();
            phone.Ringing();
            phone.Vibrating();

            //PROBLEM:3
            square sq= new square();
            sq.side=3;
            System.out.println("Area of The Square : "+sq.area());
            System.out.println(("Parimeter of The Square is : "+sq.parimeter()));

            //PROBLEM:4
            rectangle re= new rectangle();
            re.length=2;
            re.width=3;
            System.out.println("Area of Rectangle : "+re.area());
            System.out.println("Parimete of Rectangle : "+re.parimeter());



        }
    }
}