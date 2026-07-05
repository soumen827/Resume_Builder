import org.apache.poi.xwpf.usermodel.*;
import java.io.FileOutputStream;
public class ResumeDocGenerator {
    public static void generateDoc(Resume resume, int score) {
        try {
            XWPFDocument document = new XWPFDocument();
            // Title
            XWPFParagraph title = document.createParagraph();
            title.setAlignment(ParagraphAlignment.CENTER);
            XWPFRun runTitle = title.createRun();
            runTitle.setText("Resume");
            runTitle.setBold(true);
            runTitle.setFontSize(22);
            // Contact
            XWPFParagraph contact = document.createParagraph();
            XWPFRun runContact = contact.createRun();
            runContact.setText(resume.getName() + "  |  " + resume.getEmail());
            runContact.setFontSize(14);
            runContact.addBreak();
            // Education
            XWPFParagraph edu = document.createParagraph();
            XWPFRun runEdu = edu.createRun();
            runEdu.setText("Education: " + resume.getEducation());
            runEdu.setFontSize(14);
            runEdu.addBreak();
            runEdu.setText("My academic journey has provided me with a strong foundation in both theoretical and practical aspects, preparing me to contribute effectively in any upcoming field.");
            runEdu.addBreak();
            // Skills
            XWPFParagraph skillsPara = document.createParagraph();
            XWPFRun runSkills = skillsPara.createRun();
            runSkills.setText("Skills:");
            runSkills.setBold(true);
            runSkills.setFontSize(14);
            runSkills.addBreak();
            for (String skill : resume.getSkills().split(",")) {
                XWPFRun skillRun = skillsPara.createRun();
                skillRun.setText("• " + skill.trim());
                skillRun.setFontSize(13);
                skillRun.addBreak();
            }
            XWPFRun skillExtra = skillsPara.createRun();
            skillExtra.setText("These skills will help me to encourage my knowledge in any upcoming fields and allow me to adapt quickly to new challenges.");
            skillExtra.setFontSize(13);
            skillExtra.addBreak();
            // Experience
            XWPFParagraph exp = document.createParagraph();
            XWPFRun runExp = exp.createRun();
            runExp.setText("Experience: " + resume.getExperience());
            runExp.setFontSize(14);
            runExp.addBreak();
            runExp.setText("My professional experience has shaped me into a versatile individual capable of handling responsibilities, collaborating with teams, and delivering impactful results.");
            runExp.addBreak();
           /* // ATS Score
            XWPFParagraph ats = document.createParagraph();
            XWPFRun runAts = ats.createRun();
            runAts.setText("ATS Score: " + score);
            runAts.setFontSize(14);
            runAts.addBreak();*/
            // Long Common Paragraph to fill page
            XWPFParagraph longPara = document.createParagraph();
            XWPFRun runLong = longPara.createRun();
            runLong.setFontSize(13);
            runLong.setText("Throughout my journey, I have consistently demonstrated a passion for technology and innovation. "
                + "I believe that my combination of academic knowledge, technical expertise, and professional experience "
                + "makes me a strong candidate for any role. I am eager to contribute to organizational growth, "
                + "while continuing to expand my own skills and knowledge base. My adaptability, persistence, and "
                + "commitment to excellence ensure that I can thrive in diverse environments and deliver meaningful results.");
            runLong.addBreak();
            FileOutputStream out = new FileOutputStream("Resume.docx");
            document.write(out);
            out.close();
            document.close();
            System.out.println("Full-page Resume.docx created successfully!");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
