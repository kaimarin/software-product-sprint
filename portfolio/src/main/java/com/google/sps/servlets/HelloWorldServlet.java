package com.google.sps.servlets;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.google.gson.Gson;

/** Handles requests sent to the /hello URL. Try running a server and navigating to /hello! */
@WebServlet("/hello")
public class HelloWorldServlet extends HttpServlet {

  @Override
  public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
    response.setContentType("application/json");
    List<String> songs = new ArrayList<>();
    songs.add("9 5 . s o u t h  by J. Cole");
    songs.add("Alone Again by The Weeknd");
    songs.add("The Pale Moonlight by Kid Cudi");
    songs.add("Instant Crush by Daft Punk");
    String songsJson = new Gson().toJson(songs);
    response.getWriter().println(songsJson);
  }
}
