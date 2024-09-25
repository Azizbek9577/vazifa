public class Student {
    private String ism;
    private String familiya;
    private String birthdate;
    private String hobbies;

    public Student(String ism, String familiya, String birthdate, String hobbies) {
        this.ism = ism;
        this.familiya = familiya;
        this.birthdate = birthdate;
        this.hobbies = hobbies;
    }


    public String getIsm() {
        return ism;
    }

    public String getFamiliya() {
        return familiya;
    }

    public String getBirthdate() {
        return birthdate;
    }

    public String getHobbies() {
        return hobbies;
    }

    public String getHobbilar() {
        return null;
    }
}


