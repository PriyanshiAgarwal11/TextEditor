public class UnderlineDecorator extends TextDecorator {
    public UnderlineDecorator(Text decoratedText) {
        super(decoratedText);
    }

    @Override
    public String getContent() {
        return "<u>" + decoratedText.getContent() + "</u>";
    }
}
