import javax.swing.*;

public class Application {
    public static void main(String[] args) {
        String response;
        response = JOptionPane.showInputDialog("Enter Patient's First Name");
        String firstName = response;

        response = JOptionPane.showInputDialog("Enter Patient's Last Name");
        String lastName = response;

        response = JOptionPane.showInputDialog("Enter Patient's Gender");
        String gender = response;

        response = JOptionPane.showInputDialog("What Year was the Patient Born?");
        double dateOfBirth = Double.parseDouble(response);

        response = JOptionPane.showInputDialog("Enter weight in pounds");
        float weight = Float.parseFloat(response);

        response = JOptionPane.showInputDialog("Enter height in inches");
        float height = Float.parseFloat(response);

        double age = 2020 - dateOfBirth;

        HealthProfile PatientOne = new HealthProfile(firstName, lastName, gender, dateOfBirth);

        System.out.println("PATIENT INFORMATION");
        System.out.println("Patient First Name: \t" + PatientOne.getFirstName());
        System.out.println("Patient Last Name: \t\t" + PatientOne.getLastName());
        System.out.println("Patient Gender: \t\t" + PatientOne.getGender());
        System.out.println("Patient Age: \t\t\t" + age);
        HealthProfile.calculateWeight(weight); //stores weight in pounds
        HealthProfile.calculateHeight(height); //stores height in inches
        System.out.printf("Patient BMI: \t\t\t" + "%.2f",HealthProfile.calculateBMI(weight,height));

    }
}
