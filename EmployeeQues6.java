
class EmployeeQues6{

    private String name;
    private int yearOfJoining;
    private String address;

    public EmployeeQues6(String name, int yoj, String address){
        this.name = name;
        this.yearOfJoining = yoj;
        this.address = address;
    }

    public String toString(){
        return String.format(this.name + "      " +  this.yearOfJoining + "         " + this.address);
    }

    public static void main(String[] args) {
        EmployeeQues6 emp1 = new EmployeeQues6("Robert", 1994, "64C. WallStreet");
        EmployeeQues6 emp2 = new EmployeeQues6("Sam", 2000, "68D. WallStreet");
        EmployeeQues6 emp3 = new EmployeeQues6("John", 1999, "26B. WallStreet");
        System.out.println("Name" + "      " + "Year of joining" + "      " + "Address");
        System.out.println(emp1);
        System.out.println(emp2);
        System.out.println(emp3);
    }
}