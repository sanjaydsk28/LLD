package oops.SOLID.singleResponsibilityPrinciple.before;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public  class SaveEmployeeUtil {
    public static StringBuilder serializeEmployeeData(Employee employee) {
        StringBuilder employeeData = new StringBuilder();
        employeeData.append("### EMPLOYEE RECORD ####");

        employeeData.append(System.lineSeparator());
        employeeData.append("NAME: ");
        employeeData.append(employee.getFirstName() + " " + employee.getLastName());
        employeeData.append(System.lineSeparator());

        employeeData.append("POSITION: ");
        employeeData.append(employee.getClass().getTypeName());
        employeeData.append(System.lineSeparator());

        employeeData.append("EMAIL: ");
        employeeData.append(employee.getEmail());
        employeeData.append(System.lineSeparator());

        employeeData.append("MONTHLY WAGE: ");
        employeeData.append(employee.getMonthlyIncome());
        employeeData.append(System.lineSeparator());

        return employeeData;
    }

    public static Path getPath(Employee employee) {
        Path path = Paths.get(employee.getFullName()
                .replace(" ","_") + ".rec");
    }

    public static  void save(Employee employee){
        StringBuilder sb = new StringBuilder();
        try {
            sb = serializeEmployeeData(employee);
            Path path = getPath(employee);
            Files.write(path, sb.toString().getBytes());
            System.out.println("Saved employee " + employee.toString());
        } catch (IOException e){
            System.out.println("ERROR: Could not save employee. " + e);
        }
    }

}
