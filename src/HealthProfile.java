public class HealthProfile {
    private String firstName, lastName, gender;
    private double dateOfBirth;

    public HealthProfile (String firstName, String lastName, String gender, double dateOfBirth){
        this.firstName = firstName;
        this.lastName = lastName;
        this.gender = gender;
        this.dateOfBirth = dateOfBirth;
    }

    public String getFirstName() {
        return firstName;
    }
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getGender() {
        return gender;
    }
    public void setGender(String gender) {
        this.gender = gender;
    }

    public double getDateOfBirth() {
        return dateOfBirth;
    }
    public void setDateOfBirth(double dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public static float calculateWeight(float pounds){
        float weight = pounds * 703;
        return weight;
    }//end of weight calculator

    public static float calculateHeight(float inches){
        float height = (float) Math.pow(inches,2);
        return height;
    }//end of height calculator

    public static float calculateBMI(float weight, float height){
        return calculateWeight(weight) / calculateHeight(height);
    }//end of BMI calculator

}
