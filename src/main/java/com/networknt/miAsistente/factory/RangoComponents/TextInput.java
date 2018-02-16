package com.networknt.miAsistente.factory.RangoComponents;


import com.google.gson.Gson;
import com.networknt.miAsistente.DTO.LabelDto;
import com.networknt.miAsistente.factory.IComponent;

public class TextInput implements IComponent{
  @Override
  public LabelDto draw(){
    LabelDto textInput = new LabelDto();

    textInput.setId("textInputName");
    textInput.setType("textinput");
    textInput.setWidth("match");
    textInput.setHeight("wrap");
    textInput.setText("Name");

    return textInput;
  }
}
