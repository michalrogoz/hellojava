package simple_projects.word_search;

import java.util.Comparator;

public class Word implements Comparable<Word> {
    int position;
    String text;

    public Word(int position, String text) {
        this.position = position;
        this.text = text;
    }

    public int getPosition() {
        return position;
    }

    public String getText() {
        return text;
    }

    @Override
    public int compareTo(Word o) {
        return Comparator.comparing(Word::getText)
                .thenComparing(Word::getPosition)
                .compare(this, o);
    }
}
