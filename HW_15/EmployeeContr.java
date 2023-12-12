public class EmployeeContr {
    private Employee model;
    private EmployeeView view;

    public EmployeeContr(Employee model, EmployeeView view) {
        this.model = model;
        this.view = view;
    }

    public void setEmployeeName(String name) {
        model.setName(name);
    }

    public void setEmployeeSalary(double salary) {
        model.setSalary(salary);
    }

    public String getEmployeeName() {
        return model.getName();
    }

    public double getEmployeeSalary() {
        return model.getSalary();
    }

    public void updateView() {
        view.printEmployeeDetails(model.getName(), model.getSalary());
    }
}