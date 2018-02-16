
package com.networknt.miAsistente.handler;

import com.google.gson.Gson;
import com.networknt.miAsistente.DTO.LabelDto;
import com.networknt.miAsistente.DTO.LayoutDto;
import com.networknt.miAsistente.factory.ComponentsFactory;
import com.networknt.miAsistente.factory.IComponent;
import io.undertow.server.HttpHandler;
import io.undertow.server.HttpServerExchange;
import io.undertow.util.HttpString;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class CardViewCardIdGetHandler implements HttpHandler {
    @Override
    public void handleRequest(HttpServerExchange exchange) throws Exception {
      exchange.getResponseHeaders().add(new HttpString("Content-Type"), "application/json");
      LayoutDto layoutDto = new LayoutDto();
      layoutDto = startFactory(layoutDto);
      Gson gson = new Gson();
      String jsonString = gson.toJson(layoutDto);
      exchange.getResponseSender().send(jsonString);

    }

    public LayoutDto startFactory(LayoutDto layoutDto){
      ComponentsFactory componentsFactory = new ComponentsFactory();
      ArrayList<LabelDto> arrayOfComponents = new ArrayList<>();
      IComponent label = componentsFactory.getComponent("LABEL");
      IComponent textInput = componentsFactory.getComponent("TEXTINPUT");
      IComponent layout = componentsFactory.getComponent("LAYOUT");
      arrayOfComponents.add(label.draw());
      arrayOfComponents.add(textInput.draw());
      layoutDto.setChilds(arrayOfComponents);
      return layoutDto;
    }

    public String getCardView(){
      return("[{\"id\":\"layout1\",\"type\":\"layout\",\"width\":\"match\",\"height\":\"wrap\",\"orientation\":\"vertical\",\"childs\":[{\"type\":\"label\",\"id\":\"labelName\",\"width\":\"wrap\",\"height\":\"wrap\",\"text\":\"Name:\",\"text_size\":\"22sp\"},{\"type\":\"textinput\",\"id\":\"textInputName\",\"width\":\"match\",\"height\":\"wrap\",\"text\":\"Name\"}]},{\"id\":\"layout2\",\"type\":\"layout\",\"width\":\"match\",\"height\":\"wrap\",\"orientation\":\"horizontal\",\"gravity\":\"center\",\"childs\":[{\"type\":\"button\",\"id\":\"btnCancel\",\"width\":\"wrap\",\"height\":\"wrap\",\"text\":\"Cancel\",\"click\":{\"action\":\"clear\",\"data\":[{\"type\":\"textinput\",\"id\":\"textInputName\"}]}},{\"type\":\"button\",\"id\":\"btnSend\",\"width\":\"wrap\",\"height\":\"wrap\",\"text\":\"Send\",\"click\":{\"action\":\"clear\",\"$urlApi\":\"endpoint.com\",\"$urlApiAction\":\"save\",\"method\":\"post\",\"data\":[{\"type\":\"textinput\",\"id\":\"textInputName\"}]}},{\"type\":\"layout\",\"id\":\"layout3\",\"width\":\"match\",\"height\":\"wrap\",\"orientation\":\"horizontal\",\"gravity\":\"center\",\"childs\":[{\"type\":\"checkbox\",\"width\":\"wrap\",\"height\":\"wrap\",\"text\":\"check 1\"},{\"type\":\"checkbox\",\"width\":\"wrap\",\"height\":\"wrap\",\"text\":\"check 2\",\"checked\":\"true\"}]},{\"type\":\"radiogroup\",\"id\":\"layout4\",\"width\":\"match\",\"height\":\"wrap\",\"orientation\":\"horizontal\",\"gravity\":\"center\",\"childs\":[{\"type\":\"radiobutton\",\"width\":\"wrap\",\"height\":\"wrap\",\"text\":\"radio 1\"},{\"type\":\"radiobutton\",\"width\":\"wrap\",\"height\":\"wrap\",\"text\":\"radio 2\"}]},{\"type\":\"layout\",\"id\":\"layout5\",\"width\":\"match\",\"height\":\"wrap\",\"orientation\":\"vertical\",\"childs\":[{\"type\":\"switch\",\"width\":\"wrap\",\"height\":\"wrap\",\"text\":\"Switch\"},{\"type\":\"togglebutton\",\"width\":\"wrap\",\"height\":\"wrap\",\"text_on\":\"ON\",\"text_off\":\"OFF\",\"checked\":\"true\"},{\"type\":\"progressbar\",\"width\":\"match\",\"height\":\"wrap\",\"max\":\"100\",\"progress\":\"40\",\"style\":\"bar\"},{\"type\":\"progressbar\",\"width\":\"match\",\"height\":\"wrap\",\"style\":\"circle\"},{\"type\":\"progressbar\",\"width\":\"match\",\"height\":\"wrap\",\"max\":\"100\",\"progress\":\"80\",\"style\":\"seek\"}]}]}]");
    }
}
