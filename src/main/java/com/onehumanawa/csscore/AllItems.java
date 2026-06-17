package com.onehumanawa.csscore;

import com.tterrag.registrate.util.entry.ItemEntry;
import com.onehumanawa.csscore.content.SimpleSchematicItem;

import static com.onehumanawa.csscore.CSSCore.REGISTRATE;


public class AllItems {

    public static final ItemEntry<SimpleSchematicItem> SIMPLE_SCHEMATIC =
            REGISTRATE.item("simple_schematic", SimpleSchematicItem::new)
                    .properties(p -> p.stacksTo(16))
                    .register();

    public static void register() {}
}
