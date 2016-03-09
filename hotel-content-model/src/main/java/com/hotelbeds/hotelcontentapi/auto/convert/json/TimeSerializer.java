/**
 * Autogenerated code by SdkModelGenerator.
 * Do not edit. Any modification on this file will be removed automatically after project build
 *
 */
package com.hotelbeds.hotelcontentapi.auto.convert.json;

import java.io.IOException;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;


import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.SerializerProvider;

public class TimeSerializer extends JsonSerializer<LocalTime> {

    public static final DateTimeFormatter REST_FORMATTER = DateTimeFormatter.ofPattern("HH:mm:ss");

    @Override
    public void serialize(final LocalTime date, final JsonGenerator generator, final SerializerProvider provider) throws IOException {
        final String dateString = date.format(REST_FORMATTER);
        generator.writeString(dateString);
    }
}