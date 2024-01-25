package com.optimization.data.nmf.service.dto;

import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.ZoneId;

import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.deser.std.StdDeserializer;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlText;

public class LocalDateTimeToMinOrSecDTO {
    @JacksonXmlText
    @JsonDeserialize(using = MultiDateDeserializer.class)
    private LocalDateTime text; //can parse different data formats (see https://stackoverflow.com/a/42567051)

    public LocalDateTime getText() {
        return text;
    }

    public void setText(LocalDateTime text) {
        this.text = text;
    }

	@Override
	public String toString() {
		return "LocalDateTimeToMinOrSecDTO [" + (text != null ? "text=" + text : "") + "]";
	}
	
	// used to allow multiple date types for LocalDateTimeToMinOrSecDTO
	private static class MultiDateDeserializer extends StdDeserializer<LocalDateTime> {

		private static final long serialVersionUID = 2439779181976699538L;
		
		private static final String[] DATE_FORMATS = new String[] {
	        "yyyy-MM-dd HH:mm",
	        "yyyy-MM-dd HH:mm:ss",
	        "yyyy-MM-dd'T'HH:mm:ss"
	    };

	    public MultiDateDeserializer() {
	        this(null);
	    }

	    public MultiDateDeserializer(Class<?> givenClass) {
	        super(givenClass);
	    }

	    @Override
	    public LocalDateTime deserialize(JsonParser jsonParser, DeserializationContext context) throws IOException, JsonProcessingException {
	        JsonNode node = jsonParser.getCodec().readTree(jsonParser);
	        
	        final String date = node.textValue();

	        for (String DATE_FORMAT : DATE_FORMATS) {
	            try {
	                return new SimpleDateFormat(DATE_FORMAT).parse(date).toInstant().atZone(ZoneId.systemDefault()).toLocalDateTime();
	            } catch (ParseException e) {
	            	
	            }
	        }
	        throw new JsonParseException(jsonParser, "Date \"" + date + "\" could not be parsed. "
	        		+ "Date has to be \"yyyy-MM-dd HH:mm\" or \"yyyy-MM-dd HH:mm:ss\".");
	    }
	}
}
