package Question_2;

public class QuestionTwo {
    public static void main(String[] args) {
        EmployeesTax em = new EmployeesTax(10000);
        System.out.println("The tax is " + em.calculateTax());
    }
}

class EmployeesTax {
    double basicSalary;

    EmployeesTax(double basicSalary) {
        this.basicSalary = basicSalary;
    }

    double calculateTax() {
        double tax;
        if (basicSalary < 9000) {
            tax = basicSalary * 0.20;
        } else {
            tax = basicSalary * 0.25;
        }
        return tax;
    }
}
