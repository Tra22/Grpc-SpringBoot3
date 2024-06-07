package com.tra21.grpc.utils;

import com.tra21.grpc.dtos.global.responses.FileDto;
import lombok.extern.slf4j.Slf4j;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.URLConnection;

@Slf4j
public class CustomFileUtils {
    public static FileDto getFileMimeTypeFromBaseByteArray(byte[] bytes){
        InputStream is = new ByteArrayInputStream(bytes);
        String mimeType = null;
        String fileExtension = null;
        try {
            mimeType = URLConnection.guessContentTypeFromStream(is); //mimeType is something like "image/jpeg"
            String delimiter="[/]";
            String[] tokens = mimeType.split(delimiter);
            fileExtension = tokens[1];
        } catch (IOException ioException){
            log.error("error to get file type: ", ioException);
        }
        return FileDto.builder().fileMimeType(mimeType).fileType(fileExtension).build();
    }
}
