## 네이버 API 사용한 WishList WebApp

네이버 API 지역검색, 이미지 검색 사용
- Springboot Project
- 배열을 사용한 모의 DB
- JUnit 단위 테스트
- Lombok 사용

모의 DB의 CRUD 구현
- **MemoryDbRepositoryIfs**
    - findById, save, deleteById, listAll
    - 이 Interface의 구현체가 배열에 CRUD 동작 
- **WishListRepositoryTest**
    - CRUD 함수 Test
    
네이버 API 연동
- **NaverClient**
    - 네이버 지역 검색, 이미지 검색 사용
    - application.yaml에 api URI와 Client Id, Secret선언
    - Image, Local에 해당하는 Req, Res DTO 클래스 구현
    - URI생성, header에 Client Id, Secret 담아서 RestTemplte.exchange로 요청

- **NaverClientTest**
    - API 연동에 적절한 응답이 돌아오는지 확인


Service 구현
- **WishListService**
  - 화면에 뿌려주기 위한 WishListDto생성
  - 지역검색 API를 사용해서 검색한 결과로 이미지 검색까지 진행
  - 검색결과를 WishListDto에 반환
  - 전체 DB의 list를 반환하는 함수 구현

Controller 구현
- **WishListController**
  - URI 맵핑 endpoint 3가지
    - query로 검색한 결과 반환 구현
    - Dto를 받아서 DB에 저장
    - 전체 리스트를 출력