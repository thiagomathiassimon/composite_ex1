package br.com.unisul.mmt.composite;

import java.util.ArrayList;
import java.util.List;

public class EmployeeComposite implements EmployeeComponent {

    private String name;
    private String depto;
    private List<EmployeeComponent> subordinates = new ArrayList<>();

    public EmployeeComposite(String name, String depto) {
        this.name = name;
        this.depto = depto;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDepto() {
        return depto;
    }

    public void setDepto(String depto) {
        this.depto = depto;
    }

    public List<EmployeeComponent> getSubordinates() {
        return subordinates;
    }

    public void setSubordinates(List<EmployeeComponent> subordinates) {
        this.subordinates = subordinates;
    }

    public void add(EmployeeComponent component) {
        subordinates.add(component);
    }

    public void remove(EmployeeComponent component) {
        subordinates.remove(component);
    }

    @Override
    public void showDetails() {
        System.out.println("Name:".concat(getName()).concat(" /Depto:".concat(getDepto())));
    }

    @Override
    public int getSubordinateCount() {
        int count = 0;
        for (EmployeeComponent employee : subordinates) {
            count = count + employee.getSubordinateCount();
        }
        return count;
    }

    @Override
    public int getEmployeeCount() {
        int count = 1;
        for (EmployeeComponent employee : subordinates) {
            count = count + employee.getEmployeeCount();
        }
        return count;
    }
}
