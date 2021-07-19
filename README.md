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
