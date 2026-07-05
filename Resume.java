public class Resume {
    private String name;
    private String email;
    private String education;
    private String skills;
    private String experience;

    // Constructor
    public Resume(String name, String email, String education, String skills, String experience) {
        this.name = name;
        this.email = email;
        this.education = education;
        this.skills = skills;
        this.experience = experience;
    }

    // Getters
    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public String getEducation() {
        return education;
    }

    public String getSkills() {
        return skills;
    }

    public String getExperience() {
        return experience;
    }
}
