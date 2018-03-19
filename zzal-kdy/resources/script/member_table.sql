CREATE TABLE member (
	id     INTEGER     NOT NULL, 
	email  VARCHAR(20) NOT NULL,   
	name   VARCHAR(20) NOT NULL,   
	password VARCHAR(20) NOT NULL,
	joined DATE        NULL
);

CREATE UNIQUE INDEX PK_member
	ON member ( 
		id ASC 
	);

ALTER TABLE member
	ADD
		CONSTRAINT PK_member
		PRIMARY KEY (
			id 
		);


CREATE TABLE post (
	pno       INTEGER     NOT NULL,
	ptitle    VARCHAR(30) NULL,   
	pcontent  VARCHAR(20) NULL,   
	pcreated  DATE        NULL,    
	pmodified DATE        NULL     
);

CREATE UNIQUE INDEX PK_post
	ON post ( 
		pno ASC 
	);

ALTER TABLE post
	ADD
		CONSTRAINT PK_post 
		PRIMARY KEY (
			pno 
		);


CREATE TABLE memberPost (
	id  INTEGER NULL, 
	pno INTEGER NULL 
);


ALTER TABLE memberPost
	ADD
		CONSTRAINT FK_member_TO_memberPost
		FOREIGN KEY (
			id
		)
		REFERENCES member ( 
			id 
		);


ALTER TABLE memberPost
	ADD
		CONSTRAINT FK_post_TO_memberPost
		FOREIGN KEY (
			pno 
		)
		REFERENCES post (
			pno
		);

