package org.example.hello;

public class HelloWorld {

    private final Long id;

    private String content;

    public HelloWorld(Long id, String content){
        this.id = id;
        this.content = content;
    }

    public Long getId(){
        return id;
    }

    public String getContent(){
        return content;
    }

    public void setContent(String content){
        this.content = content;
    }

}
