package translator.model;

import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

public class Word {

    private StringProperty original;
    private StringProperty translated;

    public Word() {
        this(null, null);
    }

    public Word(String from, String to) {
        this.original = new SimpleStringProperty(from);
        this.translated = new SimpleStringProperty(to);
    }

    public String getOriginal() {
        return original.get();
    }

    public void setOriginal(String original) {
        this.original.setValue(original);
    }

    public String getTranslated() {
        return translated.get();
    }

    public void setTranslated(String translated) {
        this.translated.setValue(translated);
    }

    public StringProperty originalProperty() {
        return original;
    }

    public StringProperty translatedProperty() {
        return translated;
    }
}
