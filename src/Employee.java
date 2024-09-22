abstract class Employee {
    public String name;
    public String surname;
    public String departament;
    public boolean military;

    public Employee(String name,String surname,String departament,boolean military){
        this.name = name;
        this.surname = surname;
        this.departament = departament;
        this.military = military;
    }

    public abstract  double calculateSalary();

    public void displaySalary(){
        System.out.println("Працівник:" + name + "" + surname);
    }
}
