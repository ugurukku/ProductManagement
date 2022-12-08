import managers.BrandManager;
import managers.CategoryManager;
import managers.ItemManager;

import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {

        ItemManager itemManager = new ItemManager();


        System.out.println(

                itemManager.getAll().stream().filter(item -> item.getRate() >= 4).collect(Collectors.toList())

        );


    }


}