create table employee(
  EID varchar(30),
  personName varchar(30),
  street varchar(30),
  city varchar(30),
  primary key (EID));

create table company(
  CID varchar(30),
  companyName varchar(30),
  product varchar(30),
  city varchar(30),
  primary key (CID));

create table works(
  EID varchar(30),
  CID varchar(30),
  salary int,
  primary key (EID, CID),
  foreign key (EID) references employee,
  foreign key (CID) references company);

create table manages(
  EID varchar(30),
  managerID varchar(30),
  primary key (EID),
  foreign key (EID) references employee(EID),
  foreign key (managerId) references employee(EID));

-- 예시 직원 데이터 삽입
INSERT INTO employee VALUES
('E001', 'John Doe', '123 Main St', 'New York'),
('E002', 'Jane Smith', '123 Main St', 'New York'),
('E003', 'Michael Johnson', '789 Oak St', 'Chicago'),
('E004', 'Emily Brown', '101 Pine St', 'San Francisco');
-- 예시 회사 데이터 삽입
INSERT INTO company VALUES
('C001', 'ABC Inc', 'Software', 'New York'),
('C002', 'XYZ Corp', 'Hardware', 'Los Angeles'),
('C003', '123 Industries', 'Electronics', 'Chicago');

-- 예시 직원-회사 연결 데이터 삽입
INSERT INTO works VALUES
('E001', 'C001', 60000),
('E002', 'C002', 70000),
('E003', 'C001', 55000),
('E004', 'C003', 65000);

-- 예시 관리자 데이터 삽입
INSERT INTO manages VALUES
('E001', NULL), -- John Doe는 관리자가 없음
('E002', 'E001'), -- Jane Smith는 John Doe를 관리자로 가짐
('E003', 'E001'), -- Michael Johnson는 John Doe를 관리자로 가짐
('E004', 'E002'); -- Emily Brown은 Jane Smith를 관리자로 가짐

-- 정답
select e.personName from employee as e, employee as s, manages
where e.street=s.street and e.city=s.city
and manages.eid=e.eid and manages.managerId=s.eid;
