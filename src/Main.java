//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Profesor profesor = new Profesor("Андрій"," Волощишин"," філософ.",true,12000,13);
        profesor.displaySalary();
        System.out.println("Зарплата:" +  profesor.calculateSalary() + " грн.");
        profesor.duty();
        profesor.performDuties();


        Administrator administrator = new Administrator("Тарас"," Гембара"," математик.",false,145,12,35000);
        administrator.displaySalary();
        System.out.println("Зарплата:" + administrator.calculateSalary() + " грн.");
        administrator.duty();
        administrator.performDuties();




    }


}