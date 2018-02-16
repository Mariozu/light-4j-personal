package com.networknt.miAsistente.factory.RangoComponents;

import com.google.gson.Gson;
import com.networknt.miAsistente.DTO.LabelDto;
import com.networknt.miAsistente.factory.IComponent;

public class Layout implements IComponent{
  @Override
  public LabelDto draw(){
    LabelDto layoutDto = new LabelDto();
    return layoutDto;
  }
}
