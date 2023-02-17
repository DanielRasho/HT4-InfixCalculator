package App_main.model.Stack;

import App_main.model.Stack.*;
import App_utils.printer.AnsiColors;
import App_utils.printer.Menu;
import App_utils.printer.MenuEntry;

import java.util.List;

public class StackFactory {

    public static Stack<Double> getStack(){
        Menu menu = new Menu()
                .header("Which Stack Implementation would you like to use?")
                .footer("Select Index Accordingly")
                .headerColors(AnsiColors.BLACK, AnsiColors.GREEN_BACKGROUND)
                .indexColors(AnsiColors.BLACK, AnsiColors.YELLOW_BACKGROUND)
                .data(List.of(
                        new MenuEntry<String>("StackedArrayList"),
                        new MenuEntry<String>("StackedVector"),
                        new MenuEntry<String>("StackedLinkedList"),
                        new MenuEntry<String>("StackedDoubleLinkedList")
                )).show();
        switch (menu.getSelectedIndex()){
            case 0 -> {return new StackedArrayList<Double>();}
            case 1 -> {return new StackedVector<Double>();}
            case 2 -> {return new StackedLinkedList<Double>();}
            case 3 -> {return new StackedDoubleLinkedList<Double>();}
        }
        return null;
    }
}
