package com.ak.Pojo;

public class Text {
    private String text;
    private Size size;
    private int length;

    @Override
    public String toString() {
        return "Text{" +
                "text='" + text + '\'' +
                ", size=" + size +
                ", length=" + length +
                '}';
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public Size getSize() {
        return size;
    }

    public void setSize(Size size) {
        this.size = size;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }


    public static class Size{
            private String name;

            @Override
            public String toString() {
                return "color{" +
                        "name='" + name + '\'' +
                        '}';
            }

            public String getName() {
                return name;
            }

            public void setName(String name) {
                this.name = name;
            }
        }
}
