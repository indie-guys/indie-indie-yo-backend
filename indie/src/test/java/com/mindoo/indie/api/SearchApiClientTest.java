package com.mindoo.indie.api;

import org.junit.jupiter.api.Test;
import org.springframework.web.client.RestTemplate;

import static org.junit.jupiter.api.Assertions.*;

class SearchApiClientTest {
    SearchApiClient searchApiClient;


    @Test
    public void 아티스트_검색(){
        searchApiClient = new SearchApiClient(new RestTemplate());

        // given
        String keyword = "아이유";
        SearchCategory category = SearchCategory.ARTIST;

        // when
        final String result = searchApiClient.searchApi(keyword, category);

        // then
        System.out.println(result);
    }

    @Test
    public void 앨범_검색(){
        searchApiClient = new SearchApiClient(new RestTemplate());

        // given
        String keyword = "chat-shire";
        SearchCategory category = SearchCategory.ALBUM;

        // when
        final String result = searchApiClient.searchApi(keyword, category);

        // then
        System.out.println(result);
    }

    @Test
    public void 앨범_정보_가져오기(){
        searchApiClient = new SearchApiClient(new RestTemplate());

        // given
        Long albumId = 726912L;

        // when
        final String result = searchApiClient.getAlbumInfo(albumId);

        // then
        System.out.println(result);
    }

}