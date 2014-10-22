/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.j2.cs.webservices.metrofax.server.json;

import java.io.*;
import com.google.gson.*;
import com.google.gson.stream.*;
import org.apache.commons.lang3.StringUtils;

/**
 *
 * @author Andres.Gama
 */
public class JsonLongTypeAdapter extends TypeAdapter<Number> {
    
    @Override
    public void write(JsonWriter out, Number value)  throws IOException {
        out.value(value);
    }
    
    @Override
    public Number read(JsonReader in) throws IOException {
        if (in.peek() == JsonToken.NULL) {
            in.nextNull();
            return null;
        }
        
        try {
            String result = in.nextString();
            if (StringUtils.isBlank(result)) {
                return null;
            }
            return Long.parseLong(result);
        } catch (NumberFormatException e) {
            return null;
        }
    }
    
}