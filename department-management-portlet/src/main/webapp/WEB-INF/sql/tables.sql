create table DM_Department (
	departmentId LONG not null primary key,
	departmentName VARCHAR(75) null,
	createdBy VARCHAR(75) null,
	createdOn VARCHAR(75) null,
	companyId LONG,
	groupId LONG
);