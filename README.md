# 🥔 Potato Board

Spring Boot 기반의 간단한 게시판 API 프로젝트입니다.  
Swagger UI를 통해 API 테스트 및 문서화가 가능합니다.

## 📦 기술 스택

- Java 23
- Spring Boot 3.3
- Spring Data JPA (Hibernate)
- H2 Database (In-Memory)
- Lombok
- Swagger (springdoc-openapi)

## 📌 주요 기능

- `GET /posts` 게시글 목록 조회
- `POST /posts` 게시글 등록

## 🧪 Swagger 문서

- [http://localhost:8080/swagger-ui](http://localhost:8080/swagger-ui)

## 📁 프로젝트 구조

<pre>
potato-board/
├── build.gradle
├── settings.gradle
├── <b>src/</b>
│   ├── <b>main/</b>
│   │   ├── <b>java/com/potato/board/</b>
│   │   │   ├── <b>BoardApplication.java</b>       - 메인 클래스
│   │   │   ├── <b>controller/</b>
│   │   │   │   └── PostController.java            - REST API 컨트롤러
│   │   │   ├── <b>domain/</b>
│   │   │   │   └── Post.java                      - JPA 엔티티 클래스
│   │   │   ├── <b>repository/</b>
│   │   │   │   └── PostRepository.java            - JPA 인터페이스
│   │   │   └── <b>service/</b>
│   │   │       └── PostService.java               - 비즈니스 로직 처리
│   │   └── <b>resources/</b>
│   │       ├── application.properties             - 설정 파일
│   │       └── static/, templates/                - (필요 시) 정적 리소스
│
└── <b>test/</b>
    └── java/com/potato/board/
        └── BoardApplicationTests.java             - 테스트 클래스
</pre>

## 🔧 개발 예정 사항

- 게시글 상세 조회, 수정, 삭제 기능
- DTO 분리 및 유효성 검증
- Swagger 문서에 태그/설명 추가
- React 기반 프론트엔드와 연동 예정
