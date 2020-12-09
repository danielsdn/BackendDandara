package com.dandara.util;

import java.nio.charset.StandardCharsets;

public class Util {
    public String converterUtf8(String texto) {
        return new String(texto.getBytes(), StandardCharsets.UTF_8);
    }
}
