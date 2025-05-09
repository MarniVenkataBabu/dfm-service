


CREATE TABLE elements (
    id BIGINT PRIMARY KEY AUTO_INCREMENT,  
    type VARCHAR(50) NOT NULL,             
    label VARCHAR(100) NOT NULL        
);

CREATE TABLE properties (
    id BIGINT PRIMARY KEY AUTO_INCREMENT,  
    element_id BIGINT,                     
    key_name VARCHAR(100) NOT NULL,        
    value VARCHAR(255) NOT NULL,           
    FOREIGN KEY (element_id) REFERENCES elements(id) ON DELETE CASCADE
);
INSERT INTO elements (id, type, label) VALUES
(1, 'input', 'email'),
(2, 'checkbox', 'subscribe'),
(3, 'radio', 'gender');




INSERT INTO properties (element_id, key_name, value) VALUES
(1, 'type', 'text'),
(1, 'placeholder', 'Enter your username'),
(1, 'maxLength', '50'),
(1, 'minLength', '3'),
(1, 'required', 'true'),
(1, 'borderRadius', '5px'),
(1, 'borderColor', '#ccc'),
(1, 'fontSize', '14px'),
(1, 'width', '100%'),
(1, 'height', '40px'),
(1, 'backgroundColor', '#ffffff'),
(1, 'textColor', '#000000');


INSERT INTO properties (element_id, key_name, value) VALUES
(2, 'type', 'checkbox'),
(2, 'checked', 'false');


INSERT INTO properties (element_id, key_name, value) VALUES
(3, 'type', 'radio'),
(3, 'options', 'Male,Female,Other');
