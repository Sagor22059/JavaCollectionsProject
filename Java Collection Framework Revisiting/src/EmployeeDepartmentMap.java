import java.util.*;

public class EmployeeDepartmentMap {
    public static void main(String[] args) {
        HashMap<String, String> empDept = new HashMap<>();
        empDept.put("E001", "HR");
        empDept.put("E002", "Finance");
        empDept.put("E003", "IT");

        for (Map.Entry<String, String> entry : empDept.entrySet()) {
            System.out.println("Employee ID: " + entry.getKey() + ", Department: " + entry.getValue());
        }
    }
}
