select *
from TBL_ORGANIZATION;

select *
from TBL_USER;

-- 공지사항 --
select *
from TBL_ANNOUNCEMENT;




-- 기관 상세보기 --  -- 담당자와 담당자 전화번호, 소속지역 필요 --
select TBL_ORGANIZATION.ORGANIZATION_ID,EMAIL,PHONE_NUMBER,TBL_ORGANIZATION.LOCATION_ID,
       ORGANIZATION_REVIEW_ID,TBL_ORGANIZATION_REVIEW.ORGANIZATION_ID,USER_ID,ORGANIZATION_REVIEW_ID,RATING,
       VOLUNTEER_ID,TBL_VOLUNTEER.ORGANIZATION_ID,TITLE
-- 모집기간 : 2024.07.07~2024.07.13 / 봉사시간 : 2024.07.15~ 2024.07.18 이런 식으로 만들었는데 수정 할 것인지?
-- 모집시작 : 2024.07.07 모집마감 : 2024.07.13 / 봉사시작 : 2024.07.15 봉사종료 : 2024.07.18 이런 식으로 만들지?
-- 만들어진 insert 와 ERD 에는 정확히 어떻게 할것 인지가 없는거 같아서 의문이 듬. 이 부분은 select 할때 따로 안넣음.
from TBL_ORGANIZATION, TBL_ORGANIZATION_REVIEW,TBL_VOLUNTEER;

-- 기관 상세보기 --  -- 담당자와 담당자 전화번호, 소속지역 필요 --
select TBL_ORGANIZATION.ORGANIZATION_ID,EMAIL,PHONE_NUMBER,TBL_ORGANIZATION.LOCATION_ID,
       ORGANIZATION_REVIEW_ID,TBL_ORGANIZATION_REVIEW.ORGANIZATION_ID,USER_ID,ORGANIZATION_REVIEW_ID,RATING,
       VOLUNTEER_ID,TBL_VOLUNTEER.ORGANIZATION_ID,TITLE
-- 모집기간 : 2024.07.07~2024.07.13 / 봉사시간 : 2024.07.15~ 2024.07.18 이런 식으로 만들었는데 수정 할 것인지?
-- 모집시작 : 2024.07.07 모집마감 : 2024.07.13 / 봉사시작 : 2024.07.15 봉사종료 : 2024.07.18 이런 식으로 만들지?
-- 만들어진 insert 와 ERD 에는 정확히 어떻게 할것 인지가 없는거 같아서 의문이 듬. 이 부분은 select 할때 따로 안넣음.
from TBL_ORGANIZATION, TBL_ORGANIZATION_REVIEW,TBL_VOLUNTEER;

-- 기관 정보 수정하기 -- 유선전화번호 컬럼?이 없음
select ORGANIZATION_ID,NAME,REGISTER_DATE,LOCATION_ID,PHONE_NUMBER,EMAIL,PHONE_APPROVE,EMAIL_APPROVE
from TBL_ORGANIZATION;

-- 유저 정보 수정하기 -- 생년월일,계정생성일,성별 컬럼이 없음
select USER_ID,NAME,LOCATION_ID,PHONE_NUMBER,EMAIL,PHONE_APPROVE,EMAIL_APPROVE
from TBL_USER;

-- 봉사글 등록하기 -- 기관 소속 지역 컬럼이 없음 (지역 ID로 퉁칠것인지? 그럼 코드가 꼬일것 같음.)
select VOLUNTEER_ID,TITLE,ORGANIZATION_ID,CATEGORY,TARGET,RECRUIT_END_DATE,VOLUNTEER_DATE,IS_ADULT_ALLOWED,IS_TEEN_ALLOWED
from TBL_VOLUNTEER;

-- 봉사글 상세보기 -- 활동요일,모집인원,신청인원,첨부파일,활동구분,봉사대상(여기있는 target 이 봉사대상인지?),
-- 밑에 들어가는 추가 정보 컬럼도 없는것 같음. (없거나 내가 못 찾았을 경우도 있음.)
-- 맨밑 푸터 위에 있는 담당자명, 담당자 전화번호도 없음.(주소는 location_id 로 땜빵 가능할듯. 아님 말고)
-- 다른 테이블에서 가저와야 되서 where
select VOLUNTEER_ID,TITLE,RECRUIT_START_DATE,RECRUIT_END_DATE,VOLUNTEER_DATE,TARGET,IS_ADULT_ALLOWED,IS_ADULT_ALLOWED,
       LOCATION_ID,CATEGORY,ORGANIZATION_ID
from TBL_VOLUNTEER;

-- 익명 게시판
select
from TBL_ANONYMOUS,TBL_ANONYMOUS_COMMENT


