class Profesor extends Employee implements Workabl,Servise {
    public int salary;
    public int lecture;

    public Profesor(String name, String surname, String departament,boolean military, int salary, int lecture) {
        super(name, surname, departament,military);
        this.lecture = lecture;
        this.salary = salary;
    }



    @Override
    public void displaySalary() {
        System.out.println("Працівник:" + name + "" + surname + "" + departament);
    }

    @Override
    public double calculateSalary() {

        return salary * lecture;
    }

    @Override
    public void duty() {
        if (military) {
        System.out.println("Заступає в наряди.");
    } else {
        System.out.println("Не заступає в наряд.");
    }

    }

    @Override
    public void performDuties() {

    }


}