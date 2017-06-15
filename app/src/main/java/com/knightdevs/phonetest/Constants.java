package com.knightdevs.phonetest;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Created by ashah on 14/6/17.
 */

public class Constants {
    public static final List<String> operations = Collections.unmodifiableList(
            new ArrayList<String>() {{
                add("Battery");
                add("Wifi");
                add("Camera");
                add("Display");
                add("Colors");
                add("Keyboard");
                add("Sound");
                add("Proximity");
                add("Earpiece");
                add("Mic");
                add("Bluetooth");
                add("Sim");
                add("Buttons");
                // etc
            }});

}
