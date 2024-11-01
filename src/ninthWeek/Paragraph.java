package ninthWeek;

public class Paragraph implements ArticleComponent {
    private String text;

    public Paragraph(String text) {
        this.text = text;
    }

    @Override
    public void display() {
        System.out.println("Paragraph: " + text);
    }
}