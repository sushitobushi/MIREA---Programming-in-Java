public class main {
    public static void main(String[] args) {
        Employee model = new Employee("Ruslan", 1500);
        EmployeeView view = new EmployeeView();
        EmployeeContr controller = new EmployeeContr(model, view);

        controller.updateView();

        controller.setEmployeeSalary(2000);

        controller.updateView();
    }
}