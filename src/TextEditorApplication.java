public class TextEditorApplication {

    public static void main(String[] args) {

        Text finalText = new UnderlineDecorator(new ItalicDecorator(new BoldDecorator(new SimpleText("Hello, Priyanshi!"))));
        System.out.println("Underline + Italic + Bold: " + finalText.getContent());
    }
}
