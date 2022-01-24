package com.oguzhan.bektas.efectivejava.item12;

public class Request {

    private String header;
    private String body;

    public String getHeader() {
        return header;
    }

    public void setHeader(String header) {
        this.header = header;
    }

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }

    @Override
    public String toString() {
        return "Request{" +
                "header='" + header + '\'' +
                ", body='" + body + '\'' +
                '}';
    }
}
