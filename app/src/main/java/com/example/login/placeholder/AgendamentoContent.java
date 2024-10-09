package com.example.login.placeholder;

import com.example.model.Agendamento;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Helper class for providing sample content for user interfaces created by
 * Android template wizards.
 * <p>
 * TODO: Replace all uses of this class before publishing your app.
 */
public class AgendamentoContent {

    /**
     * An array of sample (placeholder) items.
     */
    public static final List<Agendamento> ITEMS = new ArrayList<Agendamento>();

    /**
     * A map of sample (placeholder) items, by ID.
     */
    public static final Map<Long, Agendamento> ITEM_MAP = new HashMap<Long, Agendamento>();

    private static final int COUNT = 25;

    // VOLTAR AQUI
   private static void addItem(Agendamento item) {
        ITEMS.add(item);
        ITEM_MAP.put(item.getId(), item);
    }

   /* private static Agendamento Agendamento(int position) {
        /*return new Agendamento(String.valueOf(position), "Item " + position, makeDetails(position));
    }*/

    private static String makeDetails(int position) {
        StringBuilder builder = new StringBuilder();
        builder.append("Details about Item: ").append(position);
        for (int i = 0; i < position; i++) {
            builder.append("\nMore details information here.");
        }
        return builder.toString();
    }

    /**
     * A placeholder item representing a piece of content.
     */

}