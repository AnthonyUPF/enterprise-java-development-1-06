import java.io.FileWriter;
import java.io.IOException;


public class Main {
    public static void main(String[] args) throws IOException{


        Employee [] Employees=new Employee[10];
        for(int i=0; i<Employees.length;i++){

            double salary=Math.round(Math.random()*1000+1000);
            int age= (int) (Math.random()*10+18);

            if(i%2==0){
                Employees[i]= new Employee("Employee "+i,age,salary);
            }else{
                Employees[i]= new Intern("Employee "+i,age,salary);
            }
        }

        listEmployees(Employees);
    }

    public static void listEmployees(Employee [] Employees) throws IOException {
        FileWriter writer = new FileWriter("listEmployees.txt", false);

        for(Employee employee:Employees){
            writer.write("Id: "+employee.getId()+"\n");
            writer.write("Name: "+employee.getName()+"\n");
            writer.write("Age: "+employee.getAge()+"\n");
            writer.write("Salary: "+employee.getSalary()+"\n");
            writer.write("===================\n");
        }
        writer.close();
        System.out.println("Finished Method");

    }
}