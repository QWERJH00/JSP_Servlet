SET SESSION FOREIGN_KEY_CHECKS=0;

/* Drop Tables */

DROP TABLE IF EXISTS phboard;
DROP TABLE IF EXISTS pjmember;




/* Create Tables */

CREATE TABLE phboard
(
	idx int NOT NULL AUTO_INCREMENT,
	name varchar(50) NOT NULL,
	title varchar(200) NOT NULL,
	content varchar(2000) NOT NULL,
	postdate date NOT NULL,
	ofile varchar(200) NOT NULL,
	sfile varchar(30) NOT NULL,
	id varchar(10) NOT NULL,
	PRIMARY KEY (idx)
);


CREATE TABLE pjmember
(
	id varchar(10) NOT NULL,
	pass varchar(10) NOT NULL,
	name varchar(30) NOT NULL,
	regidate date NOT NULL,
	PRIMARY KEY (id)
);



/* Create Foreign Keys */

ALTER TABLE phboard
	ADD FOREIGN KEY (id)
	REFERENCES pjmember (id)
	ON UPDATE RESTRICT
	ON DELETE RESTRICT
;



