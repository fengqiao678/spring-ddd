package com.rkaneko.spring.ddd.application.core;

import com.google.common.base.Preconditions;
import org.springframework.http.HttpInputMessage;
import org.springframework.http.HttpOutputMessage;
import org.springframework.http.MediaType;
import org.springframework.http.converter.AbstractHttpMessageConverter;
import org.springframework.http.converter.HttpMessageNotReadableException;
import org.springframework.http.converter.HttpMessageNotWritableException;
import org.springframework.http.converter.json.MappingJackson2HttpMessageConverter;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class AppJsonHttpMessageConverter extends AbstractHttpMessageConverter<Object> {
    @Override
    protected boolean supports(Class<?> clazz) {
        return false;
    }

    @Override
    protected Object readInternal(Class<?> clazz, HttpInputMessage inputMessage) throws IOException, HttpMessageNotReadableException {
        return null;
    }

    @SuppressWarnings("unchecked")
    @Override
    protected void writeInternal(Object o, HttpOutputMessage outputMessage) throws IOException, HttpMessageNotWritableException {
        Preconditions.checkNotNull(o);
        Map<String, Object> payload = new HashMap<>();
        payload.put("result", o);
        AbstractHttpMessageConverter jsonConverter = new MappingJackson2HttpMessageConverter();
        jsonConverter.write(payload, MediaType.APPLICATION_JSON_UTF8, outputMessage);
    }
}
