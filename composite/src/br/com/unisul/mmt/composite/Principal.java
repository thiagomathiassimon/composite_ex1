package br.com.unisul.mmt.composite;

public class Principal {

    public static void main(String[] args) {
        EmployeeComposite CEO = new EmployeeComposite("Rich", "CEO");

        EmployeeComposite managerSales = new EmployeeComposite("Joao", "Head Sales");
        EmployeeComposite managerMarketing = new EmployeeComposite("Maria", "Head Market");
        CEO.add(managerSales);
        CEO.add(managerMarketing);

        EmployeeLeaf emp1 = new EmployeeLeaf("Jose", "Sales");
        EmployeeLeaf emp2 = new EmployeeLeaf("Pedro", "Sales");
        managerSales.add(emp1);
        managerSales.add(emp2);

        EmployeeLeaf emp3 = new EmployeeLeaf("Huguinho", "Marketing");
        EmployeeLeaf emp4 = new EmployeeLeaf("Zeinho", "Marketing");
        managerSales.add(emp3);
        managerSales.add(emp4);

        CEO.showDetails();
        System.out.println("Count subordinates:".concat(String.valueOf(CEO.getSubordinateCount())));
        System.out.println("Count employees:".concat(String.valueOf(CEO.getEmployeeCount())));
    }
}
