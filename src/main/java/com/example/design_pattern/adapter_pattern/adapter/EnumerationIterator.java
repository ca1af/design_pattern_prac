package com.example.design_pattern.adapter_pattern.adapter;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.Objects;

public class EnumerationIterator implements Iterator<Object> {
    Enumeration<?> enumeration;

    public EnumerationIterator(Enumeration<?> enumeration) {
        this.enumeration = enumeration;
    }

    @Override
    public boolean hasNext() {
        return enumeration.hasMoreElements();
    }

    @Override
    public Object next() {
        return enumeration.nextElement();
    }

    @Override
    public void remove() {
        throw new UnsupportedOperationException();
        // Enumerations 는 remove 를 지원하지 않으므로 예외를 던짐
    }
}
