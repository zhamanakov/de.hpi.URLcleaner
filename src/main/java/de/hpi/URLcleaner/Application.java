package de.hpi.URLcleaner;


public class Application {

    public static void main(String[] args) {
        System.out.println(clean("https://www.alternate.de/Wpro/Zulaufschlauch-für-Kaltwasser-2-5m/html/product/995333?partner=DeIdealo&campaign=Waschmaschine/Wpro/995333"
));
    }

    public static String clean(String dirtyUrl) {
        String result = dirtyUrl.substring(0, dirtyUrl.indexOf("?"));
        return result;

    }

}

