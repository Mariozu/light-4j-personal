package com.networknt.miAsistente.DTO;

import jdk.nashorn.api.scripting.JSObject;

import java.util.ArrayList;

public class LayoutDto {

  private String type = "layout";

  private String id = "layout1";

  private String width = "match";

  private String height = "wrap";

  private String orientation = "vertical";

  private ArrayList<LabelDto> childs;

  public String getType(){return this.type;}

  public String getId(){return this.id;}

  public String getWidth(){return this.width;}

  public String getHeight(){return this.height;}

  public String getOrientation(){return this.orientation;}

  public ArrayList<LabelDto> getChilds(){return this.childs;}

  public void setChilds(ArrayList<LabelDto> childs){this.childs = childs;}
}
