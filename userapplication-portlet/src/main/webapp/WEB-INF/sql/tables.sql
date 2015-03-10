create table MO_Emp (
	userId LONG not null primary key,
	firstName VARCHAR(75) null,
	lastName VARCHAR(75) null,
	address VARCHAR(75) null,
	phoneNumber VARCHAR(75) null,
	email VARCHAR(75) null,
	companyName VARCHAR(75) null,
	depId LONG,
	userDesc VARCHAR(75) null,
	status BOOLEAN,
	companyId LONG,
	groupId LONG
);