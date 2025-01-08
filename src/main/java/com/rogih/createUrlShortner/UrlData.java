package com.rogih.createUrlShortner;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class UrlData {
    private String originalUrl;
    private long expirationTime;
}
