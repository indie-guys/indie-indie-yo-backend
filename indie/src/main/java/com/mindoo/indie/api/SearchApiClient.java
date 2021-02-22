package com.mindoo.indie.api;

import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.util.UriComponents;
import org.springframework.web.util.UriComponentsBuilder;


/*
Format은 다음과 같다
http://www.maniadb.com/api/search/[keyword]/?sr=[artist|album|song]&display=[1~100]&key=[apikey]&v=[version]
 */
@RequiredArgsConstructor
public class SearchApiClient {
    private final RestTemplate restTemplate;
    private final String SEARCH_URL_BASE = "http://www.maniadb.com/api/search/";
    private final String ALBUM_INFO_URL_BASE = "http://www.maniadb.com/api/album/";

    public String searchApi(String keyword, SearchCategory category){
        UriComponents uriBuilder = UriComponentsBuilder.fromHttpUrl(SEARCH_URL_BASE)
                .path(keyword + "/")
                .queryParam("sr", category.getParam())
                .queryParam("display", 16)
                .queryParam("key", "miinju.choi@gmail.com")
                .queryParam("v", 0.5)
                .build(false);

        final HttpHeaders headers = new HttpHeaders();
        final HttpEntity<String> entity = new HttpEntity<>(headers);

        return restTemplate.exchange(uriBuilder.toString(), HttpMethod.GET, entity, String.class).getBody();
    }

    public String getAlbumInfo(Long albumId){
        UriComponents uriBuilder = UriComponentsBuilder.fromHttpUrl(ALBUM_INFO_URL_BASE)
                .path(albumId + "/")
                .queryParam("key", "miinju.choi@gmail.com")
                .queryParam("v", 0.5)
                .build(false);

        final HttpHeaders headers = new HttpHeaders();
        final HttpEntity<String> entity = new HttpEntity<>(headers);

        return restTemplate.exchange(uriBuilder.toString(), HttpMethod.GET, entity, String.class).getBody();
    }

}
