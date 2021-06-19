package com.google.sps.servlets;

import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.google.gson.Gson;
import com.google.gson.stream.JsonWriter;

/** Handles requests sent to the /hello URL. Try running a server and navigating to /hello! */
@WebServlet("/hello")
public class HelloWorldServlet extends HttpServlet {

  @Override
  public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
    response.setContentType("application/json");
    Gson gson = new Gson();
    JsonWriter writer = new JsonWriter(new OutputStreamWriter(response.getOutputStream(), "UTF-8"));
    writer.beginArray();
    gson.toJson("9 5 . s o u t h  by J. Cole", "".getClass(), writer);
    gson.toJson("Alone Again by The Weeknd", "".getClass(), writer);
    gson.toJson("The Pale Moonlight by Kid Cudi", "".getClass(), writer);
    gson.toJson("Instant Crush by Daft Punk", "".getClass(), writer);
    writer.endArray();
    writer.close();
  }
}
