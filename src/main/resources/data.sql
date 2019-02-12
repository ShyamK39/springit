INSERT INTO link
(id,
created_by,
creation_date,
last_modified_by,
last_modified_date,
title,
url)
VALUES
('1',
null,
NOW(),
null,
NOW(),
'Getting Started with Spring Boot 2',
'https://therealdanvega.com/spring-boot-2');

INSERT INTO comment
(id,
created_by,
creation_date,
last_modified_by,
last_modified_date,
body,
link_id)
VALUES
(1,
null,
NOW(),
null,
NOW(),
'What and awesome idea for a course!',
1);