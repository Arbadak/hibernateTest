CREATE TABLE country (
	citizenship_id INT NOT NULL AUTO_INCREMENT COMMENT 'Идентифиактор гражданства',
	citizenship_code VARCHAR(3) NOT NULL COMMENT 'Код страны' COLLATE 'utf8_bin',
	citizenship_name VARCHAR(60) NOT NULL COMMENT 'Наименование гражданства' COLLATE 'utf8_bin',
    PRIMARY KEY (citizenship_id));

CREATE TABLE doc (
	doc_id INT NOT NULL AUTO_INCREMENT COMMENT 'Идентификатор типа документа',
	doc_code VARCHAR(3) NOT NULL COMMENT 'Номер документа',
	doc_name VARCHAR(115) NOT NULL COMMENT 'Наименование документа' COLLATE 'utf8_bin',
    PRIMARY KEY (doc_id));

CREATE TABLE organization (
	org_id INT(11) NOT NULL AUTO_INCREMENT COMMENT 'Идентификатор организации',
	full_name VARCHAR(60) NOT NULL COMMENT 'Полное имя организации' COLLATE 'utf8_bin' ,
	inn INT(12) NOT NULL COMMENT 'ИНН организации',
	kpp INT(9) NOT NULL COMMENT 'КПП организации',
	short_name VARCHAR(30) COMMENT 'Сокращенное имя организации' COLLATE 'utf8_bin',
	PRIMARY KEY (org_id));

CREATE TABLE office (
	office_id INT(11) NOT NULL AUTO_INCREMENT COMMENT 'Идентификатор офиса',
	organization_id INT(11) NOT NULL COMMENT 'Идентификатор организации которой принадлежит офис',
	CONSTRAINT FK_link_organization FOREIGN KEY (organization_id) REFERENCES organization (org_id),
	INDEX IX_organizaton_organization_id (organization_id),
	phone INT(11) NULL DEFAULT NULL COMMENT 'Телефон офиса',
	address VARCHAR(100) NOT NULL COMMENT 'Адрес офиса' COLLATE utf8_bin,
	is_active BOOLEAN(4) DEFAULT NULL COMMENT 'Офис работает',
	is_main BOOLEAN(4) DEFAULT NULL COMMENT 'Головной офис',
 	PRIMARY KEY (office_id));

CREATE TABLE user (
	user_id INT NOT NULL AUTO_INCREMENT COMMENT 'Идентификатор пользователя',
	first_name VARCHAR(15) NOT NULL COMMENT 'Имя' COLLATE 'utf8_bin',
	second_name VARCHAR(15) COMMENT 'Отчество' COLLATE 'utf8_bin',
	last_name VARCHAR(15) COMMENT 'Фамилия' COLLATE 'utf8_bin',
	doc_id INT NOT NULL COMMENT 'Тип документа пользователя',
	 CONSTRAINT FK_link_doc FOREIGN KEY (doc_id) REFERENCES doc (doc_id),
	 INDEX IX_doc_doc_id (doc_id),
	citizenship_id INT NOT NULL COMMENT 'Гражданство',
	 CONSTRAINT FK_link_citizenship FOREIGN KEY (citizenship_id) REFERENCES country (citizenship_id),
	 INDEX IX_country_citizenship_id (citizenship_id),
	is_identified BOOLEAN DEFAULT NULL COMMENT 'Признак идентифицированности пользователя',
	binded_office INT NOT NULL COMMENT 'Занимаемый офис',
	 CONSTRAINT FK_link_office FOREIGN KEY (binded_office) REFERENCES office (office_id),
	 INDEX IX_office_office_id (office_id),
	 PRIMARY KEY (user_id));

CREATE TABLE doc_data (
	doc_date DATE NOT NULL COMMENT 'Дата выдачи документа',
	doc_number INT(10) NOT NULL COMMENT 'Номер документа',
	id_user INT(11) NOT NULL COMMENT 'Идентификатор пользователя которому принадлежит документ',
	CONSTRAINT FK_link_user FOREIGN KEY (id_user) REFERENCES `user` (id_user),
	PRIMARY KEY (id_user));

ALTER TABLE country COMMENT='Справочник кодов стран гражданства';
ALTER TABLE doc COMMENT='Справочник типов докуента';
ALTER TABLE organization COMMENT='Список организаций';
ALTER TABLE office COMMENT='Список офисов организации';
ALTER TABLE user COMMENT='Список работников офиса';
ALTER TABLE doc_data COMMENT='Данные документа пользователя';