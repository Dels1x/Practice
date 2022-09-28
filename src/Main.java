public class Main {
    public static void main(String[] args) {

        EmployeeClass employeeClass = new EmployeeClass("James", 206);

        System.out.println(employeeClass.getName());
        System.out.println(employeeClass.getEmployeeNumber());

        EmployeeRecord employeeRecord = new EmployeeRecord("Chad", 303);

        System.out.println(employeeRecord.name());
        System.out.println(employeeRecord.employeeNumber());

    }
}
