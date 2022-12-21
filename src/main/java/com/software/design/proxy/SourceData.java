package com.software.design.proxy;

import java.util.Objects;

public class SourceData {

    private final int source;

    public SourceData(int source) {
        this.source = source;
    }

    public String getSourceString() {
        return String.valueOf(source);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        SourceData that = (SourceData) o;
        return source == that.source;
    }

    @Override
    public int hashCode() {
        return Objects.hash(source);
    }
}
