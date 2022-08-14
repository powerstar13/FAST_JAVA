package ch17;

public class EmployeeTest {

    public static void main(String[] args) {

        System.out.println(Employee.getSerialNum());

        Employee employeeLee = new Employee();
        employeeLee.setEmployeeName("이순신");

        Employee employeeKim = new Employee();
        employeeKim.setEmployeeName("김유신");

        System.out.printf("%s님의 사번은 %d\n", employeeLee.getEmployeeName(), employeeLee.getEmployeeId());
        System.out.printf("%s님의 사번은 %d\n", employeeKim.getEmployeeName(), employeeKim.getEmployeeId());
    }
}
