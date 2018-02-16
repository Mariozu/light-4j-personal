package com.networknt.miAsistente.DTO;

public class LabelDto {

  private String type = "label";

  private String id = "labelName";

  private String width = "wrap";

  private String height = "wrap";

  private String text = "Name:";

  private String text_size = "22sp";

  public String getType(){ return this.type;}

  public String getId(){return this.id;}

  public String getWidth(){return this.width;}

  public String getHeight(){return this.height;}

  public String getText(){return this.text;}

  public String getText_size(){return this.text_size;}

  public void setType(String type){this.type = type;}

  public void setId(String id){this.id = id;}

  public void setWidth(String width){this.width = width;}

  public void setHeight(String height){this.height = height;}

  public void setText(String text){this.text = text;}

  public void setText_size(String text_size){this.text_size = text_size;}
}
