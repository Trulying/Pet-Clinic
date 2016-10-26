USE My_base;
CREATE TABLE IF NOT EXISTS USER(
  user_id  BIGINT NOT NULL AUTO_INCREMENT,
  username VARCHAR(30) NOT NULL,
  password VARCHAR(30) NOT NULL,
  sole VARCHAR(30),
  hash VARCHAR(255),
  role VARCHAR(30),
  enabled BOOLEAN,
  owner_id BIGINT,
  PRIMARY KEY (user_id),
  UNIQUE(username),
  FOREIGN KEY(owner_id) REFERENCES Pet_Owner(id)
);

INSERT INTO
  USER (username, password, sole, hash, role, enabled, owner_id)
VALUES ("jas", "password", "sdfsdf", "sadf", "USER", true, 1);