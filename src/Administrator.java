class Administrator extends Employee implements Workabl,Servise{
   public int hours;
   public int workingHours;
   public int salary;

    public Administrator(String name, String surname,String departament,boolean military,int hours,int workingHours,int salary) {
        super(name, surname, departament,military);
        this.hours = hours;
        this.workingHours = workingHours;
        this.salary = salary;
    }

    @Override
    public void displaySalary() {
        System.out.println("Працівник:" + name + "" + surname + "" + departament);
    }

    @Override
    public double calculateSalary() {

        return salary * hours ;
    }


    @Override
    public void duty() {

        }

    @Override
    public void performDuties() {

    }
}



