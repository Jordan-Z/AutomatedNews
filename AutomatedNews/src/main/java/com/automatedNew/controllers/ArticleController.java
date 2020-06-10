package com.automatedNew.controllers;

import java.io.IOException;

import org.jsoup.Connection;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;

public class ArticleController {
	public static void main(String args[]) throws IOException {
		String page = "https://www.foxnews.com/us/sister-slain-federal-protective-officer-defund-police-ridiculous";
		// Connecting to the web page
		Connection conn = Jsoup.connect(page);
		// executing the get request
		Document doc = conn.get();
		// Retrieving the contents (body) of the web page
		String result = doc.body().text();
		System.out.println(result);
	}
}
