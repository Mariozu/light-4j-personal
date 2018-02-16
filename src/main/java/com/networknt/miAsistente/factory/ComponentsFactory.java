package com.networknt.miAsistente.factory;

import com.networknt.miAsistente.factory.RangoComponents.Label;
import com.networknt.miAsistente.factory.RangoComponents.Layout;
import com.networknt.miAsistente.factory.RangoComponents.TextInput;

public class ComponentsFactory {
  public IComponent getComponent(String componentType){

    switch (componentType){
      case "LAYOUT" : return new Layout();

      case "LABEL" : return new Label();

      case "TEXTINPUT" : return new TextInput();

      default : return null;
    }
  }
}
