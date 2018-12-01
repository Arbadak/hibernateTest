CREATE TABLE country (
	citizenship_id INT NOT NULL AUTO_INCREMENT,
	citizenship_code VARCHAR(3) NOT NULL COLLATE 'utf8_bin',
	citizenship_name VARCHAR(60) NOT NULL COLLATE 'utf8_bin',
    PRIMARY KEY (citizenship_id));

CREATE TABLE doc (
	doc_id INT NOT NULL AUTO_INCREMENT,
	doc_code VARCHAR(3) NOT NULL,
	doc_name VARCHAR(115) NOT NULL COLLATE 'utf8_bin',
    PRIMARY KEY (doc_id));

CREATE TABLE organization (
	org_id INT(11) NOT NULL AUTO_INCREMENT,
	full_name VARCHAR(60) NOT NULL COLLATE 'utf8_bin',
	inn INT(12) NOT NULL,
	kpp INT(9) NOT NULL,
	short_name VARCHAR(30) COLLATE 'utf8_bin',
	PRIMARY KEY (org_id));

CREATE TABLE office (
	office_id INT(11) NOT NULL AUTO_INCREMENT,
	organization_id INT(11) NOT NULL,
	FOREIGN KEY (organization_id) REFERENCES organization (org_id),
	INDEX IX_organizaton_organization_id (organization_id),
	phone INT(11) NULL DEFAULT NULL,
	address VARCHAR(100) NOT NULL COLLATE 'utf8_bin',
	is_active BOOLEAN(4) DEFAULT NULL,
	is_main BOOLEAN(4) DEFAULT NULL,
 	PRIMARY KEY (office_id));

CREATE TABLE user (
	user_id INT NOT NULL AUTO_INCREMENT,
	first_name VARCHAR(15) NOT NULL COLLATE 'utf8_bin',
	second_name VARCHAR(15) COLLATE 'utf8_bin',
	last_name VARCHAR(15) COLLATE 'utf8_bin',
	doc_id INT NOT NULL,
	 FOREIGN KEY (doc_id) REFERENCES doc (doc_id),
	 INDEX IX_doc_doc_id (doc_id),
	doc_number INT (10) NOT NULL,
	doc_date DATE NOT NULL,
	citizenship_id INT NOT NULL,
	 FOREIGN KEY (citizenship_id) REFERENCES country (citizenship_id),
	 INDEX IX_country_citizenship_id (citizenship_id),
	is_identified BOOLEAN DEFAULT NULL,
	binded_office INT NOT NULL,
	 FOREIGN KEY (binded_office) REFERENCES office (office_id),
	 INDEX IX_ofice_office_id (office_id),
	 PRIMARY KEY (user_id));

CREATE TABLE doc_data (
	doc_date DATE NOT NULL,
	doc_number INT(10) NOT NULL,
	id_userINT(11) NOT NULL,
	PRIMARY KEY (id_user),
	FOREIGN KEY (id_user) REFERENCES user (id_user));


