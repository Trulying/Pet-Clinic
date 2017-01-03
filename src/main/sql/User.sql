USE my_base;
CREATE TABLE IF NOT EXISTS USER(
  user_id  BIGINT NOT NULL AUTO_INCREMENT,
  username VARCHAR(30) NOT NULL,
  password VARCHAR(255) NOT NULL,
  role VARCHAR(30),
  enabled BOOLEAN,
  owner_id BIGINT,
  PRIMARY KEY (user_id),
  UNIQUE(username),
  FOREIGN KEY(owner_id) REFERENCES Pet_Owner(id)
);