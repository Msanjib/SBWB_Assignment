create table MO_Division (
	divisionId LONG not null primary key,
	divisionName VARCHAR(75) null,
	createdBy VARCHAR(75) null,
	createdOn VARCHAR(75) null,
	companyId LONG,
	groupId LONG
);