package com.networknt.miAsistente.factory.RangoComponents;

import com.google.gson.Gson;
import com.networknt.miAsistente.DTO.LabelDto;
import com.networknt.miAsistente.factory.IComponent;

public class Label implements IComponent{
  @Override
  public LabelDto draw() {
     LabelDto label = new LabelDto();
     return label;
  }
}
