package com.rocketseat.createUrlShortener;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter

public class UrlData {
    private String originalUrl;
    private long expirationTime;

    public long getExpirationTime() {
        return expirationTime;
    }

    public String getOriginalUrl() {
        return originalUrl;
    }
}
