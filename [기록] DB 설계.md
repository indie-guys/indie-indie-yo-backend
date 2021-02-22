### DB 설계

| 클래스명 | 논리적 이름                                                  | 멤버 메소드                   | 물리적 이름 |
| -------- | ------------------------------------------------------------ | ----------------------------- | -------- |
| Member | 닉네임<br />이메일<br />비밀번호<br />가입일<br />프로필 사진 url<br />좋아요 한 앨범 개수<br />좋아요 한 곡 개수<br />좋아요 한 아티스트 개수 | 회원가입<br />로그인<br /> | id INT<br />email VARCHAR(100)<br />password VARCHAR(100)<br />join_date DATETIME<br />picture_url VARCHAR(200)<br />like_album_count INT<br />like_song_count INT<br />like_artist_count INT |
| Board    | 제목<br />내용<br />글쓴이<br />글 작성일<br />글 수정일             | 글쓰기<br />글 수정하기<br />글 삭제하기 | id INT<br />title VARCHAR(100)<br />content TEXT<br />member_id INT<br />upload_date DATETIME<br />modify_date DATETIME |
| Comment | 게시글 번호<br />댓글 순서<br />댓글쓴이<br />내용<br />댓글 작성일 | 댓글쓰기<br />댓글 삭제하기 | id INT<br />order<br />member_id INT<br />content VARCHAR(200)<br />upload_date DATETIME |
| Artist  | 아티스트명<br />데뷔 날짜<br />소속사<br />장르<br />좋아요 개수 |                               |  |
| Album   | 앨범 제목<br />앨범 소개<br />앨범 아트<br />아티스트명<br />발매일<br />장르<br />곡 개수<br />수록곡<br />좋아요 개수 |                               |  |
| Song     | 노래 제목<br />발매일<br />수록 앨범<br />장르<br />아티스트명<br />가사<br />좋아요 개수<br />재생 url |                               |  |
| ArtistLike | 좋아요한 사람<br />해당 아티스트<br /> |                               | id INT<br />artist_id INT<br />member_id INT<br /> |
|  | | |  |

<br>

### 고려한 점

- 예약어를 피해서 `User` 대신 `Member`로 선택했습니다.
- `snake_case`를 사용했습니다.
- 각 테이블의 ID를 `id`로 할지 `table_id`로 할지 고민했는데, `id` 형태로 결정했습니다.  구글링 했을 때에도 많은 갑론을박을 보았는데, 다음과 같이 생각했습니다.
  1. ORM을 사용하기 때문에 쿼리문을 사용하는 빈도가 적어 크게 혼동될 일이 없을 것 같습니다.
  2. `id`는 해당 테이블의 primary key로 인식하고, `table_id`는 해당 table에서 사용하는 외부 테이블의 key로 인식할 수 있습니다. 
- 동사는 능동태를 사용했습니다.



