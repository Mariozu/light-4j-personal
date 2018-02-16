package com.networknt.miAsistente.DTO;

public class TextInputDto {

  private String type = "textinput";

  private String id = "textInputName";

  private String width = "match";

  private String height = "wrap";

  private String text = "Name";

  public String getType(){ return this.type;}

  public String getId(){return this.id;}

  public String getWidth(){return this.width;}

  public String getHeight(){return this.height;}

  public String getText(){return this.text;}

  public void setType(String type){this.type = type;}

  public void setId(String id){this.id = id;}

  public void setWidth(String width){this.width = width;}

  public void setHeight(String height){this.height = height;}

  public void setText(String text){this.text = text;}

}
