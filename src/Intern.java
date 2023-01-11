public class Intern extends Employee{

    public Intern(String name, int age, double salary) {
        super(name,age,salary);
    }

    @Override
    public void setSalary(double salary) {
        if(salary<=20000){
            super.setSalary(salary);
        }else{
            super.setSalary(200000);
        }
    }




}
