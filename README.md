# Q&A Board


### 📘 Overview

Spring Boot 프레임워크로 만들어진 게시판으로 다음과 같은 기능을 제공합니다:

- 회원가입, 로그인, 로그아웃
- 게시글 작성, 수정, 삭제
- 댓글 작성, 수정, 삭제
- 게시글 및 댓글 추천 기능

---
### 🛠️ Skills & Library

- Spring Boot: 백엔드 개발을 위한 프레임워크
- Thymeleaf: 프론트엔드 개발 및 템플릿 렌더링
- Spring Security: 사용자 인증 및 보안 관리를 위한 Spring 프레임워크 모듈
- JPA: 데이터베이스와 상호작용하기 위한 ORM 도구
- JUnit: 유닛 테스트를 위한 프레임워크
- Bootstrap: 프론트엔드 스타일링을 위한 CSS 프레임워크
- IntelliJ: 통합 개발 환경 (IDE)로서 프로젝트 개발에 사용
- GitHub: 버전 관리 및 협업을 위한 코드 저장소

---
### 🚀 Feature

- 사용자 인증 및 보안 관리
    - Spring Security를 사용하여 사용자 액세스 관리 및 인증 처리
    - 사용자 로그인을 위한 사용자 이름 및 비밀번호 확인 로직
- 백엔드 컨트롤러 구현
    - Spring MVC를 사용하여 백엔드 컨트롤러를 개발
    - 컨트롤러는 서버와 클라이언트 간의 데이터 및 기능을 연결
    - 에러 메시지 처리 및 흐름 관리
- 데이터베이스와의 상호작용
    - 데이터베이스 스키마에 맞는 Java 모델 클래스 설계 (POJO)
    - JPA를 활용해 데이터베이스 작업 구현 (CRUD 작업 지원)

---
### 📷 Outcome

![게시판 리스트 페이지](https://github.com/gowildyj/images/blob/main/sbb/%E1%84%89%E1%85%B3%E1%84%8F%E1%85%B3%E1%84%85%E1%85%B5%E1%86%AB%E1%84%89%E1%85%A3%E1%86%BA%202023-11-01%20%E1%84%8B%E1%85%A9%E1%84%92%E1%85%AE%209.57.31.png?raw=true)
게시판 리스트 페이지

![회원가입 페이지](https://river-chestnut-544.notion.site/image/https%3A%2F%2Fprod-files-secure.s3.us-west-2.amazonaws.com%2F71091ee2-273a-406b-a41b-24b2e15c6f80%2F53ef2104-6f78-4bb0-9135-558b37a7b251%2FUntitled.png?table=block&id=d0b1cb9f-e6f6-44a6-bc7f-c0a041529811&spaceId=71091ee2-273a-406b-a41b-24b2e15c6f80&width=2000&userId=&cache=v2)
회원가입 페이지

![로그인 페이지](https://river-chestnut-544.notion.site/image/https%3A%2F%2Fprod-files-secure.s3.us-west-2.amazonaws.com%2F71091ee2-273a-406b-a41b-24b2e15c6f80%2F54825fc9-be32-420d-98f0-47ed7a434e16%2FUntitled.png?table=block&id=72631a47-8a4c-470e-9368-0a63982e8aed&spaceId=71091ee2-273a-406b-a41b-24b2e15c6f80&width=2000&userId=&cache=v2)
로그인 페이지

![게시물 읽기 - 내가 작성한 글 아니면 수정 삭제 버튼 없음](https://river-chestnut-544.notion.site/image/https%3A%2F%2Fprod-files-secure.s3.us-west-2.amazonaws.com%2F71091ee2-273a-406b-a41b-24b2e15c6f80%2F0eb3dd9c-a6fb-4577-b67b-07960833ca94%2FUntitled.png?table=block&id=d3c65fc8-77aa-4ce5-a7a1-f835a92bd8ef&spaceId=71091ee2-273a-406b-a41b-24b2e15c6f80&width=2000&userId=&cache=v2)
게시물 읽기 - 내가 작성한 글 아니면 수정 삭제 버튼 없음

![새글 작성 MarkDown 지원](https://river-chestnut-544.notion.site/image/https%3A%2F%2Fprod-files-secure.s3.us-west-2.amazonaws.com%2F71091ee2-273a-406b-a41b-24b2e15c6f80%2Fa8b61c0a-6c01-4f0e-900d-428769b6c643%2FUntitled.png?table=block&id=e424d417-bd67-4dda-ba0d-041c36d266f9&spaceId=71091ee2-273a-406b-a41b-24b2e15c6f80&width=2000&userId=&cache=v2)
새글 작성 MarkDown 지원

![수정하면 등록날짜와 수정날짜가 표시됨](https://river-chestnut-544.notion.site/image/https%3A%2F%2Fprod-files-secure.s3.us-west-2.amazonaws.com%2F71091ee2-273a-406b-a41b-24b2e15c6f80%2F6ecbf4a5-9eec-460d-9859-38dca08f2231%2FUntitled.png?table=block&id=fdc20c54-96f7-46ca-bc62-a6de7cfcb5b1&spaceId=71091ee2-273a-406b-a41b-24b2e15c6f80&width=2000&userId=&cache=v2)
수정하면 등록날짜와 수정날짜가 표시됨

![답글달기 MarkDown 지원](https://river-chestnut-544.notion.site/image/https%3A%2F%2Fprod-files-secure.s3.us-west-2.amazonaws.com%2F71091ee2-273a-406b-a41b-24b2e15c6f80%2F971123f8-c4a4-4c6a-91a9-f21f4729f88c%2FUntitled.png?table=block&id=767752da-5e4a-4c74-ae58-c2a8045cb39a&spaceId=71091ee2-273a-406b-a41b-24b2e15c6f80&width=2000&userId=&cache=v2)
답글달기 MarkDown 지원

![추천과 삭제 전 확인하기](https://river-chestnut-544.notion.site/image/https%3A%2F%2Fprod-files-secure.s3.us-west-2.amazonaws.com%2F71091ee2-273a-406b-a41b-24b2e15c6f80%2F6e8b1c70-c746-496f-a278-e5327c8d6965%2FUntitled.png?table=block&id=37550859-841e-40b7-9c11-384bc7cb683f&spaceId=71091ee2-273a-406b-a41b-24b2e15c6f80&width=2000&userId=&cache=v2)
추천과 삭제 전 확인하기

---
### 🤔 Key Takeaways

- 사용자 인증 및 보안 관리

프로젝트를 진행하면서 가장 큰 핵심 경험은 Spring Security를 이용한 사용자 인증 및 보안 관리였습니다. 사용자의 보안을 보장하는 것은 웹 애플리케이션에서 가장 중요한 요소 중 하나이며, 이를 효과적으로 관리하기 위해 Spring Security를 이용했습니다. 초기에는 설정의 복잡성과 다양한 보안 요구사항을 이해하는 데 어려움을 겪었지만, 조금씩 알아가니 즐거웠습니다. 앞으로도 지속적인 학습이 필요한 부분입니다.

- JPA와 데이터베이스

데이터베이스와의 효율적인 상호작용을 위해 JPA를 활용했습니다. 처음에는 sql 쿼리에 익숙해져 있어 다른 방법이 어색하고 데이터베이스와의 상호작용이 복잡하다고 느껴졌지만, JPA를 사용하면서 이를 단순화하는 방법을 배웠습니다. 데이터베이스 작업을 보다 효율적으로 처리하고 데이터베이스의 종류가 달라져도 적용가능한 방법 같아 앞으로도 JPA를 더 많이 사용할 것 같습니다.

- JUnit을 활용한 테스트

프로젝트의 테스트 과정에서는 JUnit을 활용한 유닛 테스트 작성에 대해 배웠습니다. 테스트는 코드의 품질을 보장하고 버그를 찾는 데 중요한 도구이며, 이를 통해 코드의 안정성과 신뢰성을 높일 수 있었습니다.

- 보완할 점

서비스 배포를 위한 환경을 마련해서 실제로 운영되는 웹사이트처럼 기능들을 추가해서 배포할 예정입니다. 개발과 운영을 분리하고 안전하고 효율적으로 운영, 관리하기 위해 인증과 보안관련 부분을 학습할 예정입니다.

이 프로젝트에서는 H2 데이터베이스를 사용했지만 운영단계에서 사용하기는 부족한 점이 있을 것 같아, 실무에서 사용할 수 있는 다른 데이터베이스를 대체해 볼 예정입니다. MariaDB나 오라클과 같이 이전에 사용해 봤던 데이터베이스외에도 PostgreSQL 등도 공부해보고 싶습니다.
