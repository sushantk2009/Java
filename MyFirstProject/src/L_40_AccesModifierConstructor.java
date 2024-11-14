
class MyEmployee{
    private int id;
    private String name;
    //iske andar method class banayenge
    public String getName(){
        return name;
    }
    public void setName(String n){
        name=n;
    }
    public int getId(){
        return id;
    }
    public void setId(int i){
        id=i;
    }

}
public class L_40_AccesModifierConstructor {

    public static void main(String[] args) {

        MyEmployee sushant=new MyEmployee();
//        sushant.id=2554;
//        sushant.name="My name is sushant ";//---------->Ye private ho gaye... Direct Access nhi kr shakte hai

        sushant.setId(2546);
        sushant.setName("My name is sushant ");
        System.out.println(sushant.getId());
        System.out.println(sushant.getName());
    }
}
