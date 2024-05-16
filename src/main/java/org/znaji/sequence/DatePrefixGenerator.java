package org.znaji.sequence;

public class DatePrefixGenerator {
    private String pattern;

    public void setPattern(String pattern) {
        this.pattern = pattern;
    }

    public String getPattern() {
        return pattern;
    }

    public String getPrefix() {
        return pattern + "-";
    }
}
