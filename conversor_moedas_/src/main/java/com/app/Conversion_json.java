package com.app;

import com.google.gson.Gson;
import com.google.gson.JsonIOException;
import com.google.gson.JsonSyntaxException;

public class Conversion_json {
  private Conversor conversor;

  public Conversion_json(Conversor conversor) {
    this.conversor = conversor;
  }

  public Conversor getConversor() {
    return conversor;
  }

  public void Convesion_json_Obj(String json) {
    try {
      Gson gson = new Gson();
      Conversor conversor = gson.fromJson(json, Conversor.class);
      this.conversor = conversor;

    } catch (JsonSyntaxException | JsonIOException e) {
      e.getMessage();
    } catch (NullPointerException | IllegalStateException e) {
      e.getMessage();
    }

  }

}
