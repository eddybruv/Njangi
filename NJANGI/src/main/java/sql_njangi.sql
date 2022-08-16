CREATE TABLE Njangi (
    njangi_code VARCHAR(8) NOT NULL PRIMARY KEY,
	njangi_name LONGTEXT NOT NULL,
    njangi_password LONGTEXT NOT NULL
);

CREATE TABLE Njangi_User (
    user_id VARCHAR(8) NOT NULL PRIMARY KEY,
	user_name LONGTEXT NOT NULL,
    user_email LONGTEXT NOT NULL,
    user_password LONGTEXT NOT NULL
);

CREATE TABLE Transactions (
    transaction_id INT NOT NULL PRIMARY KEY,
	sender_id VARCHAR(8) NOT NULL,
    receiver_id VARCHAR(8) NOT NULL,
    amount_transfered BIGINT NOT NULL,
    time_sent timestamp NOT NULL,
    FOREIGN KEY (sender_id) REFERENCES Njangi_User(user_id),
    FOREIGN KEY (receiver_id) REFERENCES Njangi_User(user_id)
);

CREATE TABLE User_Accounts (
    account_id VARCHAR(8) NOT NULL,
    njangi_code TEXT NOT NULL,
    current_amount BIGINT NOT NULL,
    FOREIGN KEY (account_id) REFERENCES Njangi_User(user_id),
    FOREIGN KEY (njangi_code) REFERENCES Njangi(njangi_code),
    PRIMARY KEY (account_id, njangi_code)
);

CREATE TABLE Njangi_Accounts (
	njangi_code VARCHAR(8) NOT NULL,
    current_amount INT NOT NULL,
    contribution INT NOT NULL,
    max_members INT,
    FOREIGN KEY (njangi_code) REFERENCES Njangi(njangi_code)
);
