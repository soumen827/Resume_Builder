import java.util.Scanner;
public class ResumeInput {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your name:");
        String name = sc.nextLine();
        System.out.println("Enter your email:");
        String email = sc.nextLine();
        System.out.println("Enter your education:");
        String education = sc.nextLine();
        System.out.println("Enter your skills (comma separated):");
        String skills = sc.nextLine();
        System.out.println("Enter your experience:");
String experience = sc.nextLine();
// Gemini integration step for experience
System.out.println("To enhance your experience section, please visit:");
System.out.println("   https://gemini.google.com/app?hl=en-IN");
System.out.println("Copy and paste this line into Gemini:");
System.out.println("   In a single short para in 25 words generate my experience for Resume " + experience);
System.out.println("Then copy the generated text from Gemini and paste it here:");
String enhancedExperience = sc.nextLine(); // user pastes Gemini output
        Resume resume = new Resume(name, email, education, skills, enhancedExperience);
        ATS ats = new ATS();
        int score = ats.calculateATS(resume);
        ResumeDocGenerator.generateDoc(resume, score);
        System.out.println("Resume.docx created ");//with ATS Score: " + score
        sc.close();
    }
}
