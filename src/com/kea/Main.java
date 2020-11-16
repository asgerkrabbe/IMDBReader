package com.kea;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {

        URL url = new URL("https://www.imdb.com/search/title/?title=star+wars");
        Scanner sc = new Scanner(url.openStream());


        while (sc.hasNext()) {
            System.out.println(sc.nextLine());
                }
            }
        }
