
select *
from  TBL_USER
WHERE  USER_ID =2;


select U.USER_ID,U.NAME,U.INTRODUCTION,U.EMAIL,U.PHONE_NUMBER
from  TBL_USER U
WHERE  U.USER_ID =2;



SELECT S.STORY_ID,S.TITLE, S.CONTENT, S.CREATED_DATE, S.VIEWS, SI.FILE_LOCATION AS IMAGE
FROM TBL_STORY S LEFT JOIN TBL_STORY_IMG SI ON S.STORY_ID=SI.STORY_ID
WHERE S.USER_ID =1
ORDER BY S.CREATED_DATE DESC;





select count(*)
from TBL_STORY;


SELECT SC.STORY_ID, SC.USER_ID, SC.CONTENT
FROM TBL_STORY_COMMENT SC JOIN TBL_USER U ON SC.USER_ID=U.USER_ID
WHERE SC.STORY_ID =2
ORDER BY SC.CREATED_DATE ASC;




select SEQ_STORY.nextval from dual;



SELECT COUNT(*) AS LIKE_COUNT
FROM TBL_STORY_LIKE
WHERE STORY_ID =2;



SELECT UR.USER_REVIEW_ID, UR.CONTENT, UR.RATING, O.NAME AS ORGANIZATION_NAME
FROM TBL_USER_REVIEW UR JOIN TBL_ORGANIZATION O ON UR.ORGANIZATION_ID = O.ORGANIZATION_ID
WHERE UR.USER_ID = 1;



update TBL_STORY
set VIEWS = VIEWS + 1
where STORY_ID = 1;


select *
from TBL_STORY;



update TBL_STORY
set TITLE = 'iamupdatingstory',
            CONTENT = 'This is updating story.'
where STORY_ID = 1;



delete from TBL_STORY
where STORY_ID =1;


SELECT
    U.USER_ID,
    U.EMAIL,
    U.NAME,
    U.PHONE_NUMBER,
    U.REGISTER_DATE,
    U.EMAIL_APPROVE,
    U.PHONE_APPROVE,
    U.BIRTH_DATE,
    U.GENDER,
    U.INTRODUCTION,
    (SELECT COUNT(*) FROM TBL_APPLIED_VOLUNTEER AV WHERE AV.USER_ID = U.USER_ID) AS VOLUNTEER_COUNT,
    (SELECT AVG(R.RATING) FROM TBL_USER_REVIEW R WHERE R.USER_ID = U.USER_ID) AS AVERAGE_RATING
FROM
    TBL_USER U;













SELECT S.STORY_ID,S.TITLE, S.CONTENT, S.CREATED_DATE, S.VIEWS, SI.FILE_LOCATION AS IMAGE
FROM TBL_STORY S LEFT JOIN TBL_STORY_IMG SI ON S.STORY_ID=SI.STORY_ID
WHERE S.USER_ID =1
ORDER BY S.CREATED_DATE DESC;


select count(*)
from TBL_STORY;



SELECT SC.STORY_ID, SC.USER_ID, SC.CONTENT
FROM TBL_STORY_COMMENT SC JOIN TBL_USER U ON SC.USER_ID=U.USER_ID
WHERE SC.STORY_ID = 2
ORDER BY SC.CREATED_DATE ASC;



SELECT COUNT(*) AS LIKE_COUNT
FROM TBL_STORY_LIKE
WHERE STORY_ID =2;



SELECT UR.USER_REVIEW_ID, UR.CONTENT, UR.RATING, O.NAME AS ORGANAZATION_NAME
FROM TBL_USER_REVIEW UR JOIN TBL_ORGANIZATION O ON UR.ORGANIZATION_ID = O.ORGANIZATION_ID
WHERE UR.USER_ID = 1;




SELECT
    U.USER_ID,
    U.EMAIL,
    U.NAME,
    U.PHONE_NUMBER,
    U.REGISTER_DATE,
    U.EMAIL_APPROVE,
    U.PHONE_APPROVE,
    U.BIRTH_DATE,
    U.GENDER,
    U.INTRODUCTION,
    (SELECT COUNT(*) FROM TBL_APPLIED_VOLUNTEER AV WHERE AV.USER_ID = U.USER_ID) AS VOLUNTEER_COUNT,
    (SELECT AVG(R.RATING) FROM TBL_USER_REVIEW R WHERE R.USER_ID = U.USER_ID) AS AVERAGE_RATING
FROM
    TBL_USER U;


select U.USER_ID,U.NAME
from  TBL_USER U;




SELECT
    S.STORY_ID,
    S.TITLE,
    S.CONTENT,
    U.NAME,
    S.VIEWS,
    S.CREATED_DATE,
    U.USER_ID,
    (SELECT COUNT(*) FROM TBL_STORY_IMG SI WHERE SI.STORY_ID = S.STORY_ID) AS IMG_COUNT
FROM
    TBL_STORY S JOIN TBL_USER U ON U.USER_ID = S.USER_ID
where S.STORY_ID = 1;



select
    STORY_IMG_ID,
    FILE_LOCATION,
    STORY_ID
from
    TBL_STORY_IMG
where STORY_ID =1;



select
    STORY_IMG_ID,
    FILE_LOCATION,
    STORY_ID
from
    TBL_STORY_IMG
where STORY_IMG_ID = 1;


select U.name, SC.*
from TBL_USER U join TBL_STORY_COMMENT SC
                     on U.USER_ID = SC.USER_ID
                         and STORY_ID = 1
order by CREATED_DATE desc;


select *
    from TBL_ORGANIZATION;



-- INSERT INTO tbl_organization (
--     organization_id, location_id, email, password, name,
--     phone_number, register_date, email_approve, phone_approve, manager_name,
--     manager_phone_number, file_location, status, provider_id, provider, role
-- )
-- VALUES (
--            8,7, '#{email}', '1234' ,
--            '#{name}', '1111',to_date('2024-07-12'),11, 94, '#{managerName}',
--            '1234', '/files/org1/}','Inactive', '123','2', '#{role}'
--        );
--




select organization_id,password
from tbl_organization;

INSERT INTO tbl_organization (
    organization_id, location_id, email, password, name,
    phone_number, register_date, email_approve, phone_approve, manager_name,
    manager_phone_number, file_location, status, provider_id, provider, role
)
VALUES (
           'your_organization_id_value', 'your_location_id_value', 'your_email_value', 'your_password_value',
           'your_name_value', 'your_phone_number_value', 'your_register_date_value', 'your_email_approve_value', 'your_phone_approve_value', 'your_manager_name_value',
           'your_manager_phone_number_value', 'your_file_location_value', 'your_status_value', 'your_provider_id_value', 'your_provider_value', 'your_role_value'
       );

insert into TBL_STORY_COMMENT (STORY_COMMENT_ID, STORY_ID, USER_ID, CONTENT, CREATED_DATE)
values (seq_story_comment.nextval, 2, 2, '너무 좋아보여요', sysdate);





delete from TBL_STORY_COMMENT
where STORY_COMMENT_ID=2;





update TBL_STORY_COMMENT
set
    CONTENT = 'looks great! very goooood ~ '
where STORY_COMMENT_ID = 1;



INSERT INTO TBL_STORY
VALUES (4, 1,1, 1,'유기견 봉사 다녀왔습니다 0720','너무 힘들었습니다',sysdate, 0);

select *
from TBL_STORY;

select count(*)
from TBL_STORY;


select VIEWS
from TBL_STORY
where STORY_ID = 1;


update TBL_STORY
set TITLE = '도서관 봉사간 날',
            CONTENT = '힘들었습니다'
where STORY_ID = 4;

select *
from TBL_STORY;

UPDATE TBL_USER
SET profile_pic ='https://img.danawa.com/prod_img/500000/337/342/img/3342337_1.jpg?shrink=330:*&_v=20160311122708'
WHERE USER_ID = 1;


UPDATE TBL_USER
SET introduction = '봉사를 열심히 합시다.'
WHERE USER_ID = 1;









GRANT SELECT, ALTER ON SEQ_USER TO your_application_user;




DROP TABLE TBL_USER CASCADE CONSTRAINTS;

-- TBL_USER 테이블을 다시 생성합니다.
CREATE TABLE TBL_USER (
                          USER_ID            NUMBER PRIMARY KEY,
                          EMAIL              VARCHAR2(100) NOT NULL,
                          PASSWORD           VARCHAR2(100) NOT NULL,
                          NAME               VARCHAR2(100) NOT NULL,
                          PHONE_NUMBER       VARCHAR2(100) NOT NULL,
                          BIRTH_DATE         DATE NOT NULL,
                          LOCATION_ID        VARCHAR2(100) NOT NULL,
                          ADDRESS_DETAIL     VARCHAR2(1000) DEFAULT '',
                          INTRODUCTION       VARCHAR2(1000) DEFAULT '',
                          REGISTER_DATE      DATE DEFAULT SYSDATE,
                          EMAIL_APPROVE      NUMBER(1) DEFAULT 0,
                          PHONE_APPROVE      NUMBER(1) DEFAULT 0,
                          PROFILE_PIC        VARCHAR2(1000) DEFAULT ''

);



select * from TBL_LOCATION;
drop table TBL_ANNOUNCEMENT cascade constraints;

-- Example 1
INSERT INTO TBL_ANONYMOUS (ANONYMOUS_ID, USER_ID, TITLE, CONTENT)
VALUES (1, 1001, 'First Title', 'This is the content of the first post.');

-- Example 2
INSERT INTO TBL_ANONYMOUS (ANONYMOUS_ID, USER_ID, TITLE, CONTENT, CREATED_DATE, VIEWS)
VALUES (1, 1002, 'Second Title', 'This is the content of the second post.', SYSDATE, 1);

-- Example 3
INSERT INTO TBL_ANONYMOUS (ANONYMOUS_ID, USER_ID, TITLE, CONTENT)
VALUES (3, 1003, 'Third Title', 'This is the content of the third post.');




