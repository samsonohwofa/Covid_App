package com.example.DebCovidApp;

public class format {

    private String TitleName;
    private String TextBox;
    private String Title2;
    private String TextBox2;
    private int Thumbnail;


    public format(String name, String textbox, String title2, String textbox2, int thumbnail){

        TitleName = name;
        TextBox = textbox;
        Title2 = title2;
        TextBox2 = textbox2;
        Thumbnail = thumbnail;

    }


    public  String getTitleName(){ return TitleName; }

    public String getTextBox(){ return TextBox; }

    public String getTitle2(){
        return Title2;
    }

    public String getTextBox2(){
        return TextBox2;
    }

    public int getThumbnail(){
        return Thumbnail;
    }
}
