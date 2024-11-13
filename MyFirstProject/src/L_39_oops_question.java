public class L_39_oops_question {
    class Employee{
        int Salary;
        String Name;
        public int getSalary(){

            return Salary;
        }

        public String getName(){

            return Name;
        }
        public void setName(String n){
            Name=n;
        }
    }
    public void main(String[] args) {
        Employee Sushant=new Employee();
        Sushant.setName("My name is Sushant");
        Sushant.Salary=3565;

    }
}
